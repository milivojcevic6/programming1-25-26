public class Operators {

    /*

    + - * /

     */

    public static void basicOperators(){

        int a = 5;
        int b = 2;

        System.out.println( a+b );      // sout, ctrl +d
        System.out.println( a-b );
        System.out.println( a*b );
        System.out.println( a/b );
        System.out.println( ( float ) a/b );      // casting
        System.out.println( a/ ( float ) b );      // casting
        System.out.println( ( float ) (a/b) );      // casting
        System.out.println( a % b );                // module
    }

    public static void special(){

        int a = 5;
        System.out.println( a );

        a += 13;    //  a = a + 13;
        System.out.println( a );
        // -= *= /=
    }
}
