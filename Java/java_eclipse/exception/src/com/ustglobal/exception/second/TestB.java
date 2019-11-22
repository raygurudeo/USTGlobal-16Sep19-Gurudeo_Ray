package com.ustglobal.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {

	public static void main(String[] args) {

		FileTest ft = new FileTest();
		try {

			try {

				try {
					
					ft.open();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			catch(ClassNotFoundException ce) {

				ce.printStackTrace();
			}

		} catch (IOException e) {

			System.out.println("Directory not found");
		}
	}

}
