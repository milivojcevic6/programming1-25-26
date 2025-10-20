
// This is my first code.

/*

block
comment
is this.

 */

//in-line comment Ctrl + /

public class Main {     // this is class


    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.print("Hello world!"); // ctrl + d

//        Main.name();
//        name();

        zdravo("Taisa");
        zdravo("Alesa");
        zdravo("Alesa");
        zdravo("Jova");
        zdravo("Anja");
        zdravo("Dimitar");
        zdravo("Jana");

//        welcome();
        System.out.println( welcome() );

    }


    public static void name(){

        System.out.println("Milan"); // sout

    }

    private static void zdravo(String ime){

//        System.out.println("Hello Milan!");

        System.out.print("Hello ");
//        System.out.print("Milan");
        System.out.print(ime);
        System.out.println("!");

    }

    private static String welcome(){

        return "Welcome to the Universitzy of Primorska!";

    }



}



