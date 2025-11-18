public class Main {
    public static void main(String[] args) {
        Helper.hi(5);
        System.out.println("Sum upto 4: " + Helper.sum(4));
        System.out.println("Fact of 5: " + Helper.factorial(5));
        System.out.println("Is racecar a palindrome? " + Helper.isPalindrome("racecar"));
        long start = System.currentTimeMillis();
        //System.out.println("Fibonacci at index 50: " + Helper.fibonacci(51));
        long end = System.currentTimeMillis();
        System.out.println("TIME FOR REGULAR: " + (end - start)/1000 + " seconds");
        start = System.currentTimeMillis();
        System.out.println("Fibonacci memo of 50: "+ Helper.fibonacciMemo(500));
        end = System.currentTimeMillis();
        System.out.println("TIME FOR MEMO VERSION: " + (end - start)/1000 + " seconds");

        System.out.println("Number of ways for from with max jump 2 to cross 3 rocks: " + Helper.frog(4,2));

        Helper.hanoiTowers(4, 'A','B','C');

    }
}