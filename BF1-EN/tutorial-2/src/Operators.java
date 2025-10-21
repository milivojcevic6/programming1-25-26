public class Operators {

    /*

    + - * / %

     */

    public static void basicOperators(){

        // variables
        int a = 5;
        int b = 2;

        System.out.println( a + b );     // sout
        System.out.println( a - b );     // ctrl + d
        System.out.println( a * b );     // ctrl + d
        System.out.println( a / b );     // ctrl + d
        System.out.println( (float) a / b );     // casting
        System.out.println( a / (float) b );     // casting
        System.out.println( a % b );        //  module

    }

    public static void special(){

        int a = 5;

        a += 17;    //  same as a = a + 17;
        System.out.println( a );

        a -= 66;
        System.out.println( a );

        a *= -3;
        System.out.println( a );

        a /= 5;
        System.out.println( a );

        a++;    // a = a + 1; or a += 1;
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





