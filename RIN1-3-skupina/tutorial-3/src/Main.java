public class Main {

    public static void main(String[] args) {

//        vreme();      // ctrl + /
//        opravilPredmet();
//        letter();

        isCapital('b');
        isCapital('C');
        isCapital('k');
        isCapital('z');

    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print( "Is it sunny outsite? " );  // sout
        System.out.println( isSunny );                  // ctrl + d

        System.out.println( "Ali imamo dn? " + hasHomework );

        int temperature = 21;   // Celsius
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println("Gremo vani? " + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println("Učimo? " + isStudyTime );

    }

    private static void opravilPredmet(){

        float totalPoints = 98.6f;                  // f za float
        int passingLimit = 50;
//        boolean passed = true;

        System.out.println( "Dobili ste " + totalPoints + " točk." );

//        if (passed)
        if ( totalPoints >= passingLimit ) {

            System.out.println("si ga rešila, Bravo!");

        }

        if (totalPoints > 95){
            System.out.println( "Pa to je 10! WoW");
        } else if (totalPoints > 85) {
            System.out.println("Ma 9 je tudi top!");
        } else if (totalPoints >= passingLimit) {
            System.out.println( "Ni 10, ni 9, ampak dovolj :)" );
        } else {
            System.out.println("Naslednje leto :/");
        }
    }

    private static void letter(){

        char crka = 'a';
        char cifra = '0';
        char dolar = '$';

        System.out.println( "My fav character is: " + crka );
        System.out.println( "My fav digit is: " + cifra );

        System.out.println( "My fav character is: " + (int) crka );
        System.out.println( "My fav digit is: " + (int) cifra );      // ctrl + d

        System.out.println("Črka 77 je: " + (char) 77);
        System.out.println("Malo A je " + (char) ('A' + 32) );

    }

    private static void isCapital(char c){

//        if ( (int)c >= 97 ){
//            if ( (int)c <= 122 ){
//                System.out.println( c + " je mala črka");
//            }
//        }
//        if ( (int)c >= 65 ){
//            if ( (int)c <= 90 ){
//                System.out.println( c + " je velika črka");
//            }
//        }

        if ( c >= 'a' && c <= 'z' ){
            System.out.println( c + " je mala črka");
        } else if ( c >= 'A' && c <= 'Z' ){
            System.out.println( c + " je velika črka");
        } else {
            System.out.println("sry ampak " + c + " ni črka.");
        }

    }



}