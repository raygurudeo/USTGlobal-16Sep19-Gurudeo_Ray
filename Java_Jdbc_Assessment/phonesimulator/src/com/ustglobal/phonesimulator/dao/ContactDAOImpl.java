package com.ustglobal.phonesimulator.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.phonesimulator.dto.ContactBean;

public class ContactDAOImpl implements ContactDAO {

	@Override
	public List<ContactBean> getAllContacts() {
		
		String url = "jdbc:mysql://localhost:3306/contactfile";
		String driverclass = "com.mysql.jdbc.Driver";
		String sql = "select * from contact";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName(driverclass);
			System.out.println("driver loaded");
			conn = DriverManager.getConnection(url,"root","root");
			System.out.println("con created");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<ContactBean> beans = new ArrayList<ContactBean>();
			while (rs.next()) {

				ContactBean bean = new ContactBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getLong("number"));
				bean.setGroups(rs.getString("groups"));

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
		
		
	} // end of getAllContacts()

	@Override
	public ContactBean searchContact(String name) {
		
		String url = "jdbc:mysql://localhost:3306/contactfile";
		String driverclass = "com.mysql.jdbc.Driver";
		String sql = "select * from contact where name=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,"root","root");

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				ContactBean bean = new ContactBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroups(rs.getString("groups"));
				
				return bean;
			}
			else {
				return null;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;

		} finally {

			try {

				if(conn != null) {

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
	}

	@Override
	public void addContact() {
		
		String url = "jdbc:mysql://localhost:3306/contactfile";
		String driverclass = "com.mysql.jdbc.Driver";
		String sql = "insert into contact values(?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,"root","root");

			pstmt = conn.prepareStatement(sql);
			System.out.println("Enter a name:");
			String name = sc.next();
			System.out.println("Enter phone number:");
			int number = sc.nextInt();
			System.out.println("Enter group name:");
			String grpname = sc.next();
			pstmt.setString(1, name);
			pstmt.setInt(2, number);
			pstmt.setString(3, grpname);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("Contact added");
			}
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if(conn != null) {

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
		
	}

	@Override
	public void deleteContact() {
		String url = "jdbc:mysql://localhost:3306/contactfile";
		String driverclass = "com.mysql.jdbc.Driver";
		String sql = "delete from contact where name=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,"root","root");

			pstmt = conn.prepareStatement(sql);
			System.out.println("Enter a name to delete:");
			String name1 = sc.next();
			pstmt.setString(1, name1);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("Contact deleted");
			}
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if(conn != null) {

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
		
	}

	@Override
	public void editContact() {
		String url = "jdbc:mysql://localhost:3306/contactfile";
		String driverclass = "com.mysql.jdbc.Driver";
		String sql = "update contact set number=?, groups=? where name=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,"root","root");

			pstmt = conn.prepareStatement(sql);
			System.out.println("Enter a phone number:");
			int phone = sc.nextInt();
			System.out.println("Enter group name:");
			String grpname = sc.next();
			System.out.println("Enter name:");
			String name1 = sc.next();
			pstmt.setInt(1, phone);
			pstmt.setString(2, grpname);
			pstmt.setString(3, name1);
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			if(result>0) {
				System.out.println("Contact edited");
			}
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if(conn != null) {

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
		
	}

}
