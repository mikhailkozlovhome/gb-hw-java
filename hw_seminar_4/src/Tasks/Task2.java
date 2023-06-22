package Tasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    // Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
    // помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
    // очереди и удаляет его, first() - возвращает первый элемент из очереди, не
    // удаляя.

    public static void execute() {
        LinkedList<String> queue = new LinkedList<>();

        System.out.println(enqueue(queue, "first element"));
        System.out.println(enqueue(queue, "second element"));
        System.out.println(enqueue(queue, "third element"));
        System.out.println(enqueue(queue, "new element"));
        System.out.println(dequeue(queue));
        System.out.println(first(queue));
    }

    private static String first(LinkedList<String> queue) {
        // возвращает первый элемент из очереди, не удаляя
        return queue.peek();
    }

    private static String dequeue(LinkedList<String> queue) {
        // возвращает первый элемент из очереди и удаляет его
        return queue.pop();
    }

    private static String enqueue(LinkedList<String> queue, String str) {
        //помещает элемент в конец очереди
        queue.addLast(str);
        return queue.toString();
    }

}
