package com.regnant.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CRUDoperations {

	public static int insertOrganisers(OrganiserBean o) {

		Connection con = DBConnection.getDBConnection();
		int noOfRowsInserted = 0;

		String insert = "insert into the_smart_chits.Organisers_table values(?,?,?,?)";

		PreparedStatement pstm;
		try {
			pstm = con.prepareStatement(insert);
			pstm.setInt(1, o.getId());
			pstm.setString(2, o.getName());
			pstm.setString(3, o.getPassword());
			pstm.setString(4, o.getScheme());
			noOfRowsInserted = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return noOfRowsInserted;

	}

}
