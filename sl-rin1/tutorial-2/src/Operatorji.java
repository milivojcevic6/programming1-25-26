public class Operatorji {

    /*

    + - * / %


     */

    public static void osnovniOperatorji(){

        // spremenljivke
        int a = 5;
        int b = 2;

        System.out.println( a );
        System.out.println( b );

        System.out.println( a + b );        // ctrl + d
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( (float) a / b );    // casting
        System.out.println( a / (float) b );    // casting
        System.out.println( a % b );            // module

    }

    public static void special(){

        int a = 5;
        System.out.println( a );    // sout

        a += 40;                    //same as a = a + 40;
        System.out.println( a );

        a -= 7;
        System.out.println( a );

        a *= 12;
        System.out.println( a );

        a /= 3;
        System.out.println( a );

        a++;   //a += 1 or a = a + 1
        System.out.println( a );

        a--;    //  a -= 1 or a = a - 1
        System.out.println( a );

        int x = 1;
        System.out.println( x );
        System.out.println( x++ );
        System.out.println( x );
        System.out.println( ++x );


    }

    public static void nums (){

        int a = 8;
        int b = 3;

        System.out.println( a );
        System.out.println( b );

        int c = Math.max( a, b );
        System.out.println( c );

        c = Math.min( a, b );
        System.out.println( c );

        c = (int) Math.pow( a, b);  // casting
        System.out.println( c );

//        Math.random()

    }


}
