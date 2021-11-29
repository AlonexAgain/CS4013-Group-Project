import java.util.ArrayList;

// Author: Darragh Walsh
// Student Number: 20244053
// This class...

/**
 * A Reservation Calendar.
 */

public class ReservationCalendar {

    private ArrayList<Reservation> reservations;

    public ReservationCalendar() {
        reservations = new ArrayList<>();
    }

    public void add(Reservation x) {
        reservations.add(x);
    }

    public void cancel(Reservation x) {
        for(int i=0;i<reservations.size();i++){
            if(x.equals(reservations.get(i))){
                reservations.remove(x);
                break;
            }
        }
    }
    
    public ArrayList<Reservation> getReservationsForDay (CheckIODate x) {
        ArrayList<Reservation> reservationY;
        reservationY = new ArrayList<>();
        for(int i=0;i<reservations.size();i++){
            if(reservations.get(i).fallsOn(x)){
                reservationY.add(reservations.get(i));
            }
        }
        return reservationY;
    }
}