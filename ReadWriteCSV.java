package team18;

//Author: Elliot Buckley
//Student ID: 20260962

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class ReadWriteCSV {
	private String[][] hotelInfo;
	private String[][] resInfo;
	
	
	
	/*
	 * This method reads the data from the l4Hotels.csv file and converts it into a 2D Array
	 */
	public String[][] readHotelInfo() throws FileNotFoundException {
		
		/*
		 * Scans/Reads the l4Hotels.csv file
		 */
		File hotelFile = new File("scr/l4Hotels.csv");
		Scanner in = new Scanner(hotelFile);
		int count = countLines(hotelFile);
		hotelInfo = new String[count][12]; //12 is the number on lines in the l4Hotels.csv file
		
		/*
		 * Rewrites the l4Hotels.csv file into a 2D Array
		 */
		String curLine;
		int i = 0;
		
		while(in.hasNext()) {
			curLine = in.nextLine();
			hotelInfo[i] = curLine.split(",");
			i++;
			
		}//end While Loop
		
		in.close();
		return hotelInfo;
		
	}//end public String[][] readHotelInfo()

	
	/*
	 * This method reads the data from the reservationsInfo.csv file and converts it into a 2D Array
	 * The method below this one adds reservations to this file
	 */
	public String[][] readResInfo() throws FileNotFoundException {
		
		/*
		 * Scans/Reads the reservationsInfo.csv file
		 */
		File resFile = new File("src/reservationsInfo.csv");
		Scanner in = new Scanner(resFile);
		int count = countLines(resFile);
		resInfo = new String[count][];
		
		/*
		 * reWrites the reservationInfo.csv file into a 2D Array
		 */
		String curLine;
		int i = 0;
		
		while(in.hasNext()) {
			curLine = in.nextLine();
			resInfo[i] = curLine.split(",");
			i++;
			
		}//end While Loop
		
		in.close();
		return resInfo;
		
	}//end public String[][] readResInfo

	
	/*
	 * This method adds a reservation and stores it on the reservationsInfo.csv file
	 */
	public void storeRes(Reservation res) throws IOException {
		File resFile = new File("src/reservationsInfo.csv");
		FileWriter fileW = new FileWriter(resFile, true);
		PrintWriter printW = new PrintWriter(fileW);
		
		printW.print(res.getName());
		printW.print(",");
		printW.print(res.getPhoneNo());
		printW.print(",");
		printW.print(res.getEmail());
		printW.print(",");
		
	}//end public void storeRes
	
	
    //counts the number of lines in a csv file
    public int countLines(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);

        //counts the number of lines in Reservations.csv
        int count = 0;
        while (in.hasNext()) {
            in.nextLine();
            count++;
        }

        in.close();
        return count;
    }//End countLines(File file)
	
}//end Class
