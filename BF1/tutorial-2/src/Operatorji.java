public class Operatorji {

    /*

    + - * / %
    += -= *= /=

     */

    public static void osnovniOperatorji (){

        int a = 5;
        int b = 2;

        System.out.println("a in b sta:");
        System.out.println( a );
        System.out.println( b );

        System.out.println( a + b );    // ctrl + d
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( (float) a / b );
        System.out.println( a % b );
    }

    public static void special () {

        int a = 1;
        System.out.println( a );

//        a = a + 2;
        a += 2;
        System.out.println( a );

        a -= 10;
        System.out.println( a );

        a *= 3;
        System.out.println( a );

        a /= 3;
        System.out.println( a );

//        a = a + 1;
//        a += 1;
        a ++;
        System.out.println( a );

        int c = 1;
        System.out.println("c:");

        System.out.println( c );
        System.out.println( c++ );
        System.out.println( c );
        System.out.println( ++c );

    }


}
