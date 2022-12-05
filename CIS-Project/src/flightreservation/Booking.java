package flightreservation;

import java.sql.SQLException;
import java.util.Date;

import reservation.data.Messenger;

public class Booking {

	private int bookingNumber; 
	private String dateCreated; 
	private String username;
	private int flightNumber; 
	private String departureDate; 
	private static int bookingCount;
	public String result;
	
	
	//No argument constructor creates a default reservation that can be altered eventually
	public Booking() {
		this("Username not found!", 0, "Not found",0);
	}
	
	public Booking(String string, int i, String string2, int j) {

	}

	//Constructor creates a Reservation object with user input
	public Booking(String username, String departureDate, int ticketNumber, int flightNumber) {
		int lastCount = Check.getbookingCount();
		bookingCount = ++lastCount;
		this.flightNumber = bookingCount;
		this.dateCreated = new Date().toString();
		this.username = username;
		this.flightNumber = flightNumber;
		this.departureDate = departureDate;
		this.flightNumber = flightNumber;
		this.result = createBooking();
		Check.setbookingCount(bookingCount);
	}
	
	//Constructor creates a Reservation object with user input
	public Booking( String dateCreated, String username, int busNumber, String
			departureDate, int ticketNumber, int flightNumber) {
		this.flightNumber = flightNumber;
		this.dateCreated = dateCreated;
		this.username = username;
		this.flightNumber = busNumber;
		this.departureDate = departureDate;
		this.flightNumber = ticketNumber;
	}
	
	// method stores this reservation in the database
	public String createBooking() {
		String output = "";// a string to save the result of this update
		try {// call database and save response in output
			output = Messenger.createReservation(this.flightNumber, this.dateCreated, this.username,
					this.flightNumber, this.departureDate, this.flightNumber);
		} catch (SQLException sql) {
			output = sql.getMessage();// save any error message in output
		} catch (Exception e) {
			output = e.getMessage();// save any error message in output
		}

		return output;
	}

	public int getBookingNumber() {
		return flightNumber;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public String getUsername() {
		return username;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public String getDepartureDate() {
		return departureDate;
	}


	public static int getBookingCount() {
		return bookingCount;
	}

	public void setBookingNumber(int bookingNumber) {
		this.flightNumber = bookingNumber;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public static void setBookingCount(int bookingCount) {
		Booking.bookingCount = bookingCount;
	}

}
