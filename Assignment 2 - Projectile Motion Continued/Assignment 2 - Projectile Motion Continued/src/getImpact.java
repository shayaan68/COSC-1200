import java.util.Scanner;
public class getImpact {
    
    //declaring the variables Ill need for this class 
    private double finalImpact;
    double time = 0;
    double timeIncrease = 0;
    double yAxis = 0;
    double xAxis = 0;
    boolean impactVerification = false;


    //Recalling the two classes for the caculations
    getPower initialVelocity = new getPower();
    getAngle thrownAngle = new getAngle();
    
    

    public void caculateImpact(Scanner Scan){
        while (!impactVerification)
        time += timeIncrease;
            yAxis = ((initialVelocity * Math.sin(Math.toRadians(thrownAngle)) * time - (9.81 * time*time)/2));
         
    }

}
