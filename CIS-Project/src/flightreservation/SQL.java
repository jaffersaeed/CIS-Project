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
	public static String[] getUser(String username) throws SQLException {

		SQL c = new SQL();

		c.connection = DriverManager.getConnection("database adress");
		String[] user = new String[14];

		String query = "Select * from User where username=?";

		PreparedStatement statement = c.connection.prepareStatement(query);

		statement.setString(1, username);

		ResultSet result = statement.executeQuery();

		if (result.next()) {
			user[0] = result.getString(1);
			user[1] = result.getString(2);
			user[2] = result.getString(3);
			user[3] = result.getString(4);
			user[4] = result.getString(5);
			user[5] = result.getString(6);
			user[6] = result.getString(7);
			user[7] = result.getString(8);
			user[8] = result.getString(9);
			user[9] = result.getString(10);
			user[10] = result.getString(11);
			user[11] = result.getString(12);
			user[12] = result.getString(13);
			user[13] = result.getString(14);
		}

		c.connection.close();

		return user;

	}
	public static String getUsername(String userName) throws SQLException {

		SQL c = new SQL();

		c.connection = DriverManager.getConnection("database address");

		String query = "Select username from User where username=?";

		PreparedStatement statement = c.connection.prepareStatement(query);

		statement.setString(1, username);

		ResultSet result = statement.executeQuery();
		
		String data = "";

		if (result.next()) {
			data = result.getString(1);
		}

		c.connection.close();

		return data;

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

	public static void createFlight(int flightNumber, String departureCity, String departureDate,
			String destinationCity, int capacity, int passengerCount) throws SQLException {

		SQL c = new SQL();

		c.connection = DriverManager.getConnection("database adress");

		String query = "insert into Flight values (?,?,?,?,?,?)";
		PreparedStatement statement = c.connection.prepareStatement(query);
		statement.setInt(1, flightNumber);
		statement.setString(2, departureCity);
		statement.setString(3, departureDate);
		statement.setString(4, destinationCity);
		statement.setInt(5, capacity);
		statement.setInt(6, passengerCount);

		statement.executeUpdate();

		c.connection.close();

	}
	
	/** method deletes a Flight */
	public static void deleteFlight(int flightNumber) {

		try {
			
		SQL c = new SQL();

		c.connection = DriverManager.getConnection("database adress");

		String query = "delete from Flight where flightNumber = ?";
		PreparedStatement statement = c.connection.prepareStatement(query);
		statement.setInt(1, flightNumber);

		statement.executeUpdate();

		c.connection.close();
		
		}
		catch(SQLException sql) {
			
		}
		catch(Exception e) {
			
		}

	}

}