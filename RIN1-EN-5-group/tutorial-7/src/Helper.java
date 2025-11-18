public class Helper {
    public static void hi(int n){
        if(n == 0) System.out.println("STOP");
        else {
            System.out.println("Hi!");
            hi(n - 1);
        }
    }

    public static int sum(int n){
        if (n == 0) return 0; // base case
        else return n + sum(n-1); // recursive step
    }

        /*
     Example: sum(3)
     sum(3) = 3 + sum(2)
     sum(2) = 2 + sum(1)
     sum(1) = 1 + sum(0)
     sum(0) = 0

     Going back up:
     sum(1) = 1
     sum(2) = 3
     sum(3) = 6
    */

    public static int factorial(int n){
        if( n == 0) return 1; // by definition 0! = 1
        else return n * factorial(n-1);
    }

     /*
     Example: fact(5)
       5 * fact(4)
           4 * fact(3)
               3 * fact(2)
                   2 * fact(1)
                       1 * fact(0)
                            = 1

     Going back up:
     fact(1) = 1
     fact(2) = 2
     fact(3) = 6
     fact(4) = 24
     fact(5) = 120
    */

    public static boolean palindrome(String s){

        if(s.length() < 2) return true;
        else {
            System.out.println("CURRENT STRING: " + s);
            System.out.println("Chars compared: " + s.charAt(0) + " and " + s.charAt(s.length()-1));
        }

        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        return palindrome(s.substring(1,s.length()-1));
    }

    public static long fibonacci(int n){
        if(n <= 1) return 1; // from 0 we would retrn n
        else return fibonacci(n-1) + fibonacci(n-2); // recursive step
    }

       /*
     Example: fibonacci(3)
        fibonacci(2)
            fibonacci(1) = 1
            fibonacci(0) = 0
            => 1 + 0 = 1
        fibonacci(1) = 1
        => 1 + 1 = 2

     Complexity: O(2^n)
     (Many repeated computations; memoization can fix this.)
    */

    public static long [] memory = new long[1000000];

    public static long fibonacciMemo(int n){
        if(n <= 1) return 1; // from 0 we would retrn n
        if(memory[n] != 0) return memory[n]; // already stored value for fib index n

        memory[n] = fibonacciMemo(n-1) + fibonacciMemo(n-2);
        return memory[n];
    }

    public static int frog(int rocks, int maxJump){
        if(rocks == 0) return 1; // only one way to get from last rock to the shore
        if(rocks < 0) return 0; // invalid input

        int ways = 0;
        for(int i = 1; i <= maxJump; i++){
            ways += frog(rocks - i,maxJump);
        }

        return ways;
    }

        /*
    * frog(3)
         ├── jump 1 → frog(2)
         │            ├── jump 1 → frog(1)
         │            │            ├── jump 1 → frog(0) = 1
         │            │            └── jump 2 → frog(-1) = 0
         │            │            (total for frog(1) = 1 + 0 = 1)
         │            └── jump 2 → frog(0) = 1
         │            (total for frog(2) = 1 + 1 = 2)
         └── jump 2 → frog(1)
                      ├── jump 1 → frog(0) = 1
                      └── jump 2 → frog(-1) = 0
                      (total for frog(1) = 1)
*/

    public static void hanoiTowers(int disks, char start, char other, char end){
        if(disks == 1){
            System.out.println("Disk 1 from " + start + " to " + end);
        }else{
            hanoiTowers(disks - 1, start, end , other);
            System.out.println("Disk "+disks+ " from " + start + " to " + end);
            hanoiTowers(disks - 1, other, start, end);
        }
    }

    /*
     Example flow for doTowers(3, A, B, C):

     Move 2 disks from A → B
        Move 1 disk A → C
        Move 2nd disk A → B
        Move 1 disk C → B

     Move disk 3 A → C

     Move 2 disks from B → C
        Move 1 disk B → A
        Move 2nd disk B → C
        Move 1 disk A → C
    */


}
