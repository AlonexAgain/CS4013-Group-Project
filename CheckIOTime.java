import java.util.StringTokenizer;
// Author: Darragh Walsh
// Student Number: 20244053
// This class...

/**
 * A hotel reservation check in and check out time.
 */

public class CheckIOTime {
    private int hours;
    private int minutes;

    public String toString() {
        String s = this.hours + ":" + this.minutes;
        return s;
    }

    public void CheckInTime(String s) {
        String[] input = s.split(":");
        hours = Integer.valueOf(input[0]);
        minutes = Integer.valueOf(input[1]);
    }

    public void CheckOutTime(String s) {
        String[] input = s.split(":");
        hours = Integer.valueOf(input[0]);
        minutes = Integer.valueOf(input[1]);
    }

    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof CheckIOTime)){
            return false;
        }
        else if(this==obj){
            return true;
        }
        CheckIOTime x = ((CheckIOTime)obj);
        return (x.hours==hours && x.minutes==minutes);
    }
}
