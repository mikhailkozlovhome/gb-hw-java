package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void execute() {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее из этого списка.

        int length = 10;
        int lowBound = -10;
        int upBound = 10;
        Random rnd = new Random();
        List<Integer> numL = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            numL.add(rnd.nextInt(lowBound, upBound));
        }

        System.out.println(numL);

        showMinMaxAvrg(numL);

    }

    private static void showMinMaxAvrg(List<Integer> list) {
        double avrg = 0;
        for (int i = 0; i < list.size(); i++) {
            avrg = avrg + list.get(i);

        }
        avrg = avrg / list.size();

        System.out.printf("Max value is %d\n", Collections.max(list));
        System.out.printf("Min value is %d\n", Collections.min(list));
        System.out.printf("Average value is %f\n", avrg);
    }
}
