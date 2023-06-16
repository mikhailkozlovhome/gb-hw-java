
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void execute() throws IOException {

        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
        // каждой итерации запишите в лог-файл.

        Logger logger = Logger.getLogger(Task2.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fl = new FileHandler("log.txt");
        // logger.addHandler(ch);
        logger.addHandler(fl);
        SimpleFormatter sFormat = new SimpleFormatter();
        // ch.setFormatter(sFormat);
        fl.setFormatter(sFormat);

        Integer[] arr = { 1, 3, 5, 2, 8, 4, 7, 20, 11 };

        logger.log(Level.INFO, "Original array:");
        logger.info(Arrays.toString(arr));

        bubbleSort(arr);

        logger.log(Level.INFO, "Sorted array:");
        logger.info(Arrays.toString(arr));

    }

    private static void bubbleSort(Integer[] sortArr) {
        Logger logger = Logger.getLogger(Task2.class.getName());
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.log(Level.INFO, String.format("меняем местами %d-й и %d-й элементы", j, j+1));
                }
            }
            logger.log(Level.INFO, String.format("Массив после %d-й итерации", i + 1));
            logger.info(Arrays.toString(sortArr));
        }
    }

}
