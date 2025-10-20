public class Operators {

    /*

    + - * / %
    += -=  ++ --

     */

    public static void basicOperators() {

        // variables
        int a = 5;
        int b = 2;

        System.out.println( a+b );
        System.out.println( a-b );
        System.out.println( a*b );
        System.out.println( a/b );
        System.out.println( (float) a/b );      // casting
        System.out.println( a/ (float) b );      // casting

        System.out.println( a % b);         // module

    }

    public static void special(){

        int a = 5;
        System.out.println( a );

        a += 3; //  a = a + 3;
        System.out.println( a );
        // -=
        // *=
        // /=

        a++;    // a += 1   or  a = a + 1
        System.out.println( a );

        a--;
        System.out.println( a );

        int x = 1;

        System.out.println( x );
        System.out.println( x++ );
        System.out.println( x );
        System.out.println( ++x );

    }

    public static void nums() {

        int a = 8;
        int b = 3;

        System.out.println(  Math.max( a, b ) );

        int c = Math.min( a, b);
        System.out.println( c );

        c = (int) Math.pow( a, b );   // cast
        System.out.println( c );

        // Math.floor(2.9f) => 2
        // Math.ceil(2.1f)  => 3
        // Math.round(2.4f) => 2
        // Math.round(2.5f) => 3
        // Math.random()  => range [0, 1) double
    }

}
