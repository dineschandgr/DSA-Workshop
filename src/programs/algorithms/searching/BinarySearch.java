package programs.algorithms.searching;

public class BinarySearch {
    public int searchIteration(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;
        int middleIndex;
        while(left <= right) {
            middleIndex = (left + right) / 2;

            if(element == arr[middleIndex])
                return middleIndex;

            if(element < arr[middleIndex])
                right = middleIndex - 1;
            else if(element > arr[middleIndex])
                left = middleIndex + 1;

        }
        return -1;
    }

    public int searchRecursion(int[] arr, int element) {
        return search(arr,element, 0,arr.length-1);
    }

    private int search(int[] arr,int element, int left, int right) {

        if(left > right)
            return -1;

        int middleIndex = (left + right) / 2;

        if(element == arr[middleIndex])
            return middleIndex;

        if(element < arr[middleIndex])
            return search(arr, element, left, middleIndex - 1);
        else if(element > arr[middleIndex])
            return search(arr, element, middleIndex + 1, right);

        return -1;
    }
}