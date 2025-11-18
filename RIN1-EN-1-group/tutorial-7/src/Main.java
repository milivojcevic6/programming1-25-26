public class Main {
    public static void main(String[] args) {
        // RECURSION
        //Helper.hi();

        // Function that sums up integers up to n
        // n=3 1+2+3
        System.out.println("Sum from 0 to 3: " + Helper.sum(3));
        System.out.println("Factorial of 5: " + Helper.factorial(5));
        // How to implement palindrome checker
        System.out.println("Is kayak palindrome? " + Helper.isPalindrome("kayak"));
        System.out.println("GCD of 48 and 18: " + Helper.gcd(48,18));
        long start = System.currentTimeMillis();
        //System.out.println("Fibonacci at 5: " + Helper.fibonacci(50));
        System.out.println("Fibonacci at 5: " + Helper.fibonacciMemoization(5000));
        long end = System.currentTimeMillis();
        System.out.println("Time for regular fib: " + (end - start));

        // we have a frog that jumps; different frogs jump to different distances;
        // we have rocks over river; frog needs to cross the river;
        // we have number of rocks and biggest jump
        // count ways for crossing the river
        System.out.println("5 rocks max jump 2: " + Helper.frogJumping(3,2));
        Helper.doTowers(3,'A','B','C');
    }
}