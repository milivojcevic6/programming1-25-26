import java.util.SortedMap;

public class Main {
    public static void main(String[] args){
        // RECURSION
        //Helper.hi(5);
        System.out.println("Sum from 0 to 3: " + Helper.sum(3));
        // factorial
        System.out.println("Factorial of 5: " + Helper.factorial(5));
        //palindrome
        System.out.println("Is racecar a palindrome? " + Helper.palindrome("kayak"));
        long start = System.currentTimeMillis();
        //System.out.println("Fibonacci at index 50: " + Helper.fibonacci(50));
        long end = System.currentTimeMillis();
        System.out.println("Regular fib for index 50: " + (end - start)/1000 + " seconds");
        start = System.currentTimeMillis();
        System.out.println("Fibonacci memo at index 50: " + Helper.fibonacciMemo(50));
        end = System.currentTimeMillis();
        System.out.println("Memoization fib for index 50: " + (end - start)/1000 + " seconds");
        System.out.println("GCD of 48 and 18: " + Helper.gcd(18,48));

        // you have frog that jumps
        // it can jump up to some maxJump distance e.g. 1,2,3
        // we have rocks over river and we want to cross the river using rocks
        // total number of ways to cross it
        System.out.println("How many ways if 3 rocks and maxJump = 2? " + Helper.frog(4,1));

        // TOWERS OF HANOI
        Helper.hanoiTowers(4, 'A','B', 'C');

    }
}