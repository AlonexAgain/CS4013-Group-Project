package team18;

import java.util.Scanner;

public class Three {
    public static void displayMenu2(int options[], String optionMenu[]){
        System.out.println("                   ");
        System.out.println("BestSolutions Ltd");
        System.out.println("===================");
        System.out.println("                   ");
        System.out.println("You have selected 3 star hotel");
        System.out.println("                   ");
        System.out.println("===================");

        //Loop throught the menu options from the array
        for(int i = 0; i < options.length-1; i++){

            System.out.printf("%d. %s \t \n", options[i], optionMenu[i]);
        }

        // Prints exit option, "options[options.length-1]" this will print the last option in the option array.
        // "optionMenu[optionMenu.length-1]" will print the last item in the optionMenu array.
        System.out.printf("%d. %s\n", options[options.length-1], optionMenu[optionMenu.length-1] );

        System.out.println("===================");
        System.out.print("Enter Choice: ");
        System.out.println("                   ");

    }

    public void standThree(){

        //User input
        int userInput;

        // MainMenu Data Array
        int options[] = {1,2,3,4};

        //String array for choices
        String optionMenu[] = {"Classic Double", "Classic Twin", 
                "Classic Single", "Exit"};

        //Exit the menu
        int Exit = options[options.length-1];

        //This will display the menu from displayMenu class
        displayMenu2(options, optionMenu);

        //Scanner setup
        Scanner scan = new Scanner(System.in);

        // Get users input
        userInput = scan.nextInt();

        //Check users value and looping main menu

        if (userInput == options[0]){
            System.out.println("Your chosen room is the: " + optionMenu[0]);
            Standard CDstand = new Standard();
            CDstand.standCD();
        }
        else if (userInput == options[1]){
            System.out.println("Your chosen room is the: " + optionMenu[1]);
            Standard CTstand = new Standard();
            CTstand.standCT();
        }
        else if (userInput == options[2]){
            System.out.println("Your chosen room is the: " + optionMenu[2]);
            Standard CSstand = new Standard();
            CSstand.standCS();
        }
        else if (userInput == options[3]){
            System.out.println("Goodbye");
        }



        System.out.println("");

        System.out.println("Thank you for booking with BestSolutions Ltd");
    }
}