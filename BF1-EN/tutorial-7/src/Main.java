public class Main {
    public static void main(String[] args) {
        //Helper.hi(5);
        System.out.println("Sum up to 4: " + Helper.sum(5));
        // factorial 3! = 3 * 2 * 1
        // n! = n * (n-1) * ... * 1
        // 0! = 1, 1! = 1
        // n! = (n-1)! * n

        System.out.println("Factorial of 5: " + Helper.factorial(5));

        // check if palindrome using recursion
        // check char by char not reverse string
        // kayak
        //if k == k we good
        // if a == a???
        // base case s.length() < 2
        // substring (1,length -1)
        System.out.println("Is kayak palindrome? " + Helper.isPalindrome("anavolimilovana"));

        // fibonacci
        // fib(n) = fib(n-2) + fib(n-1)
        // fib(0) = 1 or 0 both okay
        // fib(1) = 1
        System.out.println("Number of rabbit pairs in month at index 7: " + Helper.fibonacci(7));
        long start = System.currentTimeMillis();
        //System.out.println("Number of rabbit pairs in month at index 7: " + Helper.fibonacci(51));
        long end = System.currentTimeMillis();
        System.out.println("TIME FOR REGULAR FIB: " + (end-start)/1000 + " seconds");
        start = System.currentTimeMillis();
        System.out.println("Number of rabbit pairs in month at index 7: " + Helper.fibonacciMemo(500));
        end = System.currentTimeMillis();
        System.out.println("TIME FOR MEMO FIB: " + (end-start)/1000 + " seconds");
        System.out.println("Frog with max jump 2 and 3 rocks: " + Helper.frog(4,2));
        Helper.hanoiTowers(3, 'A','B','C');
        System.out.println("GCD OF 48 and 18: " + Helper.gcd(18,48));


    }
}