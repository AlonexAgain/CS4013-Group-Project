package team18.cs4013;

import java.util.Scanner;

public class ReservationsMenu {
	
//	private Scanner in;
	
	public void main (String[] args) {
//	public ReservationsMenu() {
		Scanner in = new Scanner(System.in);
		boolean more = true;
		
		while(more) {
			
			System.out.println("User Menu:\n"
								+ "1)Reservations	2)Cancellations\n\n"
								+ "Admin Menu:\n"
								+ "3)Hotel Stays	4)Billing/Accounts\n\n"
								+ "5)Exit");
			
			String command = in.nextLine().toUpperCase();
			
			if(command.equals("1")) //Should bring you to make a reservation (User)
			{
				/*
				 * This command should allow the user to make a reservation It starts by asking
				 * the user to select which hotel they would like to stay in, then moves onto
				 * which room, how many days they are staying and finally asks for a name for
				 * the reservation It should also calculate the price of the hotel
				 */
				
				//Starts by asking what hotel the user would like to stay in
				System.out.println("Please select which hotel you would like to stay in!\n"
									+ "1)5 Star		2)4 Star	3)3 Star	5)Exit");
				
				//Chooses the 5 star hotel 
				if(command.equals("1")) 
				{
					//Then asks which room the user would like to stay in
					System.out.println("Please select the room type\n"
										+ "1) Deluxe Double		2)Deluxe Twin		3)Deluxe Single		4)Deluxe Family		5)Exit");
					
					//Chooses the deluxe double room
					if(command.equals("1"))
					{
						//What days the user would like to stay
						System.out.println("Please enter the first day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//First day of stay
						String firstDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter the last day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//Last day of stay
						String lastDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter your name for the reservation");
						
						//Name for the reservation
						String resName = in.nextLine().toUpperCase();
						
						System.out.println("The cost of your stay will be: ");
						//Calculate how many days the stay is and take the price from the .csv file and multiply by the number of days
					}
					//Chooses the deluxe twin room
					else if(command.equals("2"))
					{
						//What days the user would like to stay
						System.out.println("Please enter the first day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//First day of stay
						String firstDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter the last day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//Last day of stay
						String lastDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter your name for the reservation");
						
						//Name for the reservation
						String resName = in.nextLine().toUpperCase();
						
						System.out.println("The cost of your stay will be: ");
						//Calculate how many days the stay is and take the price from the .csv file and multiply by the number of days
					}
					//Chooses the deluxe single room
					else if(command.equals("3"))
					{
						//What days the user would like to stay
						System.out.println("Please enter the first day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//First day of stay
						String firstDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter the last day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//Last day of stay
						String lastDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter your name for the reservation");
						
						//Name for the reservation
						String resName = in.nextLine().toUpperCase();
						
						System.out.println("The cost of your stay will be: ");
						//Calculate how many days the stay is and take the price from the .csv file and multiply by the number of days
					}
					//Chooses the Deluxe Family Room
					else if(command.equals("4"))
					{
						//What days the user would like to stay
						System.out.println("Please enter the first day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//First day of stay
						String firstDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter the last day of your hotel stay/n"
											+ "M)onday		T)uesday		W)ednesday		TH)ursday		F)riday");
						//Last day of stay
						String lastDay = in.nextLine().toUpperCase();
						
						System.out.println("Please enter your name for the reservation");
						
						//Name for the reservation
						String resName = in.nextLine().toUpperCase();
						
						System.out.println("The cost of your stay will be: ");
						//Calculate how many days the stay is and take the price from the .csv file and multiply by the number of days
					}
					else if(command.equals("5"))
					{
						more = false;
					}
				}
				
				//Chooses the 4 star hotel
				else if(command.equals("2"))
				{
					//Insert code here
				}
				
				//Chooses the 3 star hotel
				else if(command.equals("3"))
				{
					//Insert code here
				}
				else if(command.equals("5"))
				{
					more = false;
				}
			} 
			else if (command.equals("2")) //Should bring you to make a cancellation (User)
			{
				/*
				 * This is a user command This command should allow to user to cancel a
				 * reservation they have made using their name and then using the reservation
				 * criteria to determine the users refund There is also a command to exit the
				 * system
				 */
				System.out.println("Here are all of the past and current bookings\n"
						+ "1)Cancel a booking	5)Exit");
				if(command.equals("1"))
				{
					System.out.println("Please enter you name so we can find your reservation\n"
										+ "5)Exit");
					
					//The cancellation class should read the input below and find the matching reservation from the .csv file
					if(command.equals(""))
					{
						//Should pull up a reservation matching the name inputed above
					}
					else if(command.equals("5"))
					{
						more = false;
					}
				}
				else if(command.equals("5"))
				{
					more = false;
				}
			} 
			else if (command.equals("3"))
			{
				/*
				 * This is an Admin command
				 * This command should show all of the past and current bookings which are saved
				 * onto a .csv file This file should contain both data added directly to the
				 * file and any data added by using the booking feature
				 * There is also a command to exit the system
				 */
				System.out.println("Here are all of the past and current bookings\n"
									+ "5)Exit");
				if(command.equals("5"))
				{
					more  = false;
				}
			} 
			else if (command.equals("4"))
			{
				/*
				 * This is an Admin command This command should show all the pilling and
				 * accounts (ie. the name on the reservation, what hotel, what room type, how
				 * many nights, the total price) All this data should be stored on a .csv file
				 * containing data that has been added directly to the file and any data added
				 * by using the booking feature
				 * There is also a command to exit the system 
				 */
				System.out.println("Here are all of the billing accounts for past and current bookings\n"
									+ "5)Exit");
				if(command.equals("5"))
				{
					more  = false;
				}
			} 
			else if (command.equals("5")) 
			{
				//This command closes the program
				more = false;
			}
		}
	
	
	}
	
}