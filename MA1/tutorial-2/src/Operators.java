public class Operators {

    /*

    + - * /

     */

    public static void basicOperators(){

        int a = 5;
        int b=2;

        System.out.println( a );
        System.out.println( b );

        System.out.println( a+b );              // sout     ctrl + d
        System.out.println( a-b );
        System.out.println( a*b );
        System.out.println( a/b );
        System.out.println( (float) a/b );          // casting
        System.out.println( a/ (float) b );          // casting
        System.out.println( a % b );                // module

    }

    public static void special(){

        int a = 5;
        System.out.println( a );

        a += 13; // isto a = a + 13;
        System.out.println( a );

        // -= *= /=

        a++;        // a += 1;  a = a + 1;
        ++a;
        System.out.println( a );

        a--;
        System.out.println( a );

        int x = 1;
        System.out.println( x );
        System.out.println( x++ );
        System.out.println( x );
        System.out.println( ++x );

    }


}
