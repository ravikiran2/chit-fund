package com.regnant.organiser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.regnant.admin.OrganiserBean;

public class DBCRUDOperations {

	public int AddSchemeA(SchemeBean sb) {
		int rows_insert = 0;
		PreparedStatement pstmt;
		Connection connection = DBConnection.getDBConnection();

		try {

			String insert = "insert into the_smart_chits.Scheme_a values(?,?,?,?,?,?,?)";
			pstmt = connection.prepareStatement(insert);
			pstmt.setInt(1, sb.getId());
			pstmt.setString(2, sb.getName());
			pstmt.setString(3, sb.getSchemeType());
			pstmt.setString(4, sb.getMonthsPaid());
			pstmt.setString(5, sb.getMonthsPending());
			pstmt.setString(6, sb.getStatus());
			pstmt.setString(7, sb.getPassword());
			rows_insert = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("SQL Exception in adding schemeA details(DBCRUD)");
			e.printStackTrace();
		}
		return rows_insert;

	}

	public int AddSchemeB(SchemeBean sb) {
		int rows_insert = 0;
		PreparedStatement pstmt;
		Connection connection = DBConnection.getDBConnection();

		try {

			String insert = "insert into the_smart_chits.Scheme_b values(?,?,?,?,?,?,?)";
			pstmt = connection.prepareStatement(insert);
			pstmt.setInt(1, sb.getId());
			pstmt.setString(2, sb.getName());
			pstmt.setString(3, sb.getSchemeType());
			pstmt.setString(4, sb.getMonthsPaid());
			pstmt.setString(5, sb.getMonthsPending());
			pstmt.setString(6, sb.getStatus());
			pstmt.setString(7, sb.getPassword());
			rows_insert = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("SQL Exception in adding schemeB details(DBCRUD)");
			e.printStackTrace();
		}
		return rows_insert;

	}

	public int AddSchemeC(SchemeBean sb) {
		int rows_insert = 0;
		PreparedStatement pstmt;
		Connection connection = DBConnection.getDBConnection();

		try {

			String insert = "insert into the_smart_chits.Scheme_c values(?,?,?,?,?,?,?)";
			pstmt = connection.prepareStatement(insert);
			pstmt.setInt(1, sb.getId());
			pstmt.setString(2, sb.getName());
			pstmt.setString(3, sb.getSchemeType());
			pstmt.setString(4, sb.getMonthsPaid());
			pstmt.setString(5, sb.getMonthsPending());
			pstmt.setString(6, sb.getStatus());
			pstmt.setString(7, sb.getPassword());
			rows_insert = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("SQL Exception in adding schemeC details(DBCRUD)");
			e.printStackTrace();
		}
		return rows_insert;

	}

	public static int insertCustomers(CustomerBean c) {

		Connection con = DBConnection.getDBConnection();
		int noOfRowsInserted = 0;
		String addcustomers = "insert into the_smart_chits.customerdetails values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = con.prepareStatement(addcustomers);
			psmt.setInt(1, c.getcustomerId());
			psmt.setString(2, c.getfirstname());
			psmt.setString(3, c.getlastname());
			psmt.setString(4, c.getage());
			psmt.setString(5, c.getgender());
			psmt.setString(6, c.getcontactno());
			psmt.setString(7, c.getmailID());
			psmt.setString(8, c.getAddress());
			psmt.setString(9, c.getSchemeType());
			noOfRowsInserted = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return noOfRowsInserted;
	}

	public static int updateSchemeA(SchemeBean s) {

		Connection con = DBConnection.getDBConnection();
		int noOfRowsUpdated = 0;
		String updatecustomers = "update the_smart_chits.Scheme_a set monthsPaid=?,monthsPending=? where CustomerId=?";
		try {
			PreparedStatement psmt = con.prepareStatement(updatecustomers);
			psmt.setString(1, s.getMonthsPaid());
			psmt.setString(2, s.getMonthsPending());
			psmt.setInt(3, s.getId());
			noOfRowsUpdated = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return noOfRowsUpdated;

	}

	public static int updateSchemeB(SchemeBean s) {

		Connection con = DBConnection.getDBConnection();
		int noOfRowsUpdated = 0;
		String updatecustomers = "update the_smart_chits.Scheme_b set monthsPaid=?,monthsPending=? where CustomerId=?";
		try {
			PreparedStatement psmt = con.prepareStatement(updatecustomers);
			psmt.setString(1, s.getMonthsPaid());
			psmt.setString(2, s.getMonthsPending());
			psmt.setInt(3, s.getId());
			noOfRowsUpdated = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return noOfRowsUpdated;

	}

	public static int updateSchemeC(SchemeBean s) {

		Connection con = DBConnection.getDBConnection();
		int noOfRowsUpdated = 0;
		String updatecustomers = "update the_smart_chits.Scheme_c set monthsPaid=?,monthsPending=? where CustomerId=?";
		try {
			PreparedStatement psmt = con.prepareStatement(updatecustomers);
			psmt.setString(1, s.getMonthsPaid());
			psmt.setString(2, s.getMonthsPending());
			psmt.setInt(3, s.getId());
			noOfRowsUpdated = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return noOfRowsUpdated;

	}

	public static List<SchemeBean> getSchemeATable() {
		Connection connection = DBConnection.getDBConnection();
		List<SchemeBean> rows = new ArrayList<>();
		try {
			String selectQuery = "select * from scheme_a";
			PreparedStatement psmt = connection.prepareStatement(selectQuery);
			ResultSet rs = psmt.executeQuery();
			// System.out.println("qeqwertyu");
			while (rs.next()) {
				// System.out.println(rs.getInt(1));
				SchemeBean b = new SchemeBean();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setSchemeType(rs.getString(3));
				b.setMonthsPaid(rs.getString(4));
				b.setMonthsPending(rs.getString(5));
				b.setStatus(rs.getString(6));
				b.setPassword(rs.getString(7));
				rows.add(b);
				// System.out.println(b.status + "%%%%%%%");
			}

			connection.close();
		} catch (SQLException e) {
			System.out.println("sql exception in retrive");
			e.printStackTrace();
		}
		return rows;
	}

	public static void main(String[] args) {

		List<SchemeBean> test = DBCRUDOperations.getSchemeATable();
		for (SchemeBean res : test) {
			System.out.println(res.getId() + "\t" + res.getName());
		}
	}

	public static boolean checkOrganiser(OrganiserBean o) {

		Connection con = DBConnection.getDBConnection();
		String checkquery = "select * from the_smart_chits.organisers_table where (Id=? and Password=?) and Scheme=?";
		try {
			PreparedStatement psmt = con.prepareStatement(checkquery);
			psmt.setInt(1, o.getId());
			psmt.setString(2, o.getPassword());
			psmt.setString(3, o.getScheme());
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
