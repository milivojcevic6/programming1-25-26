public class Main {
    public static void main(String[] args) {

//        vreme();        // ctrl + /
//        coursePassed();
//        letter();
        capLetter('b');
        capLetter('B');
        capLetter('X');
        capLetter('q');
        capLetter('x');
        capLetter('o');
        capLetter('(');
        capLetter('$');

    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print( "Is it sunny outside? " );           // sout
        System.out.println( isSunny );

        System.out.println( "Do we have a hw? " + hasHomework );

        float temperature = 19.7f;
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Do we go outside? " + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );
    }

    private static void coursePassed(){

        double totalPoints = 48.6;
        int limit = 50;
//        boolean passed = false;

        System.out.println("You got " +totalPoints + " points." );

        if ( totalPoints >= limit ) {
            System.out.println("Congrats! You made it!");
        }

        if ( totalPoints > 95 ){
            System.out.println("WoooW! It's a 10!!");
        } else if ( totalPoints > 85 ){
            System.out.println("That's a 9! also cool");
        } else if ( totalPoints >= limit ){
            System.out.println("It's not a 10 nor 9, but still enough!");
        } else {
            System.out.println("Better luck next year :)");
        }
    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';

        System.out.println( "My fav letter is: " + firstLetter );
        System.out.println( "My fav digit is: " + firstDigit );
        System.out.println( "My fav letter is: " + (int) firstLetter );       // ctrl + d
        System.out.println( "My fav digit is: " + (int) firstDigit );
        System.out.println( "At position 77 is letter: " + (char) 77);
    }

    private static void capLetter( char c){

        if ( (int) c > 64 && (int) c < 91 ) {
            System.out.println( c + " is a capital letter");
        } else if ( (int) c > 96 && (int) c < 123 ) {
            System.out.println( c + " is a lower case letter");
        } else {
            System.out.println( c + " is not a letter");
        }
    }

}









