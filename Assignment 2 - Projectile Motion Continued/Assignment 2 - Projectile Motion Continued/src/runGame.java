import java.util.Scanner;
public class runGame {
public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    //Declaring the variable to store the distance of each of the players throw and their names
    double playerOneThrow;
    double playerTwoThrow;
    boolean gameVerification = false;
    
    
    System.out.println("Hi! Welcome to the Projectile Motion Mulitplayer Game!");
    //I was going to do a vaild input check, but to be honest it dodnt say if you could or couldnt use any other charcters
    //so I decided to scrap it it
    System.out.println("Please Enter the 1st Players Name");
    String playerOneName = Scan.nextLine();
    System.out.println("Please Enter the 2nd Players Name");
    String playerTwoName = Scan.nextLine();
    while (!gameVerification) {
    

        //Doing the complete caculation for the first player then moving on to the 2nd 
        // as my angle and power classes are only deigned to check for vaild input for one input at a time
        //doing both play 1 and 2s speed at the same time caused more problems
        getPower velocityPower = new getPower();
        System.out.printf("Please enter the speed for", playerOneName);
        velocityPower.caculatePower(Scan);
        double Velocity = velocityPower.getPowerCaculations();


        getAngle thrownAngle = new getAngle();
        System.out.printf("Please enter the angle thrown at a minium of 0 and a maximum of 180 degrees for", playerOneName);
        thrownAngle.caculateAngle(Scan);
        double Angle = thrownAngle.getCaculateAngle();


        //Now calling on get impact 
        getImpact impact = new getImpact();
        impact.caculateImpact(Velocity, Angle);
        
        

        
        
        
    }
    
    }
}



