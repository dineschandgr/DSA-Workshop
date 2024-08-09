package programs.datastructures.arrays;

import java.util.Arrays;

public class MyArrayList {
    private int count;

    private int[] numArray;

    public MyArrayList(int size) {
        numArray = new int[size];
    }

    public void insert(int value) {
        ResizeIfRequired();
        numArray[count++] = value;
    }

    private void ResizeIfRequired() {
        if (count == numArray.length) {
            int newArr[] = new int[count * 2];

            for (int i = 0; i < numArray.length; i++) {
                newArr[i] = numArray[i];
            }

            numArray = newArr;
        }
    }

    public void insertAt(int item, int index) {

        // validate index
        // shift items to the right of the new element

        if (index <= 0 || index >= count)
            throw new IllegalArgumentException();

        ResizeIfRequired();

        for (int i = count - 1; i >= index; i--) {
            numArray[i + 1] = numArray[i];
        }
        numArray[index] = item;
        count++;
    }

    public int indexOf(int value) {

        for (int i = 0; i < count; i++) {
            if (numArray[i] == value) {
                return i;
            }
        }

        return -1;
    }


    public void removeAt(int index) {

        // validate index
        // shift items to the left to fill the gap
        if (index <= 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) {
            numArray[i] = numArray[i + 1];
        }
        count--;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(numArray[i]);
        }
    }


    @Override
    public String toString() {
        return "Array [numArray=" + Arrays.toString(numArray) + "]";
    }
}