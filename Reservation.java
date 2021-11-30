import java.util.Scanner;
import java.util.Random;

public class Reservation {

	/*
	 * Variables for the user details
	 */
	private String name;
	private String email;
	private String phoneNo;
	
	
	
    /*
     * Code to allow the user to add their name
     */
    public void nameUser(){

        Scanner scanr = new Scanner(System.in);

        //String name;

        System.out.print("Name: ");
        name = scanr.nextLine().toUpperCase();
        this.setName(name);
        System.out.println("Name: " + name);

        scanr.close();
    }
    
    /*
     * Code to generate a random reservation number
     */
    public void reservationID(){

        Random ranID = new Random();

        int radNumbers;

       
        // this is a 10 digit unique reservation ID

        String numRan[] = new String[10];

        for(int i=0; i<10; i++){
            //Random Number from 1-10
            radNumbers = ranID.nextInt(10);
            
            //String array for random numbers
            numRan[i] = Integer.toString(radNumbers);
        }
        
        System.out.println("Your Reservation ID is: " + numRan[0] + numRan[1] + numRan[2] + numRan[3] + numRan[4] + numRan[5]
         + numRan[6] + numRan[7] + numRan[8] + numRan[9]);
    }
        
    /*
     * Code to allow the user to add their email address
     */
        public void emailUser() {
        	 Scanner scanr = new Scanner(System.in);
        	
        	 System.out.print("Email: ");
             email = scanr.nextLine().toUpperCase();
             this.setEmail(email);
             System.out.println("Email: " + email);
             
             scanr.close();
        }
        
        /*
         * Code to allow the user to add their phone number
         */
        public void phoneUser() {
       	 Scanner scanr = new Scanner(System.in);
       	
       	 System.out.print("Phone No: ");
            phoneNo = scanr.nextLine();
            this.setEmail(phoneNo);
            System.out.println("Phone No: " + phoneNo);
            
            scanr.close();
       }

        
        
    /*
     * Set and Get methods for the users details
     */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


}