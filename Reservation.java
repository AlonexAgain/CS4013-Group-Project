import java.util.StringTokenizer;

// Author: Darragh Walsh
// Student Number: 20244053
// This class...

/**
 * A Reservation
 */

public class Reservation {

    private String description;
    private CheckIODate date;
    private CheckIOTime from;
    private CheckIOTime till;
    

    public boolean fallsOn(CheckIODate x) {
        return (x.equals(date));
    }

    public String format() {
        String s = "Date: " + date.toString() + "\n" + "Time From: " + from.toString() + "\n" + "Time Till: " + till.toString() + "\n" + "Description: " + description;
        return s;
    }
    
    public Reservation(String s) {
        String[] input=s.split(" ");
        for(int i=0;i<input.length-3;i++){
            description+=input[i]+" ";
        }
        till = new CheckIOTime(input[input.length-1]);
        from = new CheckIOTime(input[input.length-2]);
        date = new CheckIODate(input[input.length-3]);
    }
    
    
    
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Reservation)){
            return false;
        }
        else if(this==obj){
            return true;
        }
        Reservation x = ((Reservation)obj);
        return (x.date.equals(date) && x.from.equals(from) && x.till.equals(till));
    }
    
    
    
    /*
     *variables for the customer details     
     */
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	
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
	 * An overrided toString() method to format the customers information0
	 */
	
	@Override
	public String toString() {
		return "First Name: " + this.firstName + "\n"
				+ "Last Name: " + this.lastName + "\n"
				+ "Phone Number: " + this.phoneNo + "\n"
				+ "Email: " + this.email + "\n";
	}
	
}