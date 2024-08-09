package programs.datastructures.linkedlist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyDoublyLinkedTest {

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(100);
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        list.reverse();
        list.addLast(200);
        System.out.println("index from last "+list.indexFromLast(1));
        list.deleteLast();
        System.out.println(Arrays.toString(list.toArray()));

    }


}