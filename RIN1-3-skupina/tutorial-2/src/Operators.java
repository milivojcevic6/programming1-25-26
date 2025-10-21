public class Operators {

    /*

    + - * /

     */

    public static void basicOperators(){

        // spremenljivke
        int a = 5;
        int b = 2;

        System.out.println( a );
        System.out.println( b );

        System.out.println( a+b );      // ctrl + d
        System.out.println( a-b );
        System.out.println( a*b );
        System.out.println( a/b );
        System.out.println( a/(float)b );   // casting
        System.out.println( (float)a/b );   // casting
        System.out.println( a % b );        // module

    }

    public static void special(){

        int a = 5;
        System.out.println( a ); // sout

        a += 10; // same as a = a + 10;
        System.out.println( a );

        a -= 7;
        System.out.println( a );

        a *= 3;
        System.out.println( a );

        a /= 4;
        System.out.println( a );

        a++; // a = a + 1    or   a += 1
        System.out.println( a );

        a--;
        System.out.println( a );

        int b = 1;
        System.out.println( b );
        System.out.println( b++ );
        System.out.println( b );
        System.out.println( ++b );

    }

    public static void nums(){

        int a = 8;
        int b = 3;

        int c = a+b;
        System.out.println( c );

        c = Math.max( a, b );
        System.out.println( c );

        c = Math.min( a, b );
        System.out.println( c );

        c = (int) Math.pow(a, b);
        System.out.println( c );

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );

        System.out.println("RANDOM in the range -5 & 3");
        System.out.println( (int) (Math.random() * 9 - 5 ) );
        System.out.println( (int) (Math.random() * 9 - 5 ) );
        System.out.println( (int) (Math.random() * 9 - 5 ) );
        System.out.println( (int) (Math.random() * 9 - 5 ) );
        System.out.println( (int) (Math.random() * 9 - 5 ) );
        System.out.println( (int) (Math.random() * 9 - 5 ) );

        System.out.println("Double casting");
        double x = 2.9;
        System.out.println( x );
        System.out.println( (int) x );
        System.out.println( Math.ceil(x) );
        System.out.println( (int) Math.ceil(x) );
        System.out.println( Math.round(x) );
        System.out.println( Math.round(2.4) );

    }



}











