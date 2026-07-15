import java.util.Scanner;
public class runGame {
public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    
    //Declaring the whole loop to be fasle untill a player decide to end the loop  
    // by using an if statement at the end to trigger the gameVerification being True and stopping the whole loop
    boolean gameVerification = false;
    

    
    while (!gameVerification) {
    
        System.out.println("Hi! Welcome to the Projectile Motion Mulitplayer Game!");
        //I was going to do a while loop fr vaild input check, but to be honest it doesnt say if you could or couldnt use any other charcters for your name
        //so I decided to scrap it it and just stick with the verification being if one wants to repeat the game or quit
        System.out.println("Please Enter the 1st Players Name");
        String playerOneName = Scan.nextLine();
        System.out.println("Please Enter the 2nd Players Name");
        String playerTwoName = Scan.nextLine();
    
        //Doing the complete caculation for the first player then moving on to the 2nd 
        // as my angle and power classes are only deigned to check for vaild input for one input at a time
        //doing both play 1 and 2s speed at the same time caused more problems
        
        //Entering the first players speed and angle
        getPower playerOneVelocity= new getPower();
        System.out.println("Please enter the speed for " + playerOneName+  ":");
        playerOneVelocity.caculatePower(Scan);
        double velocity1 = playerOneVelocity.getPowerCaculations();

        
        getAngle playerOneAngle = new getAngle();
        System.out.println("Please enter the angle thrown at a minium of 0 and a maximum of 180 degrees for " + playerOneName +":");
        playerOneAngle.caculateAngle(Scan);
        double angle1 = playerOneAngle.getCaculateAngle();

        
        //Entering the secaond players speed and angle
        getPower playerTwoVelocity = new getPower();
        System.out.println("Please enter the speed for" + playerTwoName +":");
        playerTwoVelocity.caculatePower(Scan);
        double velocity2 = playerTwoVelocity.getPowerCaculations();


        getAngle playerTwoAngle = new getAngle();
        System.out.println("Please enter the angle thrown at a minium of 0 and a maximum of 180 degrees for "+ playerTwoName+ ":");
        playerTwoAngle.caculateAngle(Scan);
        double angle2 = playerTwoAngle.getCaculateAngle();


        //Now calling on get impact to do the caculations for the objects Ive called it on 
        getImpact playerOneImpact = new getImpact();
        playerOneImpact.caculateImpact(velocity1, angle1);
        double playerOneThrow = playerOneImpact.getFinalImpact();

        getImpact playerTwoImpact = new getImpact();
        playerTwoImpact.caculateImpact(velocity2, angle2);
        double playerTwoThrow = playerTwoImpact.getFinalImpact();
        
        if (playerOneThrow > playerTwoThrow) {
            System.out.println(playerOneName +" Total Distance"+ playerOneImpact);
            System.out.println(playerTwoName +" Total Distance"+ playerTwoImpact);
            System.out.println(playerOneName +" wins!");
            double playerOneDiffrence = (playerOneThrow - playerTwoThrow);
            System.out.println(playerOneName +" beats "+playerTwoName+"distance by about" + playerOneDiffrence);
            
        }/

        
        
        
    }
    
    }
}



