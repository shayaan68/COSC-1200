// Name: Shayaan Shah
// Date: Aug 6th 2026
// File Name: Project User Interface - Russian Roulette
// Description: 
public class getPlayerStatus {
    
    private boolean[] alive;

    public getPlayerStatus(int playerCount) {

        alive = new boolean[playerCount];

        for (int i = 0; i < playerCount; i++) {
            alive[i] = true;
        }
    }

    public void playerDied(int currentPlayer) {
        alive[currentPlayer] = false;
    }

    public boolean isAlive(int currentPlayer) {
        return alive[currentPlayer];
    }

    public int getAliveCount() {

        int aliveCount = 0;

        for (int i = 0; i < alive.length; i++) {

            if (alive[i]) {
                aliveCount++;
            }
        }

        return aliveCount;
    }

        public int getWinner() {

            for (int i = 0; i < alive.length; i++) {

                if (alive[i]) {
                    return i;
                }
            }

            return -1;
            
        }
    }

