package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Toy;

public class Controller {
    private iGetModel model;
    private iGetView view;
    private List<Toy> toys = new ArrayList<Toy>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean getNewIteration = true;
        while (getNewIteration) {
            int command = view.mainMenu();
            switch (command) {
                case 1:

                    System.out.println("Добавили игрушку в магазин!");
                    break;
                case 2:
                    System.out.println("Изменили вес игрушки!");
                    break;
                case 3:
                    System.out.println("Выбрали призовую игрушку!");
                    break;
                case 4:
                    System.out.println("Забрали призовую игрушку!");
                    break;
                case 5:
                    System.out.println("Вышли из программы!");
                    getNewIteration = false;
                    break;
            }

        }
    }
}
