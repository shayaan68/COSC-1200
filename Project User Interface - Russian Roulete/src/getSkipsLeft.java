public class getSkipsLeft {

    private int[] skipsLeft;

    public getSkipsLeft(int playerCount) {

        skipsLeft = new int[playerCount];

        for (int i = 0; i < playerCount; i++) {
            skipsLeft[i] = 1;
        }
    }

    
    public boolean useSkip(int currentPlayer) {

        if (skipsLeft[currentPlayer] > 0) {
            skipsLeft[currentPlayer]--;
            return true;
        }

        return false;
    }

    public void resetSkips() {

        for (int i = 0; i < skipsLeft.length; i++) {
            skipsLeft[i] = 1;
        }
    }

    public int getSkipsLeft(int currentPlayer) {

        return skipsLeft[currentPlayer];
    }
}


