import java.io.IOException;

// Author: Darragh Walsh
// Student Number: 20244053
// This class will invoke and run the ReservationMenu.java class.

/**
 * A system to manage reservations.
 */

public class ReservationSystem {
    public static void main(String[] args)
    throws IOException {
        ReservationsMenu menu = new ReservationsMenu();
        menu.run();
    }
}  
