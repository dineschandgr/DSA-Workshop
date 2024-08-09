package programs.datastructures.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(100);
        System.out.println("list contains "+list.contains(5));
        System.out.println("Index of "+list.indexOf(200));
        System.out.println(list);
        list.deleteFirst();
        System.out.println(list);
        list.deleteLast();
        System.out.println(list);

    }
}