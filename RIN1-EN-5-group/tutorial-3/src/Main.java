public class Main {
    public static void main(String[] args) {

//        vreme();
//        courseResults();
//        letter();
        isCap('w');
        isCap('r');
        isCap('T');
        isCap('M');
        isCap('x');
        isCap('$');
        isCap('/');     // ctrl + d

    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print("Is it sunny outside? ");
        System.out.println( isSunny);                      // sout

        System.out.println("Do we have a homework? " + hasHomework);

        float temperature = 29.6f;
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Do we go outside? " + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );

    }

    private static void courseResults(){

        double totalPoints = 48.8;
        int limit = 50;
//        boolean passed = false;

        System.out.println( "You got " + totalPoints + " points." );

        if ( totalPoints >= limit ){
            System.out.println("You made it! Congrats!");
        }

        if ( totalPoints > 95 ){
            System.out.println("Ohhh it's a 10 WoW!!!");
        } else if ( totalPoints > 85 ){
            System.out.println("That's also amazing! Bravo!");
        } else if ( totalPoints >= limit  ){
            System.out.println("No one will ever ask you about the grade");
        } else {
            System.out.println("Better luck next year.");
        }

    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';

        System.out.println( "My fav letter is " + firstLetter );
        System.out.println( "My fav digit is " + firstDigit);

        System.out.println( "My fav letter is " + (int) firstLetter );    // ctrl + d
        System.out.println( "My fav digit is " + (int) firstDigit);
        System.out.println("At position 77 is letter: " + (char) 77);

    }

    private static void isCap( char c ){

//        if ( (int) c > 96 && (int) c < 123 ) {
        if ( c >= 'a' && c <= 'z' ) {
            System.out.println( c+ " is low case letter" );
        } else if ( (int) c > 64 && (int) c < 91 ){
            System.out.println( c+ " is upper case letter" );
        } else {
            System.out.println( c+ " is not a letter" );
        }

    }


}








