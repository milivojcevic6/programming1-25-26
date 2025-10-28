import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // STDIN
        Scanner sc = new Scanner(System.in);

//        System.out.println("MOVIE NIGHT");
//
//        System.out.println("Name of organizer:");
//        String name = sc.nextLine();
//
//        // int
//
//        System.out.println("How many people?");
//        int people = sc.nextInt();
//
//        // double
//        System.out.println("What is your budget?");
//        double budget = sc.nextDouble();
//
//        // Boolean
//        System.out.println("You like movies? true/false");
//        boolean likesMovies = sc.nextBoolean();
//
//        // char
//        System.out.println("What type of movies you like? A - action, R - romcom, H - horror");
//        char type = sc.next().charAt(0);
//
//        System.out.println("Organizer: " + name);
//        System.out.println("Number of people: " + people);
//        System.out.println("Budget: " + budget);
//        System.out.println("Likes movies: " + likesMovies);
//        System.out.println("Type: " + type);  CTRL + /

        // LOOPS: FOR, WHILE, DO-WHILE

//        for(int i = 0; i < 10; i++){
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        // define counter outside of the loop
//        int counterWhile = 10;
//
//        while(counterWhile > 0){
//            System.out.print(counterWhile + " ");
//            counterWhile--;
//        }
//
//        // print every second number from 1 to 20 except those divisible by 3
//        System.out.println();
//        int counterDoWhile = 1;
//
//        do{
//            if(counterDoWhile % 3 == 0){ // it is divisible
//                counterDoWhile += 2;
//                continue;
//            }
//            System.out.print(counterDoWhile + " ");
//            counterDoWhile += 2; // counterDoWhile = counterDoWhile + 2
//        }while(counterDoWhile <= 20);
//
//        // Real world example for Do while
//        System.out.println();
//
//        int input; // from 1 to 5
//
//        do {
//            System.out.println("enter a number from 1 to 5");
//            input = sc.nextInt();
//        }while (input < 1 || input > 5);
//        System.out.println("You have entered " + input);

        // INFINITE LOOPS
        // Guessing game
        // User guesses random number from 1 to 5
//        int min = 1;
//        int max = 5;
//
//        int randomNum = (int) (Math.random() * (max - min + 1) + min);
//        //System.out.println(randomNum);
//
//        int numGuesses = 0;
//
//        while (true){
//            System.out.println("Guess a number from 1 to 5");
//            numGuesses++;
//            int input = sc.nextInt();
//            if(randomNum == input){
//                System.out.println("Congrats");
//                break;
//            }
//        }
//        System.out.println("You have guessed it in " + numGuesses + " guesses.");

//        for(;sc.nextInt() != 0;){
//            System.out.println("Exit using 0");
//        }
//        System.out.println("EXITED");

        // NESTED LOOPS - loop inside the loop
        Helper.multTable(3);
        System.out.println();
        Helper.coordinates(5);
        System.out.println("-----------------Rectangle----------------");

        Helper.drawRectangle(5, 10);

        System.out.println("----------------Example A----------------");

        Helper.drawA(10);

        System.out.println("----------------Example I------------------");

        Helper.drawI(10);



    }
}