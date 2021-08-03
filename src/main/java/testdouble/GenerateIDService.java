package testdouble;

import java.util.Random;

public class GenerateIDService {

    public String get() {
        Random random = new Random();
        int number = random.nextInt(10);
        String id = "XYZ" + number;

        return id;
    }
}
