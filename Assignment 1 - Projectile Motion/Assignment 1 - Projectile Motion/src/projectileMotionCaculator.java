// Name: Shayaan Shah
// Date: May 31st 2026
// File Name: Assignment 1 - Projectiles Motion
// Description: Make a java program that caculates the projectile motion using 2 userr inputs of the angle and velocity while make sure that the input is both positive and logically vaild 
// (ex. while degrees being put as 361 is a positive number its still doesnt make sense as degrees max out at 360)
import java.util.Scanner;
// When I named my in class 2 "Main", it create alot of problems becasue of, Ive made sure this time to give the class an actual name
public class ProjectileMotionCaculator {
    public static void main(String[] args) throws Exception {  
    Scanner Scan = new Scanner(System.in);
    System.out.println("Hi! Welcome to the Projectile Motion Calculator!");
        
            // Setting up the Degrees and Inital Velocities as Doubles since decimals are allowed in physics and made the vaildation Varaiable a Boolian for the while loop 
            double Degrees;
            boolean Validation = false;
            double InitialVelocity;
            double Gravity = -9.81;
            double Vertical;
            double Horizontal;
            double Time;
            
            
            
            
            // The loop is set up with the Validation variable being set to false
            // and so untill the user reaches the vaild input where if everything goes through the vaild parts of the if statements, 
            // it will then end the loop via defining the Variable that is called validation as true when all inputs are true
            while (!Validation) {
            System.out.println("Enter the angle of the projectile in degrees");
                if (Scan.hasNextDouble()) {
                    Degrees = Scan.nextDouble();
                    // This logic validation is becasue while just like the InitalVelocity there cant be a negitive, there also cant be a degrees above 360
                    if (Degrees > 0 && Degrees <= 360) {
                        System.out.println("Enter the Inital Velocity of the projectile in m/s");
                            if (Scan.hasNextDouble()) {
                                InitialVelocity = Scan.nextDouble();
                                // Unlike the degrees the only logic validation that the InitalVelocity needs is just seeing if its more than 0, as negitive movement would not make sense.
                                    if (InitialVelocity > 0) {

                                        Horizontal = (InitialVelocity * Math.cos(Degrees))* Time;
                                        
                                        Vertical = (InitialVelocity * Math.sin(Degrees)) * Time - 0.5 * Gravity * Time * Time;

                                        // This is where the loop will end due to the fact that to reach here would be to have each input pass the validation of each if statemtn in the while loop
                                        Validation = true;
                                        Scan.close();
                                    
                                        //Error statement if you typed a numeric input but it was a negtitve for the InitalVelocity
                                        } else {
                                            System.out.println("Invaild Input: The Velocity CANNOT BE LESS than 0");
                                        }
                                    //Error statment if you typed in non numeric input for the InitalVelocity
                                    } else {
                                    System.out.println("Invaild Input: Enter a POSITIVE NUMBER for the inital velocity");
                                    Scan.next();
                                }
                            }
                    else {
                    //Error statement if you typed in numeric input for the degrees but it was either a negitive or above 360 . 
                    System.out.println("Invaild Input: The Degrees CANNOT BE LESS that 0 or over 360");}
                //Error statement if you typed in non numeric input for the degrees.
                }else {
                System.out.println("Invaild Input: Enter a NUMBER that is between 0 and 360 for the Degrees");
                Scan.next();
            }
        }
     }
}


    
    

