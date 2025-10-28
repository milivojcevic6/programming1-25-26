import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Game started");
//
//        System.out.println("Please enter your characted name:");
//        String name = sc.nextLine();
//
//        System.out.println("Enter level of your hero:");
//        int level = sc.nextInt();
//
//        System.out.println("Do you use magic? true/false");
//        boolean magic = sc.nextBoolean();
//
//        System.out.println("Health point?");
//        double health = sc.nextDouble();
//
//        System.out.println("Enter your type? A = archer, M = mage, W = warrior");
//        char type = sc.next().charAt(0);
//
//        System.out.println("Name: " + name);
//        System.out.println("Level: " + level);
//        System.out.println("Health: " + health);
//        System.out.println("Type: " + type);
//        System.out.println("Magic: " + magic);

        // LOOPS: FOR, WHILE, DO-WHILE

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//
//        System.out.println();
//
//        int iWhile = 10;
//        while (iWhile >= 1){
//            System.out.println(iWhile);
//            iWhile--;
//        }
//
//        System.out.println();
//
//        int iDoWhile = 1;
//
//        // Count to 20 but step is 2 and skip numbers divisible by 3
//
//        do {
////            if(iDoWhile % 3 != 0) {
////                System.out.println(iDoWhile);
////            }
//            if (iDoWhile % 3 == 0) {
//                iDoWhile += 2;
//                continue;
//            }
//
//            System.out.println(iDoWhile);
//            iDoWhile += 2;  // iDoWhile = iDoWhile + 2;
//        }while(iDoWhile <= 20);

        // Real world example

//        int choice;
//
//        do {
//            System.out.println("Input number between 1 and 5");
//            choice = sc.nextInt();
//        }while(choice > 5 || choice < 1);
//
//        System.out.println("Your choice is: "+ choice);

        // INFINITE LOOPS

        // Random guess game

//        int min = 1;
//        int max = 5;
//
//        int randomNum = (int)(Math.random() * (max - min + 1) + min);
//
//        int numGuesses = 0;
//
//        System.out.println("Guess the number between 1 and 5");
//
//        // Infinite loop
//        while(true) {
//            numGuesses++;
//            if (randomNum == sc.nextInt()) {
//                System.out.println("You guessed it correctly in " + numGuesses + " guesses.");
//                break;
//            }
//            System.out.println("Try again!");
//        }

//        for(;sc.nextInt() != 0;) {
//            System.out.println("Exit with 0");
//        }
//
//        System.out.println("EXITED");

        // Mult table
        //Helper.multTable(5);

        // Print coordinates

        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }

        // Draw rectangle
        Helper.drawRectangle(5,10);

        // Draw triangles
        System.out.println("-----------------------Example A--------------------------");
        Helper.drawA(10);
        System.out.println("-------------------- Example I -------------------------");
        Helper.drawI(10);





    }
}