package programs.algorithms.sorting;

public class MergeSort {
    public void sort(int[] arr) {


        if(arr.length < 2)
            return;

        //divide the array
        System.out.println("divide ");
        var middle = arr.length / 2;
        int[] left = new int[middle];

        for(int i = 0; i < middle; i++)
            left[i] = arr[i];

        int[] right = new int[arr.length - middle];

        for(int i = middle; i < arr.length; i++)
            right[i-middle] = arr[i];

        //sort each half
        sort(left);
        sort(right);

        //merge the result
        merge(left,right,arr);
    }

    public void merge(int[] left,int[] right, int[] result) {

        System.out.println("merge ");
        int i = 0,j = 0,k = 0;

        while(i < left.length && j < right.length) {
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while(i < left.length)
            result[k++] = left[i++];

        while(j < right.length)
            result[k++] = right[j++];
    }
}
