public class getImpact {
    
    
    public double finalImpact;
    
    public void caculateImpact(double Velocity, double Angle){
        
        double time = 0;
        double timeIncrease = 1;
        time += timeIncrease;
        double finalTime = (Velocity * Math.cos(Math.toRadians(Angle))*time);
        finalImpact = (2 * Velocity * Math.cos(Math.toRadians(Angle))) / 9.81;


    }
    public double getFinalImpact() {
        return finalImpact;
    }
}


