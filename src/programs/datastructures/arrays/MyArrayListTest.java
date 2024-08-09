package programs.datastructures.arrays;


public class MyArrayListTest {
    public static void main(String args[]) {
        MyArrayList numbers = new MyArrayList(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
        System.out.println(numbers);
        numbers.insertAt(200,2);
        numbers.insertAt(500,1);
        numbers.insertAt(500,1);
        numbers.insertAt(500,1);
        numbers.insertAt(500,1);
        System.out.println(numbers);
        numbers.removeAt(3);
        numbers.removeAt(1);
        System.out.println(numbers);
        numbers.print();

        MyArrayList other = new MyArrayList(3);
        other.insert(10);
        other.insert(40);
        other.insert(50);

        other.print();

    }
}