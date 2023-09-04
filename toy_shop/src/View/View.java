package View;

import java.util.Scanner;

import Controller.iGetView;

public class View implements iGetView {

    @Override
    public int mainMenu() {
        int res = 0;
        System.out.println("Главное меню");
        System.out.println("1: Добавить игрушку");
        System.out.println("2: Изменить вес игрушки");
        System.out.println("3: Выбрать призовую игрушку");
        System.out.println("4: Забрать призовую игрушку");
        System.out.println("5: Выход");

        while (true) {
            res = promptInt("Введите пункт меню: ");
            if (0 < res & res < 9) {
                return res;
            }

        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

}
