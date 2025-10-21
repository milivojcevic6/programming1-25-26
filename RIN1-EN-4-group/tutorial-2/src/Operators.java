public class Operators {

    /*

    + - * / %

     */

    public static void basicOperators(){

        int a = 5;
        int b = 2;

        System.out.println( a );
        System.out.println( b );

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( (float) a / b );        // casting
        System.out.println( a / (float) b );        // casting
        System.out.println( a % b );                // module
    }

    public static void special(){

        int a = 1;

        a += 2; // same as a = a + 2;
        System.out.println(a);

        a -= 7; // same as a = a - 7
        System.out.println(a);

        a *= 13;
        System.out.println(a);

        a /= 4;
        System.out.println(a);

        a++;    //  a += 1; or a = a + 1;
        System.out.println( a );

//        a++;
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

        int c = Math.max( a, b );
        System.out.println( c );

        c = Math.min( a, b );
        System.out.println( c );

        c = (int) Math.pow( a, b);
        System.out.println( c );

        System.out.println( 2.7f );
        System.out.println( (int) 2.7f );
        System.out.println( Math.floor( 2.7f ) );
        System.out.println( Math.ceil( 2.7f ) );
        System.out.println( Math.round( 2.7f ) );
        System.out.println( Math.round( 2.4f ) );

        System.out.println( Math.random() );
        System.out.println( Math.random() );        // ctrl + d
        System.out.println( Math.random() );
        System.out.println( Math.random() );


    }

}









