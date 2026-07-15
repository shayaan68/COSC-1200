import java.util.concurrent.ThreadLocalRandom;
public class getImpact {
    
    
    public double finalImpact;

    
    public void caculateImpact(double Velocity, double Angle){
        
        //This is to set up the random starting position of each player before they throw
        
        //and this is to set up the time that goes by 
        double time = 0;
        double timeIncrease = 1;
        time += timeIncrease;

        double flighttime = (Velocity * Math.cos(Math.toRadians(Angle))/ 9.81);
        finalImpact = (startingPosition + (2 * Velocity * Math.cos(Math.toRadians(Angle))) * flighttime);


    }
    public double getFinalImpact() {
        return finalImpact;
    }
}


