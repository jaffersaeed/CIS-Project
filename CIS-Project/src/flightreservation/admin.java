package flightreservation;

import flightreservation.User;

public abstract class admin extends User {

	public admin( String username, String password, String userType, String firstName, String lastName,
			String address, String city, String state, String zipCode, String email, String ssn, 
			String securityQuestion, String securityAnswer) {
		
		super(username, password, userType, firstName, lastName, address, city, state, zipCode, email, ssn,
				securityQuestion, securityAnswer);
	}
	

}