public class Main {
    public static void main(String[] args) {

//        vreme();          // ctrl + /
//        passedCourse();
//        letter();
        capLatter('b');     // ctrl + d
        capLatter('B');
        capLatter('q');
        capLatter('X');
        capLatter('m');
        capLatter('%');

    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomewok = false;

        System.out.print( "Is it sunny outside? " );   // sout
        System.out.println( isSunny );                  // ctrl + d

        System.out.println( "We have a hw, right? " + hasHomewok );

        float temperature = 19.7f;
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "do we go outside?" + goOutside );

        boolean isStudyTime = hasHomewok || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );
    }

    private static void passedCourse(){

        double totalPoints = 88.7;
        int limit = 50;
//        boolean passed = false;

        System.out.println( "You got " + totalPoints + " points" );

        if ( totalPoints >= limit ) {
            System.out.println("You passed, congratulations!" );
        }

        if (totalPoints >= 95 ){
            System.out.println("WOWWW 10!!!!! look at you");
        } else if (totalPoints >= 85 ){
            System.out.println( "Yeahhh 9! Also nice." );
        } else if (totalPoints >= limit) {
            System.out.println("it's enough");
        } else {
            System.out.println("better luck next year");
        }
    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';

        System.out.println( "My fav letter is " + firstLetter );
        System.out.println( "My fav fav digit is " + firstDigit );


        System.out.println( "My fav letter is " + (int) firstLetter );
        System.out.println( "My fav fav digit is " + (int) firstDigit );
        System.out.println( "At position 77 is letter " + (char) 77 );

    }

    private static void capLatter ( char c ){

        if ( (int) c > 96 && (int) c < 123 ){
            System.out.println( c + " is low case letter" );
        } else if ( (int) c > 64 && (int) c < 91  ) {
            System.out.println( c + " is capital letter" );
        } else {
            System.out.println( c + " is not a letter" );
        }

    }

}








