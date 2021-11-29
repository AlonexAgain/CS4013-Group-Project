import java.util.Scanner;
import java.util.Random;

public class Reservation {

    public void nameUser(){

        Scanner scanr = new Scanner(System.in);

        String name;

        System.out.print("Name: ");
        name = scanr.nextLine();

        System.out.println("Name: " + name);

        scanr.close();
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

}