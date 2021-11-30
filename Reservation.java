import java.util.Scanner;
import java.util.Random;

public class Reservation {

    private String name;
    private String email;
    private String phoneNo;
    
    private String description;
    private CheckIODate dateFrom;
    // private CheckIODate dateTill;
    private CheckIOTime timeFrom;
    private CheckIOTime timeTill;

    public void nameUser(){

        Scanner scanr = new Scanner(System.in);

        String name;

        System.out.print("Name: ");
        name = scanr.nextLine().toUpperCase();
        this.setName(name);

        System.out.println("                   ");
        System.out.println("Name: " + name);

        
    }

    
    public void emailUser() {
        Scanner scanr = new Scanner(System.in);

        String email;
        System.out.print("Email: ");
        email = scanr.nextLine().toUpperCase();
        this.setEmail(email);
        System.out.println("Email: " + email);

        
    }

    public void phoneUser() {
        Scanner scanr = new Scanner(System.in);
        String phoneNo;

        System.out.print("Phone Number: ");
        phoneNo = scanr.nextLine();
        this.setEmail(phoneNo);
        System.out.println("Phone No: " + phoneNo);

        
    }

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

    public boolean fallsOn(CheckIODate x) {
        return (x.equals(dateFrom));
    }

    public String format() {
        String s = "Check in date: " + dateFrom.toString() + " Check in time: " + timeFrom.toString() + " Check out time: " + timeTill.toString() + " Description: " + description;
        return s;
    }
    
    public Reservation(String s) {
        String[] input=s.split(" ");
        for(int i=0;i<input.length-3;i++){
            description+=input[i]+" ";
        }
        timeTill = new CheckIOTime(input[input.length-1]);
        timeFrom = new CheckIOTime(input[input.length-2]);
        dateFrom = new CheckIODate(input[input.length-3]);
        //dateTill = new CheckIODate(input[input.length-4]);
    }
    
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Reservation)){
            return false;
        }
        else if(this==obj){
            return true;
        }
        Reservation x = ((Reservation)obj);
        return (x.dateFrom.equals(dateFrom) && x.timeFrom.equals(timeFrom) && x.timeTill.equals(timeTill));
    }
    
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