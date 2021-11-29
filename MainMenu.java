

import java.util.Scanner;

public class MainMenu {

    //This will display the menu
    public static void displayMenu(int options[], String optionMenu[] ){

        System.out.println("BestSolutions Ltd");
        System.out.println("===================");

        //Loop throught the menu options from the array
        for(int i = 0; i < options.length; i++){
            System.out.printf("%d. %s\n", options[i], optionMenu[i]);
        }

        System.out.println("===================");
        System.out.print("Enter Choice: ");

    }

    public static void roomPrice(){
        System.out.println("--------------");
        System.out.println("Room 1 is $40");
        System.out.println("Room 2 is $50");
        System.out.println("Room 3 is $60");
        System.out.println("Room 4 is $70");
        System.out.println("--------------");
    }

    public static void contactInformation(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Welcome to BestSolutions Ltd");
        System.out.println("-----------------------------");
        System.out.println("Here at BestSolutions Ltd we provide the best");
        System.out.println("rooms for our customers");
        System.out.println("    ");
        System.out.println("Phone Number: 0871847534");
        System.out.println("Email Address: Bestsolutionsltd@gmail.com");
        System.out.println(" ");
        System.out.println("Feel free to call us at our opening hours from 8am-10pm");
        System.out.println("from Monday to Friday");
        System.out.println("-----------------------------");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args){

        //User input
        int userInput;

        // MainMenu Data Array
        int options[] = {1,2,3,4,5};

        //String array for choices
        String optionMenu[] = {"Book a room", "Check Prices", "Contact Infomation", "Cancellation", "Exit"};

        //Exit the menu
        int Exit = options[options.length-1];
        
        //This will display the menu from displayMenu class
        displayMenu(options, optionMenu);

        
        
        //Scanner setup
        Scanner scan = new Scanner(System.in);

        // Get users input
        userInput = scan.nextInt();

        //Check users value and looping main menu
        while(userInput != Exit){ 
            if (userInput == options[0]){
                System.out.println("Book A Room");

            }
            else if (userInput == options[1]){
                roomPrice();

            }
            else if (userInput == options[2]){
                contactInformation(); 
            }
            else if (userInput == options[3]){
                System.out.println("HERE is where you cancel your booking");
            }
            
           

            //Main Menu Again
            displayMenu(options, optionMenu);

            userInput = scan.nextInt();

            System.out.println(" ");

        }
        System.out.println("Thank you for booking with BestSolutions Ltd");
    }
}
