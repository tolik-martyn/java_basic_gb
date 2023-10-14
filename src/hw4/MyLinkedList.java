package hw4;

import java.util.LinkedList;

public class MyLinkedList {
    private final LinkedList<Object> linkedList;

    MyLinkedList() {
        linkedList = new LinkedList<>();
    }

    void enqueue(Object value) {
        linkedList.addLast(value);
    }

    Object dequeue() {
        return linkedList.pollFirst(); // при пустом списке возвращает null.
    }

    Object first() {
        return linkedList.peekFirst(); // при пустом списке возвращает null.
    }

    public String toString() {
        return linkedList.toString();
    }
}
