public class Helper {
    public static void hi(int n){
        if(n==0) System.out.println("Stop!");
        else {
            System.out.println("HI!");
            hi(n - 1);
        }
    }

    public static int sum(int n){
        if(n == 1) return 1; // base case
        else return sum(n-1) + n; // recursive step
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

    // factorial function
    public static int factorial(int n){
        if(n == 0) return 1; // because 0! = 1 by definition
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
        System.out.println("CURRRENT STRING: " + s);
        if ( s.length() < 2) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1,s.length()-1));

    }

    public static long fibonacci(int n){
        if (n < 2) return 1; // if startring form 0 we retun n : 0,1,1,2,3...
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

    public static long [] memory = new long[100000]; // at the beginning 0,0,0,0,0,0,0...

    public static long fibonacciMemo(int n){
        if(n < 2 ) return 1;

        if (memory[n] != 0) return memory[n];

        memory[n] = fibonacciMemo(n-1) + fibonacciMemo(n-2);
        return memory[n];
    }

    public static int frog(int rocks, int maxJump){
        if (rocks == 0) return 1; // valid path and only 1 way to jump from last rock
        if (rocks < 0) return 0; // invalid path

        if(maxJump == 1) return 1; // not necessarry for function to work

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

    public static void hanoiTowers(int discs, char from, char inter, char to){
        if (discs == 1) System.out.println("Disk 1 from " + from + " to " +to);
        else{
            hanoiTowers(discs-1,from, to, inter);// move n-1 discs to spare tower
            System.out.println("Disk " + discs + " from " + from + " to " + to);
            hanoiTowers(discs-1, inter, from, to);
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
