public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");           // ctrl + /

//        tvojeIme();
        tvojeIme("Milan");
        tvojeIme("Niki");
        tvojeIme("Kaja");

//        welcome();
        System.out.println( welcome() );



    }

    public static void tvojeIme( String name) {

        System.out.print( "Zdravo ");    //  sout
//        System.out.println( "Milan");    //  ctrl + d
        System.out.println( name );    //  ctrl + d

    }

    private static String welcome(){

        return "Welcome to the second vaje programiranja 1";

    }

}






