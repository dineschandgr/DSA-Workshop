package programs.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        boolean isSorted;
        for(int i = 0; i < arr.length; i++) {
            isSorted = true;
            for(int  j =  1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    isSorted = false;
                }
                if(isSorted)
                    return;
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        var temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}