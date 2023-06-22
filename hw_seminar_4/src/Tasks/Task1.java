package Tasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернет “перевернутый” список.

    private static LinkedList<String> list = new LinkedList<>();

    public static void execute() {

        boolean getIteration = true;

        while (getIteration) {
            String cmd = InputUser("Enter the command");
            String[] cLine = cmd.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT": // выход из приложение
                    getIteration = false;
                    break;
                case "PRINT": // выводить указанный элемент на экран
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST": // выводит на экран список и удаляет его
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                    break;
                case "REVERSE": // выводит на экран список в обратном порядке без удаления
                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.println(list.get(i));
                    }
                    break;
                default:
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine, list);
                        } else {
                            list.addFirst(cLine[0]);
                        }
                    } else {
                        list.addFirst(cLine[0]);
                    }
                    break;
            }
        }
    }


    private static String InputUser(String message) {
        System.out.print(message + " -> ");
        Scanner scannerNumber = new Scanner(System.in);
        return scannerNumber.nextLine();
    }

    private static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static List<String> adder(String[] splitted, List<String> list) {
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size() - num; i < num + 1; ++i) {
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }
}
