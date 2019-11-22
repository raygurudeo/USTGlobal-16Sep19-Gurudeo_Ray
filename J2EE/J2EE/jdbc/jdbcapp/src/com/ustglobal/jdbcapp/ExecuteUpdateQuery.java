package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class ExecuteUpdateQuery {

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

			//creating statement
			System.out.println("statement created");

			String sql = prop.getProperty("update-query");
			pstmt = conn.prepareStatement(sql);
			
			System.out.println("Enter details:");
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter salary : ");
			int salary = sc.nextInt();
			System.out.println("Enter gender : ");
			String gender = sc.next();
			
			pstmt.setString(1, name);
			pstmt.setInt(2, salary);
			pstmt.setString(3, gender);
			pstmt.setInt(4, id);
			
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
