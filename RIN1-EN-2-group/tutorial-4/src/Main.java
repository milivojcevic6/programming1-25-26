import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Space mission config");
//
//        System.out.println("Enter the name of the ship:");
//        String nameOfShip = sc.nextLine();
//
//        System.out.println("What is the crew count?");
//        int crewCount = sc.nextInt();
//
//        System.out.println("Does your ship have AI support? true/false");
//        boolean aiSupport = sc.nextBoolean();
//
//        System.out.println("Amount of fuel?");
//        double amountOfFuel = sc.nextDouble();
//
//        System.out.println("Type of trip? E = exploration, R = rescue");
//        char tripType = sc.next().charAt(0);
//
//        System.out.println("Name of the ship: " + nameOfShip);
//        System.out.println("Crew count: " + crewCount);
//        System.out.println("Amount of fuel: " + amountOfFuel);
//        System.out.println("Trip type: " + tripType);
//        System.out.println("AI support: " + aiSupport);

     // LOOP: WHILE, DO-WHILE, FOR

        // FOR
//        for (int i = 0; i <= 10; i++){
//            System.out.print(i + " ");
//        }

       // WHILE

        int counterWhile = 0;

        while (counterWhile > 0){
            System.out.print(counterWhile + " ");
            counterWhile--;
        }

        // DO-WHILE

//        int doWhileCounter = 1;
//
//        // from 1 to 15 each 2nd number not divisible by 3
//
//        do {
//            if (doWhileCounter % 3 == 0){
//                doWhileCounter += 2;
//                continue;
//            }
//            System.out.print(doWhileCounter + " ");
//            //doWhileCounter = doWhileCounter + 2;
//            doWhileCounter += 2;
//        }while(doWhileCounter <= 15);

        // Real world example for do while

//        System.out.println();
//        int choice;
//
//        do{
//            System.out.println("Enter integer between 1 and 5");
//            choice = sc.nextInt();
//        }while(choice < 1 || choice > 5);
//
//        System.out.println("Your choice: " + choice);

        // INFINITE LOOPS
        // Game for guessing numbers

//        int min = 1;
//        int max = 5;
//
//        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
//        int numGuesses = 0;
//        System.out.println("Guess a number between " + min + " and " + max + ": ");
//        while(true){
//            numGuesses++;
//            if(randomNumber == sc.nextInt()) {
//                break;
//            }
//        }
//        System.out.println("Good job you have guessed it right in " + numGuesses + " guesses.");

        // infinite for loop

//        for(;sc.nextInt() != 0;){
//            System.out.println("Exit with 0");
//        }
//
//        System.out.println("Exited");


        // NESTED LOOPS
        //Helper.multTable(5);

        // Coordinates
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }

        System.out.println("-------------------Rectangle-------------------");
        // Draw rectangle
        Helper.drawRectanle(5,10);

        System.out.println("-------------------Example A----------------------");
        Helper.drawA(10);

        System.out.println("-------------------Example I-----------------------");
        Helper.drawI(10);

        System.out.println("-------------------Example G-----------------------");
        Helper.drawG(10);

    }
}
