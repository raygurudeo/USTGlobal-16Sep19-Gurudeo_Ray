package com.ustglobal.exception.second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileTest {

	void open() throws IOException, ClassNotFoundException, SQLException {
		
		File f = new File("R://a.txt");
		f.createNewFile();
		
		try {
			
			Class.forName("com.a");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
}
