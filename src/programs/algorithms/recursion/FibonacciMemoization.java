package programs.algorithms.recursion;

import java.util.HashMap;
import java.util.Map;

class FibonacciMemoization {

    static private Map<Integer, Integer > memoizeTable = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }

    public static int fibonacci(int n){

        //base condition
        if(n == 0 || n == 1)
            return n;

        if (memoizeTable.containsKey(n)) {
            // getting value from the stored result(s)
            return memoizeTable.get(n);
        }

        //recursive calls
        System.out.println("calling fibonacci for number "+ n);
        int result =  fibonacci(n-1) + fibonacci(n-2);
        memoizeTable.put(n, result);
        return result;

    }
}