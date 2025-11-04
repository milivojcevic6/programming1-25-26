import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1D ARRAYS IN JAVA
        System.out.println("Original array");
        int [] intArray = {1,2,3,4,5,6}; // default is 0
//        String [] strArray;
//        strArray = new String[5]; // null - reference to nothing
//        strArray[0] = "zero";
//        strArray[1] = "one";
//        strArray[2] = "two";
//
//        System.out.println(strArray[0]);
//        System.out.println(strArray[4]); //null
//
//        System.out.println(intArray[1]);
        //System.out.println(intArray[6]);

        // Print array (iterate array)
//        System.out.println(intArray);
//        System.out.println(intArray.length);
        ArraysHelper.printIntArray(intArray, true);
        ArraysHelper.printIntArray(intArray, false);

        // for each (enhanched for loop)
//        for(int element : intArray){
//            System.out.println(element);
//        }
//
//        // We have theater with seats and names of people
//        String [] theater = {"Ana", "Nikola", "Jan", "Mojca"};
//
//        for (int i = 0; i < theater.length; i++) {
//            System.out.println("Seat number " + i + " is taken by " + theater[i]);
//        }

        // SUM ELEMENTS IN INT ARRAY
        System.out.println("Sum of array is = " + ArraysHelper.sum(intArray));

        // AVERAGE OF ELEMENTS IN ARRAY
        System.out.println("Average value of array is = " + ArraysHelper.average(intArray));

        // FIND LARGEST NUMBER IN ARRAY
        System.out.println("Largest number in array = " + ArraysHelper.findMax(intArray));

        // COUNT EVEN NUMBERS IN ARRAY
        System.out.println("Number of even elements = " + ArraysHelper.countEven(intArray));

        // SEARCH FOR ELEMENT IN ARRAY
        System.out.println("Element 5 is present in array: " + ArraysHelper.search(intArray, 5));
        System.out.println("Element 5 is present in array: " + ArraysHelper.search(intArray, -1));

        // COPY OF ARRAY
        int [] copy = ArraysHelper.copyIntArray(intArray);
        System.out.println("Original array:");
        ArraysHelper.printIntArray(intArray, true);
        System.out.println("Copy of original array:");
        ArraysHelper.printIntArray(copy, true);

        // REVERSE ARRAY
        System.out.println("Reversed array:");
        int [] reversed = ArraysHelper.reverseIntArray(intArray);
        ArraysHelper.printIntArray(reversed, true);
        System.out.println("Original array:");
        ArraysHelper.printIntArray(intArray, true);


        // USING STDIN TO CREATE ARRAY
//        int [] newIntArray = ArraysHelper.createIntArray();
//        System.out.println("New array:");
//        ArraysHelper.printIntArray(newIntArray, true);
//
//        int [] intArrFromString = ArraysHelper.createIntArrayFromStringInput();
//        System.out.println("New array from string: ");
//        ArraysHelper.printIntArray(intArrFromString, true);

//        Scanner sc = new Scanner(System.in);
//        String [] words = sc.nextLine().split(" ");
//        for(String word : words) {
//            System.out.println(word);
//        }
//
//        char [] a = "asfkhb".toCharArray();
//        for(char c : a){
//            System.out.println(c);
//        }

        // 2D arrays (matrices)

        int [][] matrix = {
                {1,2,3},
                {4,5,6}, // jagged arrays
                {7,8,9}

        };

        System.out.println(matrix[2][1]);

        matrix[2][1] = 89;
        System.out.println(matrix[2][1]);

        System.out.println("Our matrix");
        ArraysHelper.printMatrix(matrix);











    }
}