import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("TASK 1");
        task1();

        System.out.println("TASK 2");
        task2();

        System.out.println("TASK 3");
        task3();

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
