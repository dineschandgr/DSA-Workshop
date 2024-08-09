package programs.datastructures.linkedlist;

import java.util.NoSuchElementException;

public class MyLinkedList {

    private class Node {

        private int value;
        private Node next;
        public Node(int value) {
            super();
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }


    private Node first;
    private Node last;
    private int size;

    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }
    public Node getLast() {
        return last;
    }
    public void setLast(Node last) {
        this.last = last;
    }

    public void addFirst(int value) {

        var newNode = new Node(value);

        if(isEmpty()) {
            first = newNode;
            last = first;
        }else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int value) {
        var newNode = new Node(value);

        if(isEmpty()) {
            first = newNode;
            last = first;
        }else {
            last.next = newNode;
            last = newNode;
        }

        size++;
    }

    public void deleteFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
        }else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void deleteLast() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
        }else {
            Node current = first;
            while(current.next != last){
                current = current.next;
            }

            current.next = null;
            last = current;
        }
        size--;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {

        int index = 0;
        Node current = first;
        while(current != null){
            if(current.value == value){
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    //O(1)
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}