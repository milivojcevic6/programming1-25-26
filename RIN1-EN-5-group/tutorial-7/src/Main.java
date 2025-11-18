public class Main {
    public static void main(String[] args) {
        // RECURSION
        //Helper.hi(5);

        System.out.println("Sum up to 4: " + Helper.sum(5));
        System.out.println("Factorial of 5: " + Helper.factorial(5));
        System.out.println("Is kayak palindrome? " + Helper.palindrome("anavolimilovana"));
        long start = System.currentTimeMillis();
        //System.out.println("Fibonacci at index 5: " + Helper.fibonacci(50));
        long end = System.currentTimeMillis();
        System.out.println("Total time for regular fib: " + (end - start)/1000 + " seconds");
        start = System.currentTimeMillis();
        System.out.println("Fibonacci at index 5: " + Helper.fibonacciMemo(500));
        end = System.currentTimeMillis();
        System.out.println("Total time for memo fib: " + (end - start)/1000 + " seconds");

        System.out.println("Frog max jump 2 and we have 4 rocks: " + Helper.frog(4,2));

        Helper.hanoiTowers(4,'A','B','C');
    }
}