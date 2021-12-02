package com.bilgeadam.boost.java.course01.lesson42;

import java.sql.*;

public class InsertIntoDatabase {

	public static void main(String[] args) {
		Connection conn = DatabaseHelper.getInstance().getConnection();
		try {
			Statement stmt = conn.createStatement();
//			int affected = stmt.executeUpdate("INSERT INTO categories (categoryid, categoryname, description) "
//					+ "VALUES (9, 'Hırdavat', 'çeşitli hırdavat mamülleri');");
			int affected = stmt.executeUpdate("DELETE FROM categories WHERE categoryid=9");
			if (affected > 0) {
				System.out.println("success");
			}
		}
		catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}

}
