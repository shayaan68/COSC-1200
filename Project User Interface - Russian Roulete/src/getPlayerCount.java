import java.util.Scanner;
public class getPlayerCount {
    
    public int playerCount;
    
    public void numberOfPlayers (Scanner Scan){
    boolean playerCountVerification = false;
    int confirmedPlayerCount = 0; 

        while(!playerCountVerification) {
            
            if (Scan.hasNextInt()){
            confirmedPlayerCount = Scan.nextInt();
            
                if (confirmedPlayerCount >= 2 && confirmedPlayerCount <= 5) {
                    playerCountVerification = true;
                    playerCount = confirmedPlayerCount;

            } else {
                System.out.println("Invaild Input: Enter a whole number in the range of 2-5 players"); 
            } 
            
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

