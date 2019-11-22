package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class ExecuteInsertQuery {

	public static void main(String[] args) {

		Connection conn = null;
//		Statement stmt = null;
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
			System.out.println("connection done");
			
			
//			stmt = conn.createStatement();
			System.out.println("statement created");
			System.out.println("Enter details:");
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter salary : ");
			int salary = sc.nextInt();
			System.out.println("Enter gender : ");
			String gender = sc.next();
			
			// 2nd step
			String query = prop.getProperty("insert-query");
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, 18000);
			pstmt.setString(4, gender);
			
//			3rd step
//			int count = stmt.executeUpdate(query);
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("Data inserted");
			}
		}
		catch (SQLException | ClassNotFoundException | IOException e) {

			e.printStackTrace();
		}
		finally {

			try {

				// 4th step
				if(conn != null) {

					conn.close();
				}
//				if(stmt != null) {
//
//					stmt.close();
//				}
				if(pstmt != null) {

					pstmt.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
