
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //STDIN
        Scanner sc = new Scanner(System.in);

//        System.out.println("Movie night planner");
//
//        // string
//        System.out.println("Please, enter your name:");
//
//        String name = sc.nextLine();
//
//        // integer
//        System.out.println("How many people?");
//        int people = sc.nextInt();
//
//        // boolean
//        System.out.println("3D movie? true/false");
//        boolean threeD = sc.nextBoolean();
//
//       // double
//        System.out.println("Budget for snacks?");
//        double budget = sc.nextDouble();
//
//        // char
//        System.out.println("Type of the movie? A = action R = Romcom H = Horror");
//        char movieType = sc.next().charAt(0);
//
//        System.out.println("Name: " + name);
//        System.out.println("People: " + people);
//        System.out.println("Budget: " + budget);
//        System.out.println("Movie Type: " + movieType);
//        System.out.println("3D: " + threeD);

        // LOOPS: WHILE, FOR, DO-WHILE
//
//        // FOR
//        for (int i = 0; i < 10; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // WHILE
//        int counterWhile = 10;
//
//        while(counterWhile > 0){
//            System.out.print(counterWhile + " ");
//            counterWhile--;
//        }
//
//        System.out.println();
//
//        // DO-WHILE
//        // Print numbers from 1 to 30 every 4th number (1,5,9,13...) except numbers divisible by 5
//        int counterDoWhile = 1;
//
//        do{
//            if(counterDoWhile % 5 == 0 ){ // it is divisible
//                counterDoWhile = counterDoWhile + 4;
//                continue;
//            }
//            System.out.print(counterDoWhile + " ");
//            counterDoWhile = counterDoWhile + 4; // counterDoWhile += 4;
//        }while(counterDoWhile <= 30);
//        System.out.println();
//
//        // Real world application for dowhile
//        // get input from user between 1 and 5
//        int input;
//
//        do{
//            System.out.println("Enter int between 1 and 5");
//            input = sc.nextInt();
//        }while (input < 1 || input > 5);
//
//        System.out.println("You entered: " + input);

        // INFINITE LOOPS
        // Guessing game
        // numbers 1 to 5

//        int min = 1;
//        int max = 5;
//
//
//        int randomNum = (int) (Math.random() * (max - min + 1) + min);
//
//        int numGuesses = 0;
//        while(true){
//            System.out.println("Enter number between 1 and 5");
//            int guess = sc.nextInt();
//            numGuesses++;
//            if(guess == randomNum){
//                break;
//            }
//        }
//
//        System.out.println("Good job!You have guessed it in " + numGuesses + " guesses.");

//        for(;sc.nextInt() != 0;){
//            System.out.println("Enter 0 to exit loop");
//        }
//        System.out.println("Exited loop");


        // NESTED LOOPS

        //Helper.multTable(10);

        Helper.printCoordinates(5);

        System.out.println("-----------------------------Rectangle--------------------------");
        // Draw rectangle
        Helper.drawRectangle(10,5);

        System.out.println("-----------------------------Example A--------------------------------");
        Helper.drawA(10);

        System.out.println("------------------------------Example I------------------------------");
        Helper.drawI(10);


    }


}