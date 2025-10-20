public class Operators {

    /*

    + - * / %

     */

    public static void basicOperators(){

        // variables
        int a = 5;
        int b = 2;

        System.out.println( a );
        System.out.println( b );

        System.out.println( a+b );     // sout
        System.out.println( a-b );
        System.out.println( a*b );
        System.out.println( a/b );     // ctr + d
        System.out.println( (float) a/b );     // casting
        System.out.println( a/(float) b );     // casting
        System.out.println( a%b );

    }

    public static void special(){

        int a = 7;
        System.out.println( a );

        a += 18; // a = a + 18;
        System.out.println( a );

        a -= 9;
        System.out.println( a );

        a *= 61;
        System.out.println( a );

        a /= 4;
        System.out.println( a );

        a++;    //  a += 1; or a = a + 1;
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

        System.out.println( a );
        System.out.println( b );

        int c = Math.max( a, b );
        System.out.println( c );

        c = Math.min( a, b );
        System.out.println( c );

        c = (int) Math.pow( a, b);      // casting
        System.out.println( c );

        System.out.println( 2.7f );     // f stands for float
        System.out.println( (int) 2.7f );
        System.out.println( (int) 2.4f );
        System.out.println( Math.round(2.7f) );
        System.out.println( Math.round(2.4f) );
        System.out.println( Math.ceil(2.4f) );
        System.out.println( Math.floor(2.7f) );

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );

        System.out.println( (int) (Math.random() * 8 - 5) );
        System.out.println( (int) (Math.random() * 8 - 5) );
        System.out.println( (int) (Math.random() * 8 - 5) );
        System.out.println( (int) (Math.random() * 8 - 5) );
        System.out.println( (int) (Math.random() * 8 - 5) );

    }

}
