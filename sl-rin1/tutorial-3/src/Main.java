public class Main {
    public static void main(String[] args) {

//        vreme();
//        opravilPredmet();     // ctrl + /
//        letter();
        isCapital('c');         // ctrl + d
        isCapital('M');
        isCapital('b');
        isCapital('X');
        isCapital('%');
    }

    private static void vreme(){

        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.print("Is it sunny outside? ");
        System.out.println( isSunny );     // sout

        System.out.println("Ali smo dobili DN? " + hasHomework);

        float temperature = 20.0f;              //  f za float
        boolean isEnough = temperature >= 20;    //Celsius
        System.out.println( isEnough );

        boolean goOutside = isSunny && isEnough;
        System.out.println( "Gremo van?" + goOutside );

        boolean isStudyTime = hasHomework || !isSunny;
        System.out.println( isStudyTime );
    }

    private static void opravilPredmet(){

        double totalPoint = 88.6;
        int limit = 50;
//        boolean passed = false;

        System.out.println( "Imaš " + totalPoint + " točk.");

        if ( totalPoint >= limit ) {
            System.out.println("Čestitke!");
        }

        if ( totalPoint > 95 ){
            System.out.println("Wow! Pač 10 !");
        } else if ( totalPoint > 85 ){
            System.out.println("Ma 9 je top!!!");
        } else if ( totalPoint >= limit ){
            System.out.println("Sej si ga naredil. kul");
        } else {
            System.out.println("Naslednje leto je tudi fajn");
        }
    }

    private static void letter(){

        char crka = 'a';
        char cifra = '0';
        char dolar = '$';

        System.out.println("My fav letter: " + crka);       // sout
        System.out.println("My fav digit: " + cifra);

        System.out.println("My fav letter: " + (int) crka);       // ctrl + d
        System.out.println("My fav digit: " + (int) cifra);

        System.out.println( "Crka na 77 je: " + (char) 77 );
    }

    private static void isCapital(char c){

        if ( (int) c > 96 && (int) c < 123 ) {
            System.out.println( c + " je mala črka");       //sout
        } else if ( (int) c > 64 && (int) c < 91 ){
            System.out.println( c + " je velika črka");     // ctrl + d
        } else {
            System.out.println("Tisto ni črka");
        }

    }

}









