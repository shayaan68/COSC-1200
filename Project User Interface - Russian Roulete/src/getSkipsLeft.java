public class getSkipsLeft {

    private int[] skipsLeft;

    public getSkipsLeft(int playerCount) {

        skipsLeft = new int[playerCount];

        for (int i = 0; i < playerCount; i++) {
            skipsLeft[i] = 1;
        }
    }

}
