public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello World!");       // ctrl + /

//        vreme();
//        rezultatIzpita();
//        letter();
        isCap('a');     // ctrl + d
        isCap('B');
        isCap('p');
        isCap('X');
        isCap('q');
        isCap('$');
        isCap('&');

    }

    public static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print( "Is it sunny? " );       // sout
        System.out.println( isSunny );

        System.out.println( "Do we have a hw? " + hasHomework );

        float temperature = 22.4f;
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Greva vn " + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );

    }


    private static void rezultatIzpita(){

        double totalPoints = 28.6;
        int limit = 50;
//        boolean passed = false;

        System.out.println("You got " + totalPoints + " points." );

        if ( totalPoints >= limit ) {
            System.out.println("Congrats! You made it!");
        }

        if ( totalPoints >= 95 ){

            System.out.println( "Woow! That's actually a 10 !" );       // sout

        } else if ( totalPoints >= 85 ){

            System.out.println( "That's also great! It's a 9." );

        } else if ( totalPoints >= limit ){                            // ctrl + d

            System.out.println( "No one will ever ask you about this grade ;)" );

        } else {

            System.out.println("Better luck next year");

        }
    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';          // shift + 4 = $

        System.out.println( "First letter is " + firstLetter );
        System.out.println( "First digit is " + firstDigit );

        System.out.println( "First letter is " + (int) firstLetter );     // ctrl + d
        System.out.println( "First digit is " + (int) firstDigit );

        System.out.println( "On position 77 is letter: " + (char) 77 );

    }


    private static void isCap( char c ){

        if ( (int) c > 96 && (int) c < 123 ){
            System.out.println( c + " je mala črka");
        } else if ( (int) c > 64 && (int) c < 91 ) {
            System.out.println( c + " je velika črka");
        } else {
            System.out.println( c + " sploh ni črka");
        }
    }

}







