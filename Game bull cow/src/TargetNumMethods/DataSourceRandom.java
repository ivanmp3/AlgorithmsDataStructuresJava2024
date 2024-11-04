package TargetNumMethods;

import java.util.Random;

public class DataSourceRandom implements DataSource {
    @Override
    public int getInput() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
}
