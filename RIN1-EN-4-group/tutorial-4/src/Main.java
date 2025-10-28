import org.w3c.dom.html.HTMLBRElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // STDIN
        Scanner sc = new Scanner(System.in);

//        System.out.println("Game character creation");
//
//        System.out.println("Please enter hero name:");
//        String name = sc.nextLine();
//
//        // int
//        System.out.println("Enter your level");
//        int level = sc.nextInt();
//
//        // double
//        System.out.println("Enter your HP");
//        double HP = sc.nextDouble();
//
//        // boolean
//        System.out.println("Do you use magic? true/false");
//        boolean useMagic = sc.nextBoolean();
//
//        // character
//        System.out.println("Enter your hero type: A - archer, W - warrior, M - mage");
//        char type = sc.next().charAt(0);
//
//        System.out.println("Name: " + name);
//        System.out.println("Level: " + level);
//        System.out.println("HP: " + HP);
//        System.out.println("UseMagic: " + useMagic);
//        System.out.println("Type: " + type);

        // LOOPS
        // FOR, WHILE, DO-WHILE

//        for(int i = 0; i < 10; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        int counterWhile = 10;
//
//        while(counterWhile > 10){
//            System.out.print(counterWhile + " ");
//            counterWhile--;
//        }
//        System.out.println();
//        // DO WHILE
//        int counterDoWhile = 1;
//
//        // print every second number form 1 to 20 except numbers divisible by 3
//
//        do{
//            if(counterDoWhile % 3 == 0){
//                counterDoWhile += 2;
//                // skip it
//                continue;
//            }
//
//            System.out.print(counterDoWhile + " ");
//            counterDoWhile += 2; // counterDoWhile = counterDoWhile + 2;
//        }while(counterDoWhile <= 20);

        // Real world example
        // int between 1 and 5 as input
//

        // INFINTE LOOPS

        // Guessing game

//        int min = 1;
//        int max = 5;
//
//        int randomNum = (int) (Math.random() * (max - min + 1) + min);
//        int numGuesses = 0;
//        System.out.println("Guess a number between " + min + " and " + max + ".");
//        while (true){
//            numGuesses++;
//            if(randomNum == sc.nextInt()){
//                System.out.println("Congrats!");
//                break; // exit loop
//            }
//        }
//
//        System.out.println("You have guessed it in " + numGuesses + " guesses.");
//
//        for(;sc.nextInt() != 0;){
//            System.out.println("Exit with 0");
//        }
//        System.out.println("EXITED");

        // NESTED LOOPS

        // Multiplication table
        Helper.multTable(5);
        // Coordinated
        Helper.coordinates(5);

        // Draw rectangle
        System.out.println("----------------------Rectangle---------------------");
        Helper.drawRectangle(10,5);

        System.out.println("---------------------Example A-----------------------");
        Helper.drawA(10);

        System.out.println("-------------------Example I-------------------");
        Helper.drawI(10);








    }

}