package programs.algorithms.recursion;

import java.util.HashMap;
import java.util.Map;

class FibonacciMemoization {

    static private final Map<Integer, Integer > memoizeTable = new HashMap<>();
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println("recursion count "+count);
    }

    public static int fibonacci(int n){

        //base condition
        if(n == 0 || n == 1)
            return n;

        if (memoizeTable.containsKey(n)) {
            // getting value from the stored result(s)
            return memoizeTable.get(n);
        }
        count++;
        //recursive calls
        System.out.println("calling fibonacci for number "+ n);
        int result =  fibonacci(n-1) + fibonacci(n-2);
        memoizeTable.put(n, result);
        return result;

    }
}