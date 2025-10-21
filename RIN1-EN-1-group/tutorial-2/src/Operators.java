public class Operators {

    /*

    + - * / %
    += ++

     */

    public static void basicOperators(){

        // variables
        int a = 5;
        int b = 2;

        System.out.println( a );        // sout
        System.out.println( b );        // ctrl + d

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( (float) a / b );
        System.out.println( a / (float) b );
        System.out.println( a % b );

    }

    public static void special(){

        int a = 8;
        int b = 3;

        System.out.println( a );
        System.out.println( b );

        a += 7;                     // a = a + 7;
        System.out.println( a );

        a -= 2;
        System.out.println( a );

        a *= 61;
        System.out.println( a );

        a /= 13;
        System.out.println( a );

        // instead of a += 1 or a = a + 1
        a++;
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

    public static void nums(){

        int a = 8;
        int b = 3;

        int c = a + b;
        System.out.println( c );

        c = Math.max( a, b );
        System.out.println( c );

        c = Math.min( a, b );
        System.out.println( c );

        c = (int) Math.pow( a, b );     // casting
        System.out.println( c );

        System.out.println( 2.7f );     // f fr float
        System.out.println( (int) 2.7f );
        System.out.println( Math.round( 2.7f ) );   // rounds if >= 5
        System.out.println( Math.round( 2.4f ) );
        System.out.println( Math.ceil( 2.7f ) );    // opposite to Math.floor
        System.out.println( Math.ceil( 2.4f ) );

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( (int) (11 * Math.random() - 3) );   // int range -3,7

    }

}
