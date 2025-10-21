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

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( (float) a / b );    // casting
        System.out.println( a / (float) b );    // casting
        System.out.println( a % b);             // module

    }

    public static void special(){

        int a = 5;

        a += 3;    //  a = a + 3;
        System.out.println( a );

        a -= 78;
        System.out.println( a );

        a *= 13;
        System.out.println( a );

        a /= 14;
        System.out.println( a );

        a++;    //  a = a + 1;  or a += 1;
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

        // variables
        int a = 8;
        int b = 3;

        int c = Math.max(a, b);
        System.out.println( c );

        c = Math.min( a, b);
        System.out.println( c );

        c = (int) Math.pow( a, b);      // casting
        System.out.println( c );

        System.out.println( Math.round( 156.87f ) );
        System.out.println( Math.round( 156.17f ) );
        System.out.println( Math.floor( 156.87f ) );
        System.out.println( Math.floor( 156.17f ) );
        System.out.println( Math.ceil( 156.87f ) );
        System.out.println( Math.ceil( 156.17f ) );

        System.out.println( (int) 2.9f );

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );

        System.out.println( (int) (Math.random() * 6 - 3)  );
        System.out.println( (int) (Math.random() * 6 - 3)  );
        System.out.println( (int) (Math.random() * 6 - 3)  );
        System.out.println( (int) (Math.random() * 6 - 3)  );
        System.out.println( (int) (Math.random() * 6 - 3)  );


    }

}
