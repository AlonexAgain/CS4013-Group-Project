import java.io.IOException;

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