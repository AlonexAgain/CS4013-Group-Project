
import java.util.Scanner;
import java.util.Random;

public class Reservation {

    private String nameUser;
    private String email;
    private String phoneNo;

    public void nameUser(){

        Scanner scanr = new Scanner(System.in);

        String name;

        System.out.print("Name: ");
        name = scanr.nextLine().toUpperCase();

        System.out.println("Your name is: " + name);
        this.setName(name);


    }

    public void emailUser() {
        Scanner scanr = new Scanner(System.in);

        String email;
        System.out.print("Email: ");
        email = scanr.nextLine().toUpperCase();

        System.out.println("Your email is: " + email);
        this.setEmail(email);

        
    }

    public void phoneUser() {
        int phoneNo = 0;
        String sInput;
        boolean valid = false;

        Scanner scanr = new Scanner(System.in);

        //This will keep looking until valid int input
        while(valid == false){
            System.out.print("Enter Phone Number: ");

            sInput = scanr.nextLine(); 
            
            try{
                
                //its gonna look at the conent of the string and its gooing to convert or parse it into int
                phoneNo = Integer.parseInt(sInput);
                
                //if we get bloolean to be true this loop will break
                valid = true;
            }
            catch(NumberFormatException n){
                System.out.println("ERROR, You Must Enter An Integer Value. ");
                
            }
        }
        

        
        System.out.println("Your Phone No: " + phoneNo);


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

    //elliot part
    public String getName() {
        return nameUser;
    }

    public void setName(String name) {
        this.nameUser = name;
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

