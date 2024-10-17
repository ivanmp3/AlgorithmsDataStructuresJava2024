import java.util.Random;

public class GetRand {
    public static int genRand() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
}
