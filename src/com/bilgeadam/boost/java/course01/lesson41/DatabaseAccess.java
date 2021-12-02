package com.bilgeadam.boost.java.course01.lesson41;

import java.sql.*;

public class DatabaseAccess {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/northwind";
		
		try (Connection con = DriverManager.getConnection(url, "boost", "boost");) {
			Statement stmt = con.createStatement();
			selectFromEmployees(stmt);
			updateEmployeeByID(stmt, 5);
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void updateEmployeeByID(Statement stmt, int id) throws SQLException {
		int affected = stmt.executeUpdate("UPDATE employees SET address='14 Garrett Hill	' WHERE employeeid=" + id);
		System.out.println("Değiştirien satır adedi: " + affected);
	}

	private static void selectFromEmployees(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("SELECT * FROM employees;");
		while (rs.next()) {
			int id = rs.getInt("employeeid");
			System.out.println(id + " - " + rs.getString(2) + " " + rs.getString("firstname"));
			// ya kolon numarası (birden başlayarak) ya da kolon adı ile bilgiler çekilir
		}
	}

}
