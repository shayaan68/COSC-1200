// Name: Shayaan Shah
// Date: June 25th 2026
// File Name: Assignment 2 - Projectiles Motion continued/getPower()
// Description: This class is to request for the velocitys input and to check if that input is vaild
import java.util.Scanner;
public class getPower {
    private double velocityPower;

    //declaring the variables Ill need for this class 
    public void caculatePower(Scanner Scan){
        boolean velocityPowerVerifiation = false;
        
        // Im using the same verification as my assigmnet 1 as in 
        // its scans if the input is a number by seeing if its a double, 
        // then it scans if that double is in the range of 1-1000 and clsoes the loop
        while (!velocityPowerVerifiation) {
            if (Scan.hasNextDouble()) {
                velocityPower = Scan.nextDouble();
                    if (velocityPower < 1000 && velocityPower > 0) {
                        velocityPowerVerifiation = true;

                    } else {
                        System.out.println("Invaild Input: Enter a number that is BETWEEN 0 and 1000 m/s for the velocity");
                        Scan.next(); 
                    }
            }else {
                System.out.println("Invaild Input: Enter a NUMBER that is between 0 and 1000 m/s for the velocity");
                Scan.next();
            }
            }
        }
    public double getPowerCaculations() {
        return velocityPower;
    }
}


