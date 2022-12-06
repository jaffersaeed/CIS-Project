package flightreservation;

import javafx.collections.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SQL{
	public static String createUser(String userName, String password, String type, String firstName,
			String lastName, String address, String city, String state, String zipCode, String phoneNumber,String email,
			String ssn, String securityQ, String securityA) throws SQLException {

		SQL c = new SQL();

		c.connection = DriverManager.getConnection("database adress");

		String query = "insert into User values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = c.connection.prepareStatement(query);
		statement.setString(1, userName);
		statement.setString(2, password);
		statement.setString(3, type);
		statement.setString(4, firstName);
		statement.setString(5, lastName);
		statement.setString(6, address);
		statement.setString(7, city);
		statement.setString(8, state);
		statement.setString(9, zipCode);
		statement.setString(10, phoneNumber);
		statement.setString(11, email);
		statement.setString(12, ssn);
		statement.setString(13, securityQ);
		statement.setString(14, securityA);

		statement.executeUpdate();

		c.connection.close();

		return "Account created successfully";

	}
	public static String getCity(int zipCode) throws SQLException {

		SQL c = new SQL();

		c.connection = DriverManager.getConnection("database adress");

		String city = "";
		String query = "select city from zip where zipCode = ?";
		PreparedStatement statement = c.connection.prepareStatement(query);
		statement.setInt(1, zipCode);
		ResultSet result = statement.executeQuery();

		if (result.next()) {
			city = result.getString(1);
		}

		c.connection.close();

		return city;
	}
	
	
}