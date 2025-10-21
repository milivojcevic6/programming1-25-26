public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        variable();

//        Operators.basicOperators();   // ctrl + /
//        Operators.special();
        Operators.nums();


    }

    private static void variable() {

        int grade = 6;
        System.out.println( grade );        // sout

        grade = 7;
        System.out.println( grade );

        System.out.println( Integer.MAX_VALUE );
        System.out.println( Integer.MIN_VALUE );        // ctrl + d

        grade = grade + 3;
        System.out.println( grade );

        System.out.println( Integer.MAX_VALUE + 1 );
        System.out.println( Integer.MIN_VALUE - 1 );

    }

}