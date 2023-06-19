package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void execute() {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа

        int length = 10;
        int lowBound = -10;
        int upBound = 10;
        Random rnd = new Random();
        List<Integer> numL = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            numL.add(rnd.nextInt(lowBound, upBound));
        }

        System.out.println(numL);

        delEvenNumber(numL);

        System.out.println(numL);
    }

    private static void delEvenNumber(List<Integer> list) {
        List<Integer> delList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                delList.add(list.get(i));
            }
        }
        list.removeAll(delList);
    }
}
