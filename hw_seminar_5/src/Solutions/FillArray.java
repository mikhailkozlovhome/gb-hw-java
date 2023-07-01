package Solutions;

import java.util.Random;

public class FillArray {
    public static void fillArray(int[] arr) {
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-arr.length, arr.length);
        }
    }
}
