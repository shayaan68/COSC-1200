// Name: Shayaan Shah
// Date: June 25th 2026
// File Name: Assignment 2 - Projectiles Motion continued/getAngle()
// Description: This class is to request for the angle at which the object was thronws input and to check if that input is vaild
import java.util.Scanner;
public class getAngle {
    public static void main(String[] args){
    Scanner Scan = new Scanner(System.in);
        
        //declaring the variables Ill need for this class 
        double thrownAngle = 0;
        boolean thrownAngleVerifiation = false;
        
        // Im using the same verification as my assigmnet 1 as in 
        // its scans if the input is a number by seeing if its a double, 
        // then it scans if that double is in the range of  and clsoes the loop
        while (!thrownAngleVerifiation) {
            if (Scan.hasNextDouble()) {
                thrownAngle = Scan.nextDouble();
                    if (thrownAngle < 360 && thrownAngle > 0) {
                        thrownAngleVerifiation = true;
                        Scan.close();
                    } else {
                        System.out.println("Invaild Input: Enter a number that is BETWEEN 0 and 360 degrees for the angle that the object was thrown");
                        Scan.next(); 
                    }
            }else {
                System.out.println("Invaild Input: Enter a NUMBER that is between 0 and 360 degrees for the angle that the object was thrown");
                Scan.next();
            }
            }
}
}