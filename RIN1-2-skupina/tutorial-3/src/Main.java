public class Main {
    public static void main(String[] args) {

//        vreme();
//        opravilPredmet();
        letter();

    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.println("Is it sunny outside?");
        System.out.println( isSunny );

        System.out.println( "Ali smo dobili dn? " + hasHomework );   // + doda vrednost v String

        int temperature = 20;   // Celsius
        boolean isEnough = temperature > 20;
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Gremo van? " + goOutside);

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println("Ucimo?" + isStudyTime);

    }

    private static void opravilPredmet(){

        int totalPoints = 88;
        int passingLimit = 50;
//        boolean opravil = true;

        System.out.println( "Imaš " + totalPoints + " točk." );

//        if (opravil)
        if ( totalPoints >= passingLimit ){
            System.out.println( "Opravil si! Nice." );
        }

        if ( totalPoints > 94 ){
            System.out.println( "Pa to je 10, wow!" );
        } else if ( totalPoints > 85 ) {
            System.out.println("Pa 9 je še vedno super!");
        } else if ( totalPoints > passingLimit ){
            System.out.println( "Si naredil. kul." );
        } else {
            System.out.println( "Naslednje leto :(" );
        }
    }

    private static void letter(){

        char crka = 'M';
        char cifra = '0';
        char dolar = '$';

        System.out.println( "My fav letter: " + crka );     // ctrl + d
        System.out.println( "My fav digit: " + cifra );

        System.out.println( "My fav letter: " + (int) crka );     // ctrl + d
        System.out.println( "My fav digit: " + (int) cifra );

        System.out.println("Cerka na 105: "+ (char) 105);

        if (crka > 'K'){
            System.out.println(crka+ " pride po K");
        } else {
            System.out.println( "Prvo je K pa "+ crka+" v alfabetu.");
        }

        if ( crka >= 'a' && crka <= 'z'){
            System.out.println("Crka je mala");
        } else if (crka >= 'A' && crka <= 'Z'){
            System.out.println("Crka je velika!");
        }

    }

}