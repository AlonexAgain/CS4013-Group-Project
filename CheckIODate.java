import java.util.StringTokenizer;

// This class...

/**
 * A hotel reservation check in and check out date.
 */

public class CheckIODate {

    private int year;
    private int month;
    private int day;

    public String toString() {
        String s = this.day + "/" + this.month + "/" + this.year;
        return s;
    }

    public void checkInDate(String s) {
        String[] input = s.split("/");
        day = Integer.valueOf(input[0]);
        month = Integer.valueOf(input[1]);
        year = Integer.valueOf(input[2]);
    }

    public void checkOutDate(String s) {
        String[] input = s.split("/");
        day = Integer.valueOf(input[0]);
        month = Integer.valueOf(input[1]);
        year = Integer.valueOf(input[2]);
    }

    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof CheckIODate)){
            return false;
        }
        else if(this==obj){
            return true;
        }
        CheckIODate x = ((CheckIODate)obj);
        return (x.year==year && x.month==month && x.day==day);
    }
}
