
//This is my first code

/* ksdksda
this
is a
comment
block

 */

//in-line comment Ctrl+/


public class Main {

    public static void main(String[] args) {


//        System.out.println("Hello world!");

//        Main.name();
//        name(); // ctrl + d

//        zdravo("Ognen");
//        zdravo("Alisa");
//        zdravo("Tatjana");
//        zdravo("Danilo");

//        welcome();
        System.out.println( welcome() ); // sout

    }

    public static void name(){

        System.out.println("Milan");

    }


    private static void zdravo(String ime){

//        System.out.println("Hello Milan!");
        System.out.print("Hello ");
//        System.out.print("Milan");
        System.out.print(ime);
        System.out.println("!");

    }

    private static String welcome(){

        return "Welcome to the University of Primorska!";

    }

}