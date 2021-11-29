package team18.cs4013;

public class Customer {
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	
	/* Create the constructor for a customer
	 * A customer must have a first and last name, an email and a phone number
	 */
	public Customer(String firstName, String lastName, String phoneNo, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	/*
	 *Create the set and get operators for each parameter  
	 */
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * An overrided toString() method to format the customers information
	 */
	
	@Override
	public String toString() {
		return "First Name: " + this.firstName + "\n"
				+ "Last Name: " + this.lastName + "\n"
				+ "Phone Number: " + this.phoneNo + "\n"
				+ "Email: " + this.email + "\n";
	}
	
}
