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

        System.out.println( a+b );
        System.out.println( a-b );
        System.out.println( a*b );
        System.out.println( a/b );
        System.out.println( (float) a/b );
        System.out.println( (float) (a/b) );
        System.out.println( a%b );

    }

    public static void special(){

        int a = 5;
        System.out.println( a );   // sout

        a += 4;            // a = a + 2;
        System.out.println( a );

        a /= 3;            // a = a / 2;
        System.out.println( a );

        a -= 70;            // a = a - 2;
        System.out.println( a );

        a *= 14;            // a = a * 2;
        System.out.println( a );

        // a = a + 1;
        // a += 1;
        a++;
        System.out.println( a );

        a--;
        System.out.println( a );

        int c = 1;
        System.out.println( c );
        System.out.println( c++ );
        System.out.println( c );
        System.out.println( ++c );

    }

    public static void nums (){

        int a = 8;
        int b = 3;

        int c = a +b;
        System.out.println( c );

        c = Math.max(a, b);
        System.out.println( c );

        c = Math.min(a, b);
        System.out.println( c );

        c = (int) Math.pow(a, b);
        System.out.println( c );

        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );

        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );
        System.out.println( (int) (Math.random() * 17 + 11) );

    }

}







