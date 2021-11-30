//Author: Darren Fernandes
//Student: 20246692

/**
 * This class
 * Accounts for the type of room
 * Accounts for the Min and Max Occupancy
 * Accounts for the rates of the rooms on each day 
 */

public class RoomList {
    /**
     * These arrays represent the rooms in the following ways:
     * Index 0: Number of Rooms
     * Index 1: Min Occupancy
     * Index 2: Max Occupancy
     * Index 3-9: The Rates for Monday through to Sunday
     */
    
    //Hotel Type: 5 Star
    int[] DD = {35, 1, 2, 75, 75, 75, 80, 90, 90, 75};
    int[] DT = {25, 1, 2, 75, 75, 75, 80, 90, 90, 75};
    int[] DS = {10, 1, 2, 70, 70, 70, 75, 80, 80, 65};
    int[] DF = {10, 1, 3, 80, 80, 80, 80, 100, 100, 80};
    
    //Hotel Type: 4 Star
    int[] ED = {40, 1, 2, 70, 70, 70, 70, 80, 85, 85};
    int[] ET = {32, 1, 2, 70, 70, 70, 70, 80, 85, 85};
    int[] ES = {12, 1, 1, 65, 65, 65, 65, 70, 75, 80};
    
    //Hotel Type: 3 Star
    int[] CD = {45, 1, 2, 65, 65, 70, 70, 75, 80, 65};
    int[] CT = {45, 1, 2, 65, 65, 70, 70, 80, 85, 65};
    int[] CS = {10, 1, 1, 50, 50, 50, 60, 75, 75, 50};
    
    private List <Room> rooms = new ArrayList<>();

    public List <Room> getRooms() {
        return rooms;
    }




}