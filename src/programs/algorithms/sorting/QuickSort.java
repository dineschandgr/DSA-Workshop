package programs.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr) {
        int end = arr.length-1;
        sort(arr,0,end);
    }

    private void sort(int[] arr, int start, int end) {
        if(start > end)
            return;
        //partition
        int pivotIndex = partition(arr,start,end);
        //sort left
        sort(arr,start,pivotIndex-1);
        //sort right
        sort(arr,pivotIndex+1, end);
    }

    private int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int boundary = start-1;
        for(int i = start; i < arr.length; i++) {
            if(arr[i] <= pivot) {
                boundary++;
                swap(arr,boundary,i);
            }
        }
        return boundary;
    }

    private void swap(int[] arr, int index1, int index2) {
        var temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
