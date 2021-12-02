package com.bilgeadam.boost.java.course01.lesson42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	
	private static DatabaseHelper instance = null;
	
	private final String URL;
	private Connection   conn;
	
	private DatabaseHelper () {
		super();
		this.URL = "jdbc:postgresql://localhost:5432/northwind?user=boost&password=boost";
		this.conn = null;
	}
	
	public static DatabaseHelper getInstance () {
		if (DatabaseHelper.instance == null) {
			DatabaseHelper.instance = new DatabaseHelper();
		}
		return DatabaseHelper.instance;     // normal kullanımdaki new DatabaseHelper();'ı çağırmış gibi 
	}
	
	public Connection getConnection() {
		if (this.conn == null) {			// ==> lazy instantination: eğer değişkenin değeri null ise 
			try {							// ==> yeni bir nesne oluştur ve değişkene ata
				this.conn = DriverManager.getConnection(this.URL);
			}
			catch (SQLException ex) {
				System.err.println(ex.getMessage());
			}
		}
		return this.conn;					// ==> null değilse oluşmuş nesneyi döndür
	}
}
