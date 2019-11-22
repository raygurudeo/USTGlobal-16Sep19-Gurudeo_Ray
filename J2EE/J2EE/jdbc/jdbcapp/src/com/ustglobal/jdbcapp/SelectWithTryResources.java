package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {

	public static void main(String[] args) {

		// Creating FileReader object
		try(FileReader reader = new FileReader("db.properties")) {
			
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverUrl"));
			String url = prop.getProperty("url");
			String query = prop.getProperty("select-query");
			
			// Establishing connection and creating connection
			try(Connection conn = DriverManager.getConnection(url, prop);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query)) {
				
				// Fetching all records
				while(rs.next()) {
					
					System.out.println("ID : "+rs.getInt(1));
					System.out.println("Name : "+rs.getString(2));
					System.out.println("Salary : "+rs.getInt(3));
					System.out.println("Gender : "+rs.getString(4));
					System.out.println("----------------");
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	// end of main()

}	// end of class
