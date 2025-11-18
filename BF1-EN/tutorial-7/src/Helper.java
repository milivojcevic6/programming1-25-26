public class Helper {
    public static void hi(int n){
        if(n == 0) System.out.println("STOPPPPPP");
        else {
            System.out.println("HI!");
            hi(n-1);
        }
    }

    public static int sum(int n){
        if(n==1) return 1; // base case (trivial)
        else return sum(n-1) + n; // recursive step
    }

    public static int factorial(int n){
        if(n < 2) return 1;
        else return factorial(n-1) * n;
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
        System.out.println("CURRENT STRING: " + s);
        if(s.length()<2) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1,s.length()-1));
    }

    public static long fibonacci(int n){
        if(n < 2) return 1; // return n if start from 0
        else return fibonacci(n-2) + fibonacci(n-1);
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

    public static long [] memory = new long[100000]; // by default {0,0,0,0,0,0,0,0,...}

    public static long fibonacciMemo(int n){
        if(n < 2) return 1;

        if(memory[n] != 0) return memory[n];

        memory[n] = fibonacciMemo(n-2) + fibonacciMemo(n-1);
        return memory[n];
    }

    public static int frog(int rocks, int maxJump){
        if(rocks == 0) return 1; // just jump once; valid path
        if(rocks < 0) return 0; // invalid path; frog will fall into second river

        int ways = 0;
        for(int i = 1; i <= maxJump; i++){
            ways += frog(rocks-i,maxJump);
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

    public static void hanoiTowers(int discs, char from, char inter, char to){
        if(discs == 1) System.out.println("Disk 1 from " + from + " to " + to);
        else{
            hanoiTowers(discs-1,from, to ,inter);// moved n-1 disks to spare tower
            System.out.println("Disk " + discs + " from " + from + " to " + to);
            hanoiTowers(discs-1, inter,from,to);
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

    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b,a % b);
    }

        /*
     Example: gcd(48,18)
     gcd(48,18) → gcd(18,12)
     gcd(18,12) → gcd(12,6)
     gcd(12,6)  → gcd(6,0)
     gcd(6,0)   → 6
    */

}
