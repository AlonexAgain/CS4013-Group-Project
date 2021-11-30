package team18;

import java.util.Scanner;

public class StarsStand {
	
    public void selStar(){
        
        int starc;
        
        System.out.println("Select Star");
        System.out.println("[1] Five Star");
        System.out.println("[2] Four Star");
        System.out.println("[3] Three Star");
        
        
        Scanner scanr = new Scanner(System.in);
        
        starc = scanr.nextInt();
        
        if (starc == 1)
        {
            FiveStand five5 = new FiveStand();
            five5.standFive();
            
        }
        else if(starc == 2)
        {
            FourStand four4 = new FourStand();
            four4.standFour();
        }
        else
        {
            ThreeStand three3 = new ThreeStand();
            three3.standThree();
        }
        
        
    }
}