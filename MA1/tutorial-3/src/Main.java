public class Main {

    public static void main(String[] args) {

        // ctrl + /
//        System.out.println("Hello World!");       // sout

//        vreme();
//        rezultatIzpita();
//        letter();
        isCap('a');     // ctrl + d
        isCap('B');
        isCap('X');
        isCap('Q');
        isCap('$');
        isCap('#');
        isCap('(');

    }


    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print( "Ali je sončno? " );       // sout
        System.out.println( isSunny );       // sout

        System.out.println( "Do we have a hw? " + hasHomework );

        float temperature = 22.4f;
        boolean isEnough = temperature > 20; // Celsius
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Greva? " + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );
    }




    private static void rezultatIzpita(){

        double totalPoint = 98.7;
        int limit = 50;
//        boolean passed = false;

        System.out.println( "You got " + totalPoint + " points." );

        if ( totalPoint >= limit ) {

            System.out.println("You made it! Congrats!");

        }

        if ( totalPoint >= 95 ) {

            System.out.println( "Wow! That's actually a 10 !" );

        } else if ( totalPoint >= 85 ){

            System.out.println( "That's also great! It's a 9." );

        } else if ( totalPoint >= limit) {

            System.out.println( "No one will ever ask you about this grade ;)" );

        } else {
            System.out.println("Better luck next year.");
        }

    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';      // shift + 4   $

        System.out.println( "Prva črka je " + firstLetter );
        System.out.println( "Prva cifra je " + firstDigit );        // ctrl + d

        System.out.println( "Prva črka je " + (int) firstLetter );
        System.out.println( "Prva cifra je " + (int) firstDigit );        // ctrl + d

        System.out.println("With number 77 is represented letter: "+ (char) 77);

    }

    private static void isCap( char c ){


//        if ( (int) c > 64 && (int) c < 91 ){
        if ( c >= 'A' && c < 'Z' ){

            System.out.println( c +  " je velika črka");

        } else if ( (int) c > 96 && (int) c < 123 ) {

            System.out.println( c +  " je mala črka");

        } else {
            System.out.println( c +  " sploh ni črka");
        }

    }


}









