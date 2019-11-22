package com.ustglobal.empapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeData() {

		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		//		FileReader reader = new FileReader("db.properties");
		//		Properties prop = new Properties();
		//		prop.load(reader);

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> beans = new ArrayList<EmployeeBean>();
			while (rs.next()) {

				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));

				beans.add(bean);
			}
			return beans;

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {

			try {

				if(conn != null) {

					conn.close();
				}
				if (stmt != null) {

					stmt.close();
				}
				if (rs != null) {

					rs.close();
				}
			} catch (Exception e) {

				e.printStackTrace();

			}

		} // end of try-catch-finally

	} // end of getAllEmployeeData() method

	// searchEmployeeData(int id) to get data for a specific employee
	public EmployeeBean searchEmployeeData(int id) {

		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}
			else {

				return null;
			}


		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {

			try {

				if (conn != null) {

					conn.close();
				}
				if (pstmt != null) {

					pstmt.close();
				}
				if (rs != null) {

					rs.close();
				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	} // end of searchEmployeeData()

	public void insertEmployeeData(int id, String name, int salary, String gender) {

		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, salary);
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			if (count > 0) {
				
				System.out.println(count+" row inserted.");
			}
			else {
				
				System.out.println("Insert data with new id.");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			
			try {
				
				if (conn != null) {
					
					conn.close();
				}
				if (pstmt != null) {
					
					pstmt.close();
				}
				
			} catch (Exception e) {

			e.printStackTrace();
				
			}
		}
	}

	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeData(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

} // end of class
