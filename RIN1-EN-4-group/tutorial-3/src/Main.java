public class Main {
    public static void main(String[] args) {

//        vreme();
//        courseResults();
//        letter();
        isCap('a');
        isCap('B');
        isCap('X');
        isCap('p');
        isCap('%');
        isCap('#');
    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomeWork = false;
        System.out.print("Is it sunny outside? ");     // sout
        System.out.println(isSunny);

        System.out.println( "Do we have a hw? " + hasHomeWork );

        float temperature = 14.3f;
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( goOutside );

        boolean isStudyTime = hasHomeWork || !isSunny;
        System.out.println( "Should I look for a book? " + isStudyTime );

    }

    private static void courseResults(){

        double totalPoints = 48.7;
        int limit = 50;
//        boolean passed = false;

        System.out.println("You have " + totalPoints + " points.");

        if ( totalPoints > limit ) {
            System.out.println("Congrats! You made it.");
        }

        if (totalPoints >= 95 ){
            System.out.println("Woow Great! That's a 10 !! It doesn't happen often.");
        } else if (totalPoints >= 85){
            System.out.println("That's also amazing!!!");
        } else if (totalPoints >= limit){
            System.out.println("No one will ever ask you about the grade.");
        } else {
            System.out.println("Better luck next year! Follow next year's tutorials a bit closer");
        }
    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';

        System.out.println( "My fav letter is " + firstLetter );
        System.out.println( "My fav digit is " + firstDigit );

        System.out.println( "My fav letter is " + (int) firstLetter );
        System.out.println( "My fav digit is " + (int) firstDigit );
        System.out.println("At position 77 in ASCII table is letter: "+ (char) 77);
    }

    private static void isCap( char c ){

//        if ((int) c >= 97 && (int) c <= 122 ){
        if ( c >= 'a' && (int) c <= 'z' ){
            System.out.println( c + " is a low case letter");
        } else if ((int) c >= 65 && (int) c <= 90 ){
            System.out.println( c + " is an upper case letter");
        } else {
            System.out.println( c + " is not a letter");
        }

    }


}