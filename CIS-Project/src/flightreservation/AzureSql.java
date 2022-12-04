package flightreservation;

import java.sql

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLExceptions;

public class AzureSql {
	public static void main(String[] args) {
		System.out.println("performing setup...");
		
		String userName = "CloudSAd2cc1c94@flightres";
		String userPassword = "";
		String cnnString=
				/**'"jdbc:sqlserver: "
				+ "database-CRUFTY;"
				+ "user=" + userName + ";"
				+ "password=" + userPassword + ";"
				+ "encrypt=true;"
				+"trustServerCertificate=fasle;"
				+ "loginTimeout=30;";**/
		
		
		
				"jdbc:sqlserver:"
				+ "//flightres.database.windows.net:1433;"
				+"database=Data;"
				+"user=" + userName + ";"
				+"password=" + userPassword + ";"
				+"encrypt=true;"
				+"trustServerCertificate=false;"
				+"hostNameInCertificate=*.database.windows.net;"
				+"loginTimeout=30;";
	
		AzureSql azure = new AzureSql();
		System.out.println("connecting..");
		String sql = "Select ID, CandyType, CandyName, CandyPrice From CANDY;";
		azure.SelectAzureSQL(userName, userPassword, sql, cnnString);
		sql ="Insert Into CANDY (CandyType, CandyPrice)"
				+ " Values ('Chocolate', 'White Choclate Bars', 23.10):";
		azure.ExecuteAzureSQL(userName, userPassword, sql, cnnString);
		
		
	}
	
	private void SelectAzureSQL(String userName, String userPassword, String sql, String cnnStr) {
		System.out.println("selecting data..");
		ResultSet resultSet = null;
		try(Connection cnn = DriverManager.getConnection(cnnStr);
				Statement statement = cnn.createStatement();) {
			resultSet = statement.executeQuery(sql);
			while resultSet.next()) {
				System.out.println(resultSet.getString(1) + "' " + resultSet.getString(2) + "'" + resultSet.getString(3));
			}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			}
		
			
	private void ExecuteAzureSQL(String userNAme, String userPassword, String cnnStr) {
		System.out.println("executing SQL statement..");
		try(Connection cnn = DriverManager.getConnection(cnnStr);
				PreparedStatement statement = cnn.prepareStatement(sql, Statement RETURN GENERATED KEYS))
			ResultSet resultSet = null;
			statement.execute();
			resultSet = statement.getGeneratedKeys();
			while (result.next()) {
				System.out.print("key(s): ") + resultSet.getString(1);
			}
				
		catch (SQLException e) {
			e.printStackTrace();
			
		}
	}		

}
