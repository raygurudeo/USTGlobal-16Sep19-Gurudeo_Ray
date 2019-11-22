package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DynamicSelectQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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

			// step 2
			String query = prop.getProperty("select-query-with-id");
			pstmt = conn.prepareStatement(query);

			System.out.print("Enter emlpoyee id : ");
			int id = sc.nextInt();
			pstmt.setInt(1, id);

			//step 3
			rs = pstmt.executeQuery();
			if(rs.next()) {

				int empId = rs.getInt(1);
				String name = rs.getString(2);
				int salary = rs.getInt(3);
				String gender = rs.getString(4);

				System.out.println("ID : "+empId);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+salary);
				System.out.println("Gender : "+gender);
			}


		} catch (SQLException | ClassNotFoundException | IOException e) {

			e.printStackTrace();
		}
		finally {

			try {

				// step 4
				if(conn != null) {

					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}	// main ended

	}	// DynamicSelectQuery ended

}
