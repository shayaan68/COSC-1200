// Name: Shayaan Shah
// Date: Aug 6th 2026
// File Name: Project User Interface - Russian Roulette
// Description: 
import java.util.Scanner;

public class getPlayerChoice {

    public int getChoice(Scanner Scan) {
        
        boolean choiceVerification = false;
        int playerChoice = 0;

        while (!choiceVerification) {
            System.out.println("What would you like to do?");
            System.out.println("1. Pull Trigger");
            System.out.println("2. Skip");
            
            if (Scan.hasNextInt()) {
                playerChoice = Scan.nextInt();

                if (playerChoice == 1 || playerChoice == 2) {
                    choiceVerification= true;
                } else {
                    System.out.println("Invaild Input: Enter 1 or 2");
                }
            } else {
                System.out.print("Invaild Input: Enter 1 or 2");
            }

        }
        return playerChoice;
    }
    
}
