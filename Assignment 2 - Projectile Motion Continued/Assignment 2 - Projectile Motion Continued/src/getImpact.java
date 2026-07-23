
public class getImpact {
    
    
    public double finalImpact;
    public void caculateImpact(double Velocity, double Angle, double startingPosition){
        
    //Setting up the declrations for the time 
    double time = 0;
    double timeIncrease = 1;
    double yAxisPosition;

    //the formula loop that keeeps running untill the y-axis (the height) hits ground level (0 or less) to detrimine the time
    while (true){
        
        yAxisPosition = (Velocity * Math.sin(Math.toRadians(Angle)) * time) - (9.81 * time * time) / 2;
        
        if (yAxisPosition <= 0 && time > 0) {
            break;
        }
    
        time += timeIncrease;
    }
    //formula that detrimines
    finalImpact = startingPosition + (Velocity * Math.cos(Math.toRadians(Angle)) * time);

    }
    
    public double getFinalImpact() {
        return finalImpact;
    }
}


