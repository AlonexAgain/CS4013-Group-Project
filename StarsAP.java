import java.util.Scanner;

public class StarsAP {
	
    public void selStarAP(){
        
        int starc;
        
        System.out.println("Select Star");
        System.out.println("[1] Five Star");
        System.out.println("[2] Four Star");
        System.out.println("[3] Three Star");
        
        
        Scanner scanr = new Scanner(System.in);
        
        starc = scanr.nextInt();
        
        if (starc == 1)
        {
            FiveAP five6 = new FiveAP();
            five6.apFive();
            
        }
        else if(starc == 2)
        {
            FourAP four4 = new FourAP();
            four4.apFour();
        }
        else
        {
            ThreeAP three3 = new ThreeAP();
            three3.apThree();
        }
        
        
    }
}