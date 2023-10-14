package hw4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ex1(10);
        ex2();
        ex3(10);
    }

    static void ex1(int n) {
        System.out.println("""

                Задание 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
                Решение:""");

        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(-9, 10));
        }
        System.out.println("Начальный список -> " + linkedList);
        reverseArray(linkedList);
        System.out.println("Перевернутый список -> " + linkedList);

    }

    static void ex2() {
        System.out.println("""

                Задание 2. Реализуйте очередь с помощью LinkedList со следующими методами:
                enqueue() - помещает элемент в конец очереди,
                dequeue() - возвращает первый элемент из очереди и удаляет его,
                first() - возвращает первый элемент из очереди, не удаляя.
                Решение:""");

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.enqueue(11);
        myLinkedList.enqueue(4.2f);
        myLinkedList.enqueue(2.3);
        myLinkedList.enqueue("10");
        myLinkedList.enqueue("test");
        myLinkedList.enqueue(true);
        myLinkedList.enqueue(5);
        System.out.println("Список после нескольких enqueue -> " + myLinkedList);

        System.out.println("Результат метода dequeue -> " + myLinkedList.dequeue());
        System.out.println("Список после dequeue -> " + myLinkedList);

        System.out.println("Результат метода first -> " + myLinkedList.first());
        System.out.println("Список после first -> " + myLinkedList);
    }

    static void ex3(int n) {
        System.out.println("""

                Задание 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.
                Решение:""");

        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(-9, 10));
        }
        System.out.println("Начальный список -> " + linkedList);
        System.out.println("Сумма элементов -> " + sumLinkedList(linkedList));
        System.out.println("Итоговый список сохранился -> " + linkedList);
    }

    static void reverseArray(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        list.clear();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
    }

    static int sumLinkedList(LinkedList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }
}
