// Name: Shayaan Shah
// Date: Aug 6th 2026
// File Name: Project User Interface - Russian Roulette
// Description: 
import java.util.Random;

public class getGunResult {

    private Random random = new Random();

    private int loadedChamber;
    private int currentChamber;
    
    public getGunResult() {

        //the bullet gets randomly placed in the chamber or in this case an positon in the array is randomly chosen as the loaded chamber
        int loadedChamber = random.nextInt(6);

        // Starts at the first position of the array or in this case, where the revolver cynlinder span
        currentChamber = 0;
    }

    public boolean pullTrigger() {


        if (currentChamber == loadedChamber) {
            
            //Someone hit the loaded chamber
            resetGun();

            return true;
        }

        //cocks the gun to the next chamber
        currentChamber++;

        return false;
    }

    public void resetGun() {

        loadedChamber = random.nextInt(6);
        currentChamber = 0;
    }
}