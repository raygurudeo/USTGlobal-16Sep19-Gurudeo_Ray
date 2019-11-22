package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			// Step-1	register driver
			Class.forName(prop.getProperty("driverUrl"));

			// Step-2	get the connection
			conn = DriverManager.getConnection(prop.getProperty("url"),prop);

			// Issue SQL Query
			String sql = prop.getProperty("select-query");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// Step-4 Read the result
			while(rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+salary);
				System.out.println("Gender : "+gender);
				System.out.println("-----------------");
			}

		}catch (SQLException | ClassNotFoundException | IOException e) {

			e.printStackTrace();

		} finally {

			// Step-5 Close all the JDBC objects
			try {

				if(conn != null) {

					conn.close();
				}
				if(stmt != null) {

					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}	//End of main()
}
