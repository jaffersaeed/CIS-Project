package flightreservation;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class flight {
	
	private int flightNumber;
	private String departureCity;
	private String departureDate;
	private String destinationCity; 
	private int capacity;
	private int passengerCount;
	

	// no argument constructor
	public void Flight() {
		
	}
	
	// Constructor
	public flight(int flightNumber, String departureCity, String departureDate,
			String destinationCity, int capacity,int passengerCount) {
		super();
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.departureDate = departureDate;
		this.destinationCity = destinationCity;
		this.capacity = capacity;
		this.passengerCount = passengerCount;
	}
	

	public String createFlight() {
		try {
		//	Messenger(this.flightNumber, this.departureCity, this.departureDate,
					this.destinationCity, this.capacity, passengerCount);
		}
		catch (SQLException sql) {
			return sql.getMessage() + "Flight not registered";
		}
		catch (Exception e) {
			return e.getMessage() + "Flight not registered";
		}
		
		return "Flight successfully registered";
	}

	//getter
	public int getFlightNumber() {
		return flightNumber;
	}

	//setter
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	//getter
	public String getDepartureCity() {
		return departureCity;
	}

	//setter
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	
}
