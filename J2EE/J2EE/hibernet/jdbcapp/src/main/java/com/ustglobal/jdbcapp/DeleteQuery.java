package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DeleteQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		FileReader reader = null;

		try {

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);


			// Step-1	register driver
			Class.forName(prop.getProperty("driverUrl"));

			// Step-2	get the connection
			conn = DriverManager.getConnection(prop.getProperty("url"),prop);	
			System.out.println("Connection created");

			//creating statement
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			System.out.println("statement created");

			System.out.print("Enter emlpoyee id : ");
			int id = sc.nextInt();
			pstmt.setInt(1, id);

			int count = pstmt.executeUpdate();
			//			System.out.println(count);
			if(count > 0) {

				System.out.println("Data updated");
			}
		} catch (SQLException | ClassNotFoundException | IOException e) {

			e.printStackTrace();
		}
		finally {

			try {

				if(conn != null) {

					conn.close();
				}
				if(pstmt != null) {

					pstmt.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
