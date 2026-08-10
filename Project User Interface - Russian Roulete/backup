// Name: Shayaan Shah
// Date: Aug 6th 2026
// File Name: Project User Interface - Russian Roulette
// Description: 

import java.util.Scanner;

public class runRussianRolette {


    public static void main(String[] args) throws Exception {

        new russianRouletteGUI();

        //Declrations for the scanner, game loop, player count, names and the rounds in that order
        Scanner Scan = new Scanner(System.in);
        boolean gameVerification = false;
        boolean roundVerification = false;
        
        getPlayerCount playerCount = new getPlayerCount();
        
        getPlayerNames playerNames = new getPlayerNames();
        
        getPlayerChoice playerChoice = new getPlayerChoice();
        
        getGunResult gun = new getGunResult();

       

        
        
        //the loop to start the process of getting the number of players and names
        while (!gameVerification) {
            System.out.println("Hello, Welcome to Russian Roulette!");
            System.out.println("Rules:");
            System.out.println("Please select a player count from 2-5");

                playerCount.numberOfPlayers(Scan);
                int confirmedPlayerCount = playerCount.numberOfPlayers();
                
                playerNames.getNames(Scan, confirmedPlayerCount);
                String[] confirmedPlayerNames = playerNames.getNames();

                // Round Object
                runRounds rounds = new runRounds();

                //Skip Objects (objects that have changes in their status)
                getSkipsLeft skips = new getSkipsLeft(confirmedPlayerCount);
                
                getPlayerStatus playerStatus = new getPlayerStatus(confirmedPlayerCount);

                while (!roundVerification) {

                    System.out.println();
                    System.out.println("Round: " + rounds.getCurrentRound());

                    System.out.println(
                        "It is " +
                        confirmedPlayerNames[rounds.getCurrentPlayer()] +
                        "'s turn."
                    );
                   // Get player's choice
                int confirmedPlayerChoice = playerChoice.getChoice(Scan);


                // Pull Trigger and the two outcomes of it
                if (confirmedPlayerChoice == 1) {

                    System.out.println(
                        confirmedPlayerNames[rounds.getCurrentPlayer()]
                        + " pulls the trigger."
                    );

                    boolean playerDied = gun.pullTrigger();

                    if (playerDied) {
                        
                        System.out.println(
                            confirmedPlayerNames[rounds.getCurrentPlayer()]
                            + " has died!"
                        );

                        playerStatus.playerDied(rounds.getCurrentPlayer());

                        skips.resetSkips();

                        if (playerStatus.getAliveCount() > 1) {

                            rounds.nextPlayer(confirmedPlayerCount);

                            while (!playerStatus.isAlive(rounds.getCurrentPlayer())) {
                            rounds.nextPlayer(confirmedPlayerCount);
                            }
                        }


                        if (playerStatus.getAliveCount() == 1) {

                            System.out.println("Game Over!");
                            
                            int winner = playerStatus.getWinner();

                            System.out.println (
                                confirmedPlayerNames[winner] 
                                + " is the winner!"
                            );
                            
                            
                            
                            System.out.println("Would you like to play again?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");

                            int playAgain = Scan.nextInt();

                            if (playAgain == 1) {
                                
                                roundVerification = true;

                            } else if (playAgain == 2) {

                                gameVerification = true;
                                roundVerification = true;
                            }
                        }

                    } else {


                        System.out.println(
                            confirmedPlayerNames[rounds.getCurrentPlayer()]
                            + " Survived"
                        );

                        rounds.nextPlayer(confirmedPlayerCount);

                        while (!playerStatus.isAlive(rounds.getCurrentPlayer())) {
                            rounds.nextPlayer(confirmedPlayerCount);
                        }
                    }  
                }

                
                // Skip
                else if (confirmedPlayerChoice == 2) {

                    if (skips.useSkip(rounds.getCurrentPlayer())) {

                        System.out.println(
                            confirmedPlayerNames[rounds.getCurrentPlayer()]
                            + " used their skip."
                        );

                        rounds.nextPlayer(confirmedPlayerCount);

                        while (!playerStatus.isAlive(rounds.getCurrentPlayer())) {
                            rounds.nextPlayer(confirmedPlayerCount);
                        }

                    } else {

                        System.out.println(
                            confirmedPlayerNames[rounds.getCurrentPlayer()]
                            + " has already used their skip."
                        );

                    }
                }
            }
        }

        Scan.close();
    }
}
