public class Main {
    public static void main(String[] args) {

//        vreme();      // ctrl + /

//        opravilPredment();

        crke();

    }

    private static void vreme() {

        // boolean variables
        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.println( "Is it sunny?" );     // sout
        System.out.println( isSunny );

        System.out.println( "Do we have a homework? " + hasHomework );

        int temperature = 25;   // Celsius

//        boolean isEnough = false;     // ctrl + /
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println("Do we go outside? ( je sonce in dovolj toplo) " + goOutside );

        boolean needStudyTime = hasHomework || !isSunny;     // | AltGr + W
        System.out.println( "Ali je čas za knjigo? " + needStudyTime );

    }

    private static void opravilPredment() {

        int totalPoints = 50;
        int passingLimit = 50;

        System.out.println( "Imaš " + totalPoints + " točk" );

        if ( totalPoints > passingLimit ) {

            System.out.println( "Čestitke! Bravo :) ");

        }

        if ( totalPoints > 95 ){
            System.out.println("Pa to je 10 ! WoW");
        } else if ( totalPoints > 85 ){
            System.out.println("Devet je še vedno top!");
        } else if ( totalPoints >= passingLimit ){
            System.out.println( "Ma dovolj je ;)" );
        } else {
            System.out.println("Se vidimo naslednje leto.");
        }

    }

    private static void crke(){

        char prvaCrka = 'a';
        char prvaStevilka = '0';
        char dolar = '$';

        System.out.println("My fav letter is " + prvaCrka);
        System.out.println("Prva cifra je " + prvaStevilka);
        System.out.println("My fav letter is " + (int) prvaCrka);     // ctrl + d
        System.out.println("Prva cifra je " + (int) prvaStevilka);

        System.out.println( "crka a je: " + 'a' );
        System.out.println( "crka A je: " + 'A' );
        System.out.println( "crka A je: " + (int) 'A' );
        System.out.println( "crka A je: " + (char) 65 );
        System.out.println( "i je: " + 'i'+", ampak I je: " + (char)( (int)('i'+'a'-'A')) );


    }

}









