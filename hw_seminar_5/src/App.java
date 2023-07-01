import java.util.HashMap;
import java.util.List;

import Solutions.FillArray;
import Solutions.FillPhoneBook;
import Solutions.HeapSort;
import Solutions.PrintArray;
import Solutions.PrintPhoneBook;

public class App {
    public static void main(String[] args) throws Exception {

        // Task 1
        // Реализуйте структуру телефонной книги с помощью HashMap. Программа также
        // должна учитывать, что во входной структуре будут повторяющиеся имена с
        // разными телефонами, их необходимо считать, как одного человека с разными
        // телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.(можно
        // выводить без сортировки, но обязательно в отдельном методе)

        System.out.println("Task 1");

        HashMap<String, List<Integer>> phoneBook = new HashMap<>();
        String[] arrPhone = { "Ivanov;123456", "Petrov;234567", "Sidorov;345678", "Ivanov;456789", "Sidorov;567890",
                "Sidorov;678901" };

        phoneBook = FillPhoneBook.fillPB(arrPhone);
        PrintPhoneBook.printPB(phoneBook);

        System.out.println();

        // Task 2
        // Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в
        // Интернете и включить в проект)

        System.out.println("Task 2");
        int length = 10;
        int arr[] = new int[length];
        FillArray.fillArray(arr);

        System.out.println("Unsorted array is");
        PrintArray.printArray(arr);

        HeapSort.sort(arr);

        System.out.println("Sorted array is");
        PrintArray.printArray(arr);

        System.out.println();

    }
}
