package programs.algorithms.recursion;

class FibonacciRecursion{
    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }

    public static int fibonacci(int n){

        //base condition
        if(n == 0 || n == 1)
            return n;

        //recursive calls
        System.out.println("calling fibonacci for number "+ n);
        return fibonacci(n-1) + fibonacci(n-2);

    }
}