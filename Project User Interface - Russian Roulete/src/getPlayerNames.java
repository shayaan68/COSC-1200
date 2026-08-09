import java.util.Scanner;
public class getPlayerNames {
    
    public String[] playerNames;
    
    public void getNames (Scanner Scan, int playerCount) { 
        
        playerNames = new String[playerCount];

        Scan.nextLine();

        for (int i=0; i < playerCount; i++) {
            
            System.out.println("Enter Player " + (i + 1) + "'s name:");
            playerNames[i] = Scan.nextLine();

        }
    }

    public String[] getNames() {
        return playerNames;
    }
}
