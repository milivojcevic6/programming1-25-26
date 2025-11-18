public class Main {
    public static void main(String[] args) {
        // RECURSION
        //Helper.step(5);
        System.out.println("Sum to 3: " + Helper.sum(5));
        System.out.println("Factorial of 5: " + Helper.factorial(5));
        System.out.println("Is kayak palindrome? " + Helper.isPalindrome("kayak"));
        System.out.println("GCD of 48 and 18: " + Helper.gcd(18,48) );
        long start = System.currentTimeMillis();
        //System.out.println("Fibonacci at 50: " + Helper.fibonacci(50));
        long end = System.currentTimeMillis();
        System.out.println("Time for regular fib: " + (end - start)/1000 + " seconds");
        start = System.currentTimeMillis();
        System.out.println("Fibonacci at 50: " + Helper.fibonacciMemo(5000));
        end = System.currentTimeMillis();
        System.out.println("Fib with memo: " + (end - start)/1000 + " seconds");

        System.out.println("Number of ways frog can jump over 4 rocks with max jump 2: " + Helper.frogJumping(3,2));

        Helper.doTower(3, 'A', 'B', 'C');
    }
}