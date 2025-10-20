public class Main {
    public static void main(String[] args) {

//        vreme();        // ctrl + /
//        courseResults();
//        letter();
        capLetter('s');     // ctrl + d
        capLetter('T');
        capLetter('p');
        capLetter('W');
        capLetter('w');
        capLetter('#');
        capLetter('{');

    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print("Is it sunny outside? ");     // sout
        System.out.println(isSunny);

        System.out.println("Do we have a hw? " + hasHomework);

        float temperature = 28.6f;
        boolean isEnough = temperature > 20;
        System.out.println("Is it enough? " + isEnough);

        boolean goOutside = isSunny && isEnough;
        System.out.println("Do we go outside? " + goOutside);

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println("Should I look for a book? " + isStudyTime);

    }

    private static void courseResults(){

        double finalPoints = 58.6;
        int limit = 50;
//        boolean passed = false;

        System.out.println("You got "+finalPoints+" points.");

        if ( finalPoints >= limit ){
            System.out.println("Congrats you passed the course!");
        }

        if ( finalPoints > 95 ){
            System.out.println("Wooow! That's actually a 10 !");
        } else if ( finalPoints > 85 ){
            System.out.println("That's also great! It's a 9.");
        } else if ( finalPoints >= limit ){
            System.out.println("No one will every ask you about the grade ;)");
        } else {
            System.out.println("Better luck next year.");
        }


    }

    private static void letter(){

        char firstLetter = 'a';
        char firstDigit = '0';
        char dollar = '$';

        System.out.println( "First letter is: " + firstLetter);
        System.out.println( "First digit is: " + firstDigit);
        System.out.println( "First letter is: " + (int) firstLetter);
        System.out.println( "First digit is: " + (int) firstDigit);
        System.out.println( "At number 77 is character: "+ (char) 77);
    }

    private static void capLetter( char c ){

//        if ( (int) c > 96 && (int) c < 123 ){
        if ( c >= 'a' && c <= 'z' ){
            System.out.println(c + " is a low case letter");
        } else if ( (int) c > 64 && (int) c < 91 ){
            System.out.println(c + " is a upper case letter");
        } else {
            System.out.println(c + " is not a letter");
        }
    }

}






