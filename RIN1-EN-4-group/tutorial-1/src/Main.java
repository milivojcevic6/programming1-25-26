
// This is my very first code


/*
This
is a
comment
block
 */

//in-line comment ctrl+/

public class Main {     // this is class

    public static void main(String[] args) {

//                System.out.println("Hello world!");
//        System.out.print("Hello world!"); // ctrl + d

//        Main.name();
//        name();

        hello("Anastasia");
        hello("Dragan");
        hello("Aleksandar");
        hello("Oisin");
        hello("Orela");
        hello("Mateja");
        hello("Dusan");

//        welcome();
        System.out.println( welcome() );

    }

    public static void name(){

        System.out.println("Milan");

    }

    private static void hello( String ime ){

//        System.out.println("Hello Milan!"); // sout

        System.out.print("Hello ");
//        System.out.print("Milan");
        System.out.print(ime);
        System.out.println("!");

    }

    private static String welcome(){

        return "Welcome to the University of Primorska!";

    }

}









