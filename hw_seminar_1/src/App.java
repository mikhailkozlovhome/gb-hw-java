import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * System.out.println("TASK 1");
         * task1();
         * 
         * System.out.println("TASK 2");
         * task2();
         * 
         * System.out.println("TASK 3");
         * task3();
         * 
         * System.out.println("TASK 4");
         * task4();
         * 
         * 
         * System.out.println("TASK 5");
         * task5();
         */

        System.out.println("TASK 8");
        task8();

        /**
         * System.out.println("TASK 9");
         * task9();
         */

    }

    private static void task9() {
        /*
         * Записать в файл следующие данные:
         * Name Surname Age
         * Kate Smith 20
         * Paul Green 25
         * Mike Black 23
         */
    }

    private static void task8() {
        /*
         * Задан массив, например, nums = [1,7,3,6,5,6].
         * Написать программу, которая найдет индекс i для этого массива
         * такой, что сумма элементов с индексами < i равна сумме
         * элементов с индексами > i.
         */

        int[] arr = { 1, 7, 3, 6, 5, 6 };
        int left_sum = 0;
        int right_sum = 0;
        int i = 0;
        int j = arr.length - 1;
        left_sum = left_sum + arr[i];
        right_sum = right_sum + arr[j];

        while (left_sum != right_sum) {
            if (left_sum < right_sum) {
                left_sum = left_sum + arr[i++];
            } else {
                right_sum = right_sum + arr[j--];
            }
        }

        for (int itemArr : arr) {
            System.out.printf("%d\t", itemArr);
        }
        System.out.println();
       
        System.out.printf("Index is: %d, element is: %d", i, arr[i]);

    }

    private static void task5() {
        /*
         * Во фразе "Добро пожаловать на курс по Java" переставить слова
         * в обратном порядке.
         */

        String str = "Welcome to Java course";
        String[] arr = str.split(" ");
        String res_str = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            res_str = res_str + arr[i];
            if (i != 0)
                res_str = res_str + " ";
        }

        System.out.printf("String '%s' in reverce order is: '%s'", str, res_str);
    }

    private static void task4() {
        /*
         * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
         * могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
         * восстановить выражение до верного равенства. Предложить хотя бы
         * одно решение или сообщить, что его нет.
         */
    }

    private static void task3() {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = iScanner.nextInt();
        iScanner.nextLine();
        System.out.print("Enter action: ");
        String action = iScanner.nextLine();
        System.out.print("Enter second number: ");
        int secondNumber = iScanner.nextInt();

        switch (action) {
            case "+":
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                break;
            case "/":
                System.out.printf("%d / %d = %f", firstNumber, secondNumber, (double) firstNumber / secondNumber);
                break;
            default:
                System.out.println("Wrong action :(");
                break;
        }
    }

    private static Boolean isPrimeNumber(int numb, int uppBound) {

        boolean result = true;

        for (int i = 2; i < uppBound; i++) {
            if ((numb > i) && (numb % i == 0)) {
                result = false;
                break;
            }
        }

        return result;
    }

    private static void task2() {
        // Вывести все простые числа от 1 до 1000

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter upper bound: ");
        int upperBound = iScanner.nextInt();

        System.out.printf("Prime numbers from 1 to %d is:\n", upperBound);

        for (int i = 2; i < upperBound + 1; i++) {

            if (isPrimeNumber(i, upperBound)) {
                System.out.printf("%d ", i);
            }
        }

        System.out.println();

    }

    private static void task1() {
        // Вычислить сумму чисел от 1 до n

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = iScanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of numbers from 1 to n is: " + sum);
    }
}
