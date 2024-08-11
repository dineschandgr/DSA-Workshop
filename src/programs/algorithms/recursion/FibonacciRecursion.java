package programs.algorithms.recursion;

class FibonacciRecursion{

    static int count = 0;
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println("recursion count "+count);

    }

    public static int fibonacci(int n){

        //base condition
        if(n == 0 || n == 1)
            return n;
        count++;

        //recursive calls
        System.out.println("calling fibonacci for number "+ n);
        return fibonacci(n-1) + fibonacci(n-2);

    }
}