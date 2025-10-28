import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Welcome to the Restaurant!");
//        //string
//        System.out.println("We need your full name: ");
//        String name = sc.nextLine();
//        //int
//
//        System.out.println("How many people?");
//        int people = sc.nextInt();
//        //boolean
//
//        System.out.println("Are you a vegetarian? true/false");
//        boolean vegetarian = sc.nextBoolean();
//
//        //double
//        System.out.println("What is your budget? €");
//        double budget = sc.nextDouble();
//
//        //char
//        System.out.println("Choose sitting area? I = inside, O = outside");
//        char area = sc.next().charAt(0);
//
//        System.out.println("Name of the reservation: " + name);
//        System.out.println("People: " + people);
//        System.out.println("Vegetarian: " + vegetarian);
//        System.out.println("Budget: " + budget);
//        System.out.println("Area of the reservation: " + area);

        // LOOPS: WHILE, FOR, DO-WHILE

//        for (int i = 0; i < 10; i++){
//            System.out.print(i + " ");
//        }

//        int whileCounter = 10;
//        while(whileCounter >= 0){
//            System.out.print(whileCounter + " ");
//            whileCounter--;
//        }

        int counterDoWhile = 1;

        // print every 3rd number from 1 to 20 except numbers divisible by 4

//        do{
//            if(counterDoWhile % 4 == 0){
//                counterDoWhile += 3;
//                continue;
//            }
//            System.out.print(counterDoWhile + " ");
//            counterDoWhile += 3; // counterDoWhile = counterDoWhile + 3
//        }while(counterDoWhile <= 20);

        // real world example (data verification)
//        int input;
//
//        // int between 1 and 5
//
//        do{
//            System.out.println("Enter number between 1 and 5");
//            input = sc.nextInt();
//        }while(input < 1 || input > 5);
//
//        System.out.println("You entered " + input);

        // INFINITE LOOPS

        // Guessing game
//        int min = 1;
//        int max = 5;
//
//        int randomNum = (int) (Math.random() * ((max - min) + 1) + min);
//
//        int numGuesses = 0;
//        System.out.println("Guess the number form 1 to 5");
//
//        while(true){
//            int userGuess = sc.nextInt();
//            numGuesses++;
//            if(randomNum == userGuess){
//                break;
//            }
//        }
//        System.out.println("You have guessed it in "+ numGuesses+" guesses");

//        for(;sc.nextInt() != 0;){
//            System.out.println("Exit using 0");
//        }
//        System.out.println("Exited");


        // NESTED LOOPS

        //Helper.multTable(5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }

        System.out.println("-----------------Rectangle---------------------");

        Helper.drawRectangle(6,20);

        System.out.println("--------------------Example A-----------------------");

        Helper.drawA(10);

        System.out.println("-----------------Example I-----------------------");

        Helper.drawI(10);




    }
}