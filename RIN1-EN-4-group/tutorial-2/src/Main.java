public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");       // ctrl + /

//        variables();
//        Operators.basicOperators();
//        Operators.special();
        Operators.nums();

    }

    private static void variables() {

        int grade = 6;
        System.out.println( grade );       // sout

        grade = 7;
        System.out.println( grade );

        System.out.println( Integer.MAX_VALUE );
        System.out.println( Integer.MIN_VALUE );

        grade = grade + 3;
        System.out.println( grade );

        System.out.println( Integer.MAX_VALUE + 1 );
        System.out.println( Integer.MIN_VALUE - 1 );
    }

}