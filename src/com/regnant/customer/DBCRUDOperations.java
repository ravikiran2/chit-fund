package com.regnant.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBCRUDOperations {

	public static boolean checkloginA(SchemeBean sb) {
		Connection connection = DBConnection.getDBConnection();
		PreparedStatement pstmt;

		try {
			String query = "select * from Scheme_a where CustomerId=? and Password=?";
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, sb.getId());
			pstmt.setString(2, sb.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}
	
	public static boolean checkloginB(SchemeBean sb) {
		Connection connection = DBConnection.getDBConnection();
		PreparedStatement pstmt;

		try {
			String query = "select * from Scheme_b where CustomerId=? and Password=?";
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, sb.getId());
			pstmt.setString(2, sb.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public static boolean checkloginC(SchemeBean sb) {
		Connection connection = DBConnection.getDBConnection();
		PreparedStatement pstmt;

		try {
			String query = "select * from Scheme_c where CustomerId=? and Password=?";
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, sb.getId());
			pstmt.setString(2, sb.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}
	public static List<SchemeBean> customerLoginA(SchemeBean cb) {
		Connection connection = DBConnection.getDBConnection();
		List<SchemeBean> customer = new ArrayList<>();

		PreparedStatement pstmt;
		ResultSet rs;
		try {
			String selectQuery = "select * from Scheme_a where CustomerId = ? and Password=?";
			pstmt = connection.prepareStatement(selectQuery);
			pstmt.setInt(1, cb.getId());
			pstmt.setString(2, cb.getPassword());

			rs = pstmt.executeQuery();

			System.out.println(cb.getId() + "@@@@@@@@");

			while (rs.next()) {
				SchemeBean cb1 = new SchemeBean();
				cb1.setId(rs.getInt(1));
				cb1.setName(rs.getString(2));
				cb1.setSchemeType(rs.getString(3));
				cb1.setMonthsPaid(rs.getString(4));
				cb1.setMonthsPending(rs.getString(5));
				cb1.setStatus(rs.getString(6));
				customer.add(cb1);
				System.out.println(cb1.getId() + "%%%%%%%");
			}

			connection.close();
		} catch (SQLException e) {
			System.out.println("sql exception in retrive");
			e.printStackTrace();
		}
		return customer;
	}
	
	
	public static List<SchemeBean> customerLoginB(SchemeBean cb) {
		Connection connection = DBConnection.getDBConnection();
		List<SchemeBean> customer = new ArrayList<>();

		PreparedStatement pstmt;
		ResultSet rs;
		try {
			String selectQuery = "select * from Scheme_b where CustomerId = ? and Password=?";
			pstmt = connection.prepareStatement(selectQuery);
			pstmt.setInt(1, cb.getId());
			pstmt.setString(2, cb.getPassword());

			rs = pstmt.executeQuery();

			System.out.println(cb.getId() + "@@@@@@@@");

			while (rs.next()) {
				SchemeBean cb1 = new SchemeBean();
				cb1.setId(rs.getInt(1));
				cb1.setName(rs.getString(2));
				cb1.setSchemeType(rs.getString(3));
				cb1.setMonthsPaid(rs.getString(4));
				cb1.setMonthsPending(rs.getString(5));
				cb1.setStatus(rs.getString(6));
				customer.add(cb1);
				System.out.println(cb1.getId() + "%%%%%%%");
			}

			connection.close();
		} catch (SQLException e) {
			System.out.println("sql exception in retrive");
			e.printStackTrace();
		}
		return customer;
	}

	
	public static List<SchemeBean> customerLoginC(SchemeBean cb) {
		Connection connection = DBConnection.getDBConnection();
		List<SchemeBean> customer = new ArrayList<>();

		PreparedStatement pstmt;
		ResultSet rs;
		try {
			String selectQuery = "select * from Scheme_c where CustomerId = ? and Password=?";
			pstmt = connection.prepareStatement(selectQuery);
			pstmt.setInt(1, cb.getId());
			pstmt.setString(2, cb.getPassword());

			rs = pstmt.executeQuery();

			System.out.println(cb.getId() + "@@@@@@@@");

			while (rs.next()) {
				SchemeBean cb1 = new SchemeBean();
				cb1.setId(rs.getInt(1));
				cb1.setName(rs.getString(2));
				cb1.setSchemeType(rs.getString(3));
				cb1.setMonthsPaid(rs.getString(4));
				cb1.setMonthsPending(rs.getString(5));
				cb1.setStatus(rs.getString(6));
				customer.add(cb1);
				System.out.println(cb1.getId() + "%%%%%%%");
			}

			connection.close();
		} catch (SQLException e) {
			System.out.println("sql exception in retrive");
			e.printStackTrace();
		}
		return customer;
	}
}
