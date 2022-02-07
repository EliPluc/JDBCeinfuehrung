package de.telekom.sea7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConfiguration {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/dbQuest";
		String user = "admin";
		String pass = "password";

		try {
			// Verbindung aufbauen
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
