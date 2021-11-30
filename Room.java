package team18;


//Author: Darren Fernandes & Elliot Buckley
//Student: 20246692 & 20260962

/**
 * This class
 * Accounts for the type of room
 * Accounts for the occupancy in the rooms
 */

import java.util.ArrayList;
import team18.RoomList;
import java.util.Scanner;

public class Room {
	
	private String roomType;
	private int noOfRooms;
	private int MinOcc;
	private int MaxOcc;
	private double[] rates;
	private String hotelType;
	private int totalCost;
	private ArrayList<Reservation> reservation = new ArrayList<Reservation>();

	
	/*
	 * public Room(String roomType, int MinOcc, int MaxOcc, double[] rates) {
	 * this.roomType = roomType; this.MinOcc = MinOcc; this.MaxOcc = MaxOcc;
	 * this.rates = rates; }
	 */
	
	
	
	/*
	 * Get operators for the variables listed above
	 */
	
	public ArrayList<Reservation> getReservation() {
		return reservation;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public int getNoOfRooms() {
		return noOfRooms;
	}
	
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	
	public int getMinOcc() {
		return MinOcc;
	}
	
	public void setMinOcc(int MinOcc) {
		this.MinOcc = MinOcc;
	}
	
	public int getMaxOcc() {
		return MaxOcc;
	}
	
	public void setMaxOcc(int MaxOcc) {
		this.MaxOcc = MaxOcc;
	}
	
	public double[] getRates() {
		return rates;
	}
	
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	
	public String getHotelType() {
		return hotelType;
	}
	
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	

	
	/*
	 * Method for selecting the type of hotel the user wants
	 */
	public void selectHotel() {
		
		Scanner scanr = new Scanner(System.in);
		
		int options[] = {1,2,3};

        //String array for choices of Hotels
        String optionMenu[] = {"5 Star Hotel", "4 Star Hotel", "3 Star Hotel"};
        
        for(int i = 0; i < options.length; i++){
            System.out.printf("%d. %s\n", options[i], optionMenu[i]);
        }
        
        System.out.println("===================");
        System.out.print("Enter Choice: ");
        
        this.setHotelType(hotelType);
        System.out.println("Hotel: " + hotelType);

        scanr.close();  
        
	}//end selectHotel()
	
	
	/*
	 * Method for selecting the typ of room the user wants
	 */
	public void selectRoom() {
		Scanner scanr = new Scanner(System.in);
		
		if (hotelType == "5 Star Hotel") 
		{
			
			int options[] = {1,2,3,4};
			String optionMenu[] = {"Deluxe Double", "Deluxe Twin", "Deluxe Single", "Deluxe Family"};
			
			for(int i = 0; i < options.length; i++){
	            System.out.printf("%d. %s\n", options[i], optionMenu[i]);
			}
	        
			 System.out.println("===================");
		        System.out.print("Enter Choice: ");
			
	        this.setRoomType(roomType);
	        System.out.println("Room: " + roomType);

	        scanr.close();
		}//end if 
		
		else if (hotelType == "4 Star Hotel")
		{
			int options[] = {1,2,3};
			String optionMenu[] = {"Executive Double", "Executive Twin", "Executive Single"};
			
			for(int i = 0; i < options.length; i++){
	            System.out.printf("%d. %s\n", options[i], optionMenu[i]);
			}
	        
			 System.out.println("===================");
		        System.out.print("Enter Choice: ");
			
	        this.setRoomType(roomType);
	        System.out.println("Room: " + roomType);

	        scanr.close();
		}//end else if
		
		else if (hotelType == "3 Star Hotel")
		{
			int options[] = {1,2,3};
			String optionMenu[] = {"Classic Double", "Classic Twin", "Classic Single"};
			
			for(int i = 0; i < options.length; i++){
	            System.out.printf("%d. %s\n", options[i], optionMenu[i]);
			}
	        
			 System.out.println("===================");
		        System.out.print("Enter Choice: ");
			
	        this.setRoomType(roomType);
	        System.out.println("Room: " + roomType);

	        scanr.close();
		}//end else
		
	}//end selectRoom(_
	
	
	public void stayDuration() {
		
Scanner scanr = new Scanner(System.in);
		
		int options[] = {1,2,3,4,5,6,7};

        //String array for days
        String optionMenu[] = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        
        for(int i = 0; i < options.length; i++){
            System.out.printf("%d. %s\n", options[i], optionMenu[i]);
        }
        
        System.out.println("===================");
        System.out.print("Enter Choice:(ie. If staying Mon-Wed please enter 1,2,3 ");
	}
}














































