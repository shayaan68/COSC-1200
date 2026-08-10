import java.util.Random;

public class getGunResult {

    private Random random = new Random();

    public boolean pullTrigger() {

        int chamber = random.nextInt(6);

        if (chamber == 0) {
            return true;
        }

        return false;
    }
}