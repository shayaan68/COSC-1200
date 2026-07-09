// Name: Shayaan Shah
// Date: June 25th 2026
// File Name: Assignment 2 - Projectiles Motion continued/getAngle()
// Description: This class is to request for the angle at which the object was thronws input and to check if that input is vaild
import java.util.Scanner;
public class getAngle {
    private double thrownAngle;
    
    //declaring the variables & the need for this class 
    public void caculateAngle(Scanner Scan){
        thrownAngle = 0;
        boolean thrownAngleVerifiation = false;
        
        // Im using the same verification as my assigmnet 1 as in 
        // its scans if the input is a number by seeing if its a double, 
        // then it scans if that double is in the range of  and clsoes the loop
        while (!thrownAngleVerifiation) {
            if (Scan.hasNextDouble()) {
                thrownAngle = Scan.nextDouble();
                    if (thrownAngle < 180 && thrownAngle > 0) {
                        thrownAngleVerifiation = true;
                    } else {
                        System.out.println("Invaild Input: Enter a number that is BETWEEN 0 and 180 degrees for the angle that the object was thrown");
                        Scan.next(); 
                    }
            }else {
                System.out.println("Invaild Input: Enter a NUMBER that is between 0 and 180 degrees for the angle that the object was thrown");
                Scan.next();
            }
            }
        }
    public double getCaculateAngle() {
        return thrownAngle;
    
    }
}
