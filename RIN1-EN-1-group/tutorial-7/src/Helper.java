public class Helper {
    public static void hi(){
        System.out.println("hi!");
        hi();
    }

    public static int sum(int n){
        if(n == 0) return 0; // base case (stopping condition)
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

    public static long factorial(int n){
        if(n == 0) return 1;
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

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        System.out.println("Current string: " + s);
        if (s.length() <= 1) return true; // only 1 char left no thing to compare with
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1,s.length()-1));
    }

    public static int gcd(int a, int b){
        if (b == 0) return a; // base case
        else return gcd(b, a%b);
    }

        /*
     Example: gcd(48,18)
     gcd(48,18) → gcd(18,12)
     gcd(18,12) → gcd(12,6)
     gcd(12,6)  → gcd(6,0)
     gcd(6,0)   → 6
    */


    public static long fibonacci(int n){
        if(n <= 1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
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

    public static long[] memory = new long [100000];

    public static long fibonacciMemoization(int n){
        if(n <= 1) return 1;

        if(memory[n] != 0) return memory[n];

        memory[n] = fibonacciMemoization(n-1) + fibonacciMemoization(n-2);
        return memory[n];

    }

    public static int frogJumping(int rocks, int maxJump){
        if( rocks == 0) return 1; // only 1 way
        if( rocks < 0) return 0;

        int ways = 0;
        for(int i = 1; i <= maxJump; i++){
            ways += frogJumping(rocks - i, maxJump);
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


    public static void doTowers(int topN, char from, char inter, char to){
        if(topN == 1){
            System.out.println("Moving disk 1 from " + from + " to " + to);
        }else{
            doTowers(topN-1, from, to, inter);
            System.out.println("Disk " + topN + " form " + from + " to " + to);
            doTowers(topN-1, inter, from, to);
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
