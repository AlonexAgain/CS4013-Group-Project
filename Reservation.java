import java.util.StringTokenizer;

// Author: Darragh Walsh
// Student Number: 20244053
// This class...

/**
 * A Reservation
 */

public class Reservation {

    private String description;
    private CheckIODate date;
    private CheckIOTime from;
    private CheckIOTime till;

    public boolean fallsOn(CheckIODate x) {
        return (x.equals(date));
    }

    public String format() {
        String s = "Date: " + date.toString() + "Time From: " + from.toString() + "Time Till: " + till.toString() + "Description: " + description;
        return s;
    }
    
    public Reservation(String s) {
        String[] input=s.split(" ");
        for(int i=0;i<input.length-3;i++){
            description+=input[i]+" ";
        }
        till = new CheckIOTime(input[input.length-1]);
        from = new CheckIOTime(input[input.length-2]);
        date = new CheckIODate(input[input.length-3]);
    }
    
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Reservation)){
            return false;
        }
        else if(this==obj){
            return true;
        }
        Reservation x = ((Reservation)obj);
        return (x.date.equals(date) && x.from.equals(from) && x.till.equals(till));
    }
}
