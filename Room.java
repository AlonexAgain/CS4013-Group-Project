
//Author: Darren Fernandes
//Student: 20246692

/**
 * This class
 * Accounts for the type of room
 * Accounts for the occupancy in the rooms
 */

import java.util.ArrayList;

public class Room {
	
	private String roomType;
	private int noOfRooms;
	private int MinOcc;
	private int MaxOcc;
	private double[] rates;
	private ArrayList<Reservation> reservation = new ArrayList<Reservation>();

	
	public Room(String roomType, int MinOcc, int MacOcc, double[] rates) {
		this.roomType = roomType;
		this.MinOcc = MinOcc;
		this.MaxOcc = MacOcc;
		this.rates = rates;
	}
	
	/*
	 * Get operators for the variables listed above
	 */
	
	public ArrayList<Reservation> getReservation() {
		return reservation;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public int getNoOfRooms() {
		return noOfRooms;
	}
	
	public int getMinOcc() {
		return MinOcc;
	}
	
	public int getMaxOcc() {
		return MaxOcc;
	}
	
	public double[] getRates() {
		return rates;
	}
	
}