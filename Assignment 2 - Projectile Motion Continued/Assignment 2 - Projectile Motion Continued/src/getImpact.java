import java.util.Scanner;
public class getImpact {
    
    
    public double finalImpact;

    double yAxis = 0;
    double xAxis = 0;
    double time = 0;
    double timeIncrease = 1;
    double finalTime;
    boolean impactVerification = false;
    
    public void caculateImpact(double Velocity, double Angle){
        
        time += timeIncrease;
        yAxis = ((Velocity * Math.sin(Math.toRadians(Angle)) * time - (9.81 * time*time)/2));
        xAxis = (Velocity * Math.cos(Math.toRadians(Angle))*time);
        finalTime = (2 * Velocity * Math.sin(Math.toRadians(Angle))) / 9.81;
        }
    }


