// Name: Shayaan Shah
// Date: Aug 6th 2026
// File Name: Project User Interface - Russian Roulette
// Description: 

import java.util.Scanner;

public class runRussianRolette {


    public static void main(String[] args) throws Exception {

        //Declrations for the scanner, game loop, player count, names and the rounds in that order
        Scanner Scan = new Scanner(System.in);
        boolean gameVerification = false;
        
        getPlayerCount playerCount = new getPlayerCount();
        getPlayerNames playerNames = new getPlayerNames();
        
        
        //the loop to start the game
        while (!gameVerification) {
            System.out.println("Hello, Welcome to Russian Roulette!");
            System.out.println("Rules:");
            System.out.println("Please select a player count from 2-5");

                playerCount.numberOfPlayers(Scan);
                int confirmedPlayerCount = playerCount.numberOfPlayers();
                playerNames.getNames(Scan, confirmedPlayerCount);
                String[] confirmedPlayerNames = playerNames.getNames();



        }
    }
}
