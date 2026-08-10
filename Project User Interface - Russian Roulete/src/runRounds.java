// Name: Shayaan Shah
// Date: Aug 6th 2026
// File Name: Project User Interface - Russian Roulette
// Description: 
import java.util.Scanner;


public class runRounds {
    
    private int currentPlayer;
    private int currentRound;
    
    public runRounds() {
        currentPlayer = 0;
        currentRound = 1;
    }

    public void nextPlayer(int playerCount) {

        currentPlayer++;

        if (currentPlayer >= playerCount) {
            currentPlayer = 0;
            currentRound++;
        }
    }

    }
