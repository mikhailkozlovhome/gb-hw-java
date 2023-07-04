import java.util.HashSet;

import NoteBookLib.NoteBook;

public class App {
    public static void main(String[] args) throws Exception {
        // создаем экземпляры класса ноутбук
        NoteBook nb1 = new NoteBook("Radeon Vega 7", 8, 29, 512, 16, 1700, 15.6, 1);
        NoteBook nb2 = new NoteBook("Intel Core i5", 6, 27, 256, 8, 2150, 15.6, 2);
        NoteBook nb3 = new NoteBook("Radeon Vega 7", 8, 29, 512, 16, 1700, 15.6, 3);

        // создаем множество из экземпляров класса ноутбук
        HashSet<NoteBook> nbSet = new HashSet<NoteBook>();

        // добавдяем созданные экземпляры в множество
        nbSet.add(nb1);
        nbSet.add(nb2);
        //nbSet.add(nb3);

        // выводим экземпляры в консоль
        System.out.println("Ноутбук 1: " + nb1);
        System.out.println("Ноутбук 2: " + nb2);
        System.out.println("Ноутбук 3: " + nb3);

        // сравниваем экземпляры
        System.out.println("Ноутбук 1 равен ноутбук 2, верно? " + nb1.equals(nb2));
        System.out.println("Ноутбук 1 равен ноутбук 3, верно? " + nb1.equals(nb3));

        // проверяем наличие экземпляров в множестве
        System.out.println("Ноутбук 1 есть в множестве, верно? " + nbSet.contains(nb1));
        System.out.println("Ноутбук 2 есть в множестве, верно? " + nbSet.contains(nb2));
        System.out.println("Ноутбук 3 есть в множестве, верно? " + nbSet.contains(nb3));

    }
}
