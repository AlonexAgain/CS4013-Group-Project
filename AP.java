import java.util.Scanner;

public class AP {
    public static void displayMenu2(int options[], String optionMenu[], double prices[] ){
        System.out.println("                   ");
        System.out.println("BestSolutions Ltd");
        System.out.println("===================");
        System.out.println("                   ");
        System.out.println("You have selected our Standard Rates");
        System.out.println("                   ");
        System.out.println("===================");

        //Loop throught the menu options from the array
        for(int i = 0; i < options.length-1; i++){

            //"%.2f" will format the prices to 2 decimal points
            System.out.printf("%d. %s \t %.2f\n", options[i], optionMenu[i], prices[i]);
        }

        // Prints exit option, "options[options.length-1]" this will print the last option in the option array.
        // "optionMenu[optionMenu.length-1]" will print the last item in the optionMenu array.
        System.out.printf("%d. %s\n", options[options.length-1], optionMenu[optionMenu.length-1] );

        System.out.println("===================");
        System.out.print("Enter Choice: ");

    }

    public void apDD(){

        //User input
        int userInput;

        // MainMenu Data Array
        int options[] = {1,2,3,4,5,6,7};

        //String array for choices
        String optionMenu[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Prices for Rooms
        double redPrices[] = {71.25,71.25,66.5,76,66.5,
                66.5,61.75};
        //Exit the menu
        int Exit = options[options.length-1];

        //This will display the menu from displayMenu class
        displayMenu2(options, optionMenu, redPrices);

        //Scanner setup
        Scanner scan = new Scanner(System.in);

        // Get users input
        userInput = scan.nextInt();

        //Check users value and looping main menu

        if (userInput == options[0]){
            System.out.println(optionMenu[0] + " = " + redPrices[0]);

        }
        else if (userInput == options[1]){

            System.out.println(optionMenu[1] + " = " + redPrices[1]);
        }
        else if (userInput == options[2]){
            System.out.println(optionMenu[2] + " = " + redPrices[2]);
        }
        else if (userInput == options[3]){
            System.out.println(optionMenu[3] + " = " + redPrices[3]);
        }
        else if (userInput == options[4]){
            System.out.println(optionMenu[4] + " = " + redPrices[4]);
        }
        else if (userInput == options[5]){
            System.out.println(optionMenu[5] + " = " + redPrices[5]);
        }
        else if (userInput == options[6]){
            System.out.println(optionMenu[6] + "=" + redPrices[6]);
        }
        else if (userInput == options[7]){
            System.out.println(optionMenu[7] + " = " + redPrices[7]);
        }


        System.out.println(" ");
        System.out.println("You have Booked: " + userInput);

    }

    public void apDT(){

        //User input
        int userInput;

        // MainMenu Data Array
        int options[] = {1,2,3,4,5,6,7};

        //String array for choices
        String optionMenu[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Prices for Rooms
        double redPrices[] = {71.25,71.25,66.5,76,66.5,
                66.5,61.75};
        //Exit the menu
        int Exit = options[options.length-1];

        //This will display the menu from displayMenu class
        displayMenu2(options, optionMenu, redPrices);

        //Scanner setup
        Scanner scan = new Scanner(System.in);

        // Get users input
        userInput = scan.nextInt();

        //Check users value and looping main menu

        if (userInput == options[0]){
            System.out.println(optionMenu[0] + " = " + redPrices[0]);

        }
        else if (userInput == options[1]){

            System.out.println(optionMenu[1] + " = " + redPrices[1]);
        }
        else if (userInput == options[2]){
            System.out.println(optionMenu[2] + " = " + redPrices[2]);
        }
        else if (userInput == options[3]){
            System.out.println(optionMenu[3] + " = " + redPrices[3]);
        }
        else if (userInput == options[4]){
            System.out.println(optionMenu[4] + " = " + redPrices[4]);
        }
        else if (userInput == options[5]){
            System.out.println(optionMenu[5] + " = " + redPrices[5]);
        }
        else if (userInput == options[6]){
            System.out.println(optionMenu[6] + "=" + redPrices[6]);
        }
        else if (userInput == options[7]){
            System.out.println(optionMenu[7] + " = " + redPrices[7]);
        }
        

        System.out.println(" ");
        System.out.println("You have Booked: " + userInput);

    }

    public void apDS(){

        //User input
        int userInput;

        // MainMenu Data Array
        int options[] = {1,2,3,4,5,6,7};

        //String array for choices
        String optionMenu[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Prices for Rooms
        double redPrices[] = {66.50,66.50,66.50,71.25,76,
                76,61.75};
        //Exit the menu
        int Exit = options[options.length-1];

        //This will display the menu from displayMenu class
        displayMenu2(options, optionMenu, redPrices);

        //Scanner setup
        Scanner scan = new Scanner(System.in);

        // Get users input
        userInput = scan.nextInt();

        //Check users value and looping main menu

        if (userInput == options[0]){
            System.out.println(optionMenu[0] + " = " + redPrices[0]);

        }
        else if (userInput == options[1]){

            System.out.println(optionMenu[1] + " = " + redPrices[1]);
        }
        else if (userInput == options[2]){
            System.out.println(optionMenu[2] + " = " + redPrices[2]);
        }
        else if (userInput == options[3]){
            System.out.println(optionMenu[3] + " = " + redPrices[3]);
        }
        else if (userInput == options[4]){
            System.out.println(optionMenu[4] + " = " + redPrices[4]);
        }
        else if (userInput == options[5]){
            System.out.println(optionMenu[5] + " = " + redPrices[5]);
        }
        else if (userInput == options[6]){
            System.out.println(optionMenu[6] + "=" + redPrices[6]);
        }
        else if (userInput == options[7]){
            System.out.println(optionMenu[7] + " = " + redPrices[7]);
        }


        System.out.println(" ");
        System.out.println("You have Booked: " + userInput);

    }

    public void apDF(){

        //User input
        int userInput;

        // MainMenu Data Array
        int options[] = {1,2,3,4,5,6,7};

        //String array for choices
        String optionMenu[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Prices for Rooms
        double redPrices[] = {66.50,66.50,66.50,71.25,76,
                76,61.75};
        //Exit the menu
        int Exit = options[options.length-1];

        //This will display the menu from displayMenu class
        displayMenu2(options, optionMenu, redPrices);

        //Scanner setup
        Scanner scan = new Scanner(System.in);

        // Get users input
        userInput = scan.nextInt();

        //Check users value and looping main menu

        if (userInput == options[0]){
            System.out.println(optionMenu[0] + " = " + redPrices[0]);

        }
        else if (userInput == options[1]){

            System.out.println(optionMenu[1] + " = " + redPrices[1]);
        }
        else if (userInput == options[2]){
            System.out.println(optionMenu[2] + " = " + redPrices[2]);
        }
        else if (userInput == options[3]){
            System.out.println(optionMenu[3] + " = " + redPrices[3]);
        }
        else if (userInput == options[4]){
            System.out.println(optionMenu[4] + " = " + redPrices[4]);
        }
        else if (userInput == options[5]){
            System.out.println(optionMenu[5] + " = " + redPrices[5]);
        }
        else if (userInput == options[6]){
            System.out.println(optionMenu[6] + "=" + redPrices[6]);
        }
        else if (userInput == options[7]){
            System.out.println(optionMenu[7] + " = " + redPrices[7]);
        }
        


        System.out.println(" ");
        System.out.println("You have Booked: " + userInput);

    }
}

