import java.util.Scanner;
public class getGameLogic {
    
    public int playerCount;
    
    public void numberOfPlayers (Scanner Scan){
    boolean playerCountVerification = false;
    int confirmedPlayerCount = 0; 

        while(!playerCountVerification) {
            if (Scan.hasNextInt() && confirmedPlayerCount >= 2 && confirmedPlayerCount <= 5) {
                playerCountVerification = true;

            } else {
                System.out.println("Invaild Input: Enter a whole number in the range of 2-5 players");
                Scan.next();
            } 
            }
        }
    public int numberOfPlayers() {
        return playerCount;
    }
}

