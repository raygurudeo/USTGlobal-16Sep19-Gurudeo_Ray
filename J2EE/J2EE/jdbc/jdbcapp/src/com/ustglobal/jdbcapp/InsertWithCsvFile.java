package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithCsvFile {

	public static void main(String[] args) {

		// Starting of try() with resources form(java 1.7)
		// Reading db.properties file
		try(FileReader reader1 = new FileReader("db.properties")) {

			// Fetching data from db.properties file
			Properties prop = new Properties();
			prop.load(reader1);
			// Loading Driver class
			Class.forName(prop.getProperty("driverUrl"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("insert-query");

			// Reading csv.txt file and getting connection
			try(FileReader in = new FileReader("csv.txt");
					BufferedReader reader = new BufferedReader(in);
					Connection conn = DriverManager.getConnection(url,prop);
					PreparedStatement pstmt = conn.prepareStatement(sql)) {

				// Iterating all the rows of data from csv.txt file and setting data to query
				while(reader.ready()) {

					// Reading data
					String line  = reader.readLine();
					String[] datas = line.split(",");

					int id = Integer.parseInt(datas[0]);
					String name = datas[1];
					int salary = Integer.parseInt(datas[2]);
					String gender = datas[3];

					// Setting field into SQL query
					pstmt.setInt(1, id);
					pstmt.setString(2, name);
					pstmt.setInt(3, salary);
					pstmt.setString(4, gender);

					// Adding all rows of data from csv.txt file to batch
					pstmt.addBatch();
				}
				// Executing batch which contains all rows of data of csv.txt file
				int[] counts = pstmt.executeBatch();
				System.out.println(counts.length+" rows inserted");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}	// End of main()

}	// End of class
