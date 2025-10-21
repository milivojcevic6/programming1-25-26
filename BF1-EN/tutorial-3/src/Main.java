public class Main {
    public static void main(String[] args) {


//        vreme();
//        courseResult();
//        letter();
        isCap('a');     // ctrl + d
        isCap('B');
        isCap('P');
        isCap('q');
        isCap('x');
        isCap('%');
        isCap('#');

    }

    private static void vreme() {

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print( "Is it sunny outside? ");       // sout
        System.out.println( isSunny );

        System.out.println( "Do we have a hw? " + hasHomework );

        float temperature = 22.7f;
        boolean isEnough = temperature > 20;    // Celsius
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Let's go out " + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );

    }

    private static void courseResult(){

        double totalPoints = 28.7;
        int limit = 50;
//        boolean passed = false;

        System.out.println( "You got: " + totalPoints + " points." );

        if ( totalPoints > limit ) {
            System.out.println( "Congrats! You made it!" );
        }

        if ( totalPoints >= 95){
            System.out.println( "WoooW! That's actually a 10 !" );
        } else if ( totalPoints >= 85 ){
            System.out.println("That's also great! Well done!");
        } else if( totalPoints >= limit) {
            System.out.println("No one will ever ask you about this grade anyhow ;)");
        } else {
            System.out.println("Better luck next year");
        }


    }


    private static void letter(){

        char firstLettter = 'a';
        char firstDigit = '0';
        char dollar = '$';  // shift + 4

        System.out.println( "My fav letter is " + firstLettter );
        System.out.println( "My fav digit is " + firstDigit );

        System.out.println( "My fav letter is " + (int) firstLettter );       // ctrl + d
        System.out.println( "My fav digit is " + (int) firstDigit );

        System.out.println("At position 77 is letter: " + (char) 77);

    }


    private static void isCap( char c ) {


//        if ( (int) c > 96 && (int) c < 123 ) {
        if ( (int) c >= 'a'  && (int) c <= 'z' ) {
            System.out.println( c + " is a low case letter");       // sout
        } else if ( (int) c > 64 && (int) c < 91 ){
            System.out.println( c + " is an upper case letter");
        } else {
            System.out.println( c + " is not a letter");
        }

    }


}