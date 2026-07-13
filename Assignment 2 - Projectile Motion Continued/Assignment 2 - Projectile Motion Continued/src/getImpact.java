import java.util.Scanner;
public class getImpact {
    
    
    public double finalImpact;
    
    public void caculateImpact(Scanner Scan){
        
        double time = 0;
        double timeIncrease = 1;
        boolean impactVerification = false;
        double yAxis = 0;
        double xAxis = 0;
        
        //This is recalling the two classes and turning the objects into doubles that Ill need for get impact
        getPower velocityPower = new getPower();
        velocityPower.caculatePower(Scan);
        double Velocity = velocityPower.getPowerCaculations();

        getAngle thrownAngle = new getAngle();
        thrownAngle.caculateAngle(Scan);
        double Angle = thrownAngle.getCaculateAngle();
    
    
        time += timeIncrease;
        yAxis = ((Velocity * Math.sin(Math.toRadians(Angle)) * time - (9.81 * time*time)/2));
        xAxis = (Velocity * Math.sin(Math.toRadians(Angle))*time);
            
        double FinalTime = (2 * Velocity * Math.sin(Math.toRadians(Angle))) / 9.81;


        
        }
    }


