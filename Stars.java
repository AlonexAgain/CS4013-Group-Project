import java.util.Scanner;

public class Stars {
    public void selStar(){
        
        int starc;
        
        System.out.println("Select Star");
        System.out.println("[1] Five Star");
        System.out.println("[2] Four Star");
        System.out.println("[3] Three Star");
        
        
        Scanner scanr = new Scanner(System.in);
        
        starc = scanr.nextInt();
        
        if (starc == 1){
            Five five5 = new Five();
            five5.standFive();
            
        }
        else if(starc == 2){
           
        }
        
        
    }
}