import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ARRAYS IN JAVA
        // 1D array
        int [] intArray = {1,2,3,4,5};
//        int [] intArray2 = new int [5]; // 0 0 0 0 0
//        intArray2[0] = 1;
//        intArray2[1] = 2;
//        intArray2[2] = 3;
//        intArray2[3] = 4;
//        intArray2[4] = 5;
//        System.out.println(intArray2[2]);
//
//        String [] stringArray = {"one", "two", "three"}; // default value is null
//        System.out.println(stringArray[2]);
        //intArray2[5] = 23;

        // PRINT ARRAY (TRAVERSE ARRAY)
        //System.out.println(intArray2);
        // cant print like this
        ArraysHelper.printIntArray(intArray, true);
        ArraysHelper.printIntArray(intArray, false);

//        // Enhanced for loop (for each)
//        for (int element : intArray) {
//            System.out.print(element + " ");
//        }
//
//        System.out.println();
//        // Theater and seats
//        String [] theater = {"Ana", "Maja", "Jan"};
//        // print seat number and person that reserved the spot
//        for (int i = 0; i < theater.length; i++) {
//            System.out.println("Seat number " + i + " is reserved by " + theater[i]);
//        }

        // SUM OF ELEMENTS IN ARRAY
        // 1 2 3 4 -> 1 + 2 + 3 + 4
        System.out.println("Sum of our array = " + ArraysHelper.sum(intArray));

        // AVERAGE VALUE OF ARRAY
        // 5 4 3 2 -> (5+4+3+2)/4
        System.out.println("Average of our array = " + ArraysHelper.average(intArray));

        // FIND LARGEST ELEMENT IN ARRAY
        System.out.println("The largest number in array = " + ArraysHelper.findLargest(intArray));

        // COUNT NUMBER OF EVEN ELEMENTS
        // a % 2 == 0
        System.out.println("Number of even elements = " + ArraysHelper.countEven(intArray));

        // SEARCH FOR ELEMENT IN ARRAY
        // 1,2,4,5 SEARCH FOR 3
        System.out.println("Number 3 is in array: " + ArraysHelper.search(intArray, 3));
        System.out.println("Number 6 is in array: " + ArraysHelper.search(intArray, 6));

        // CREATE A COPY OF ARRAY
        int [] copyArray = ArraysHelper.copyIntArray(intArray);
        System.out.println("Copy of array");
        ArraysHelper.printIntArray(copyArray, true);
        System.out.println("Original array");
        ArraysHelper.printIntArray(intArray, true);

        // REVERSE ARRAY (WITHOUT COPYING)
        int [] reversed = ArraysHelper.reverseIntArray(intArray);
        System.out.println("Reversed array");
        ArraysHelper.printIntArray(reversed, true);
        System.out.println("Original array");
        ArraysHelper.printIntArray(intArray, true);

        // CHECK IF 2 ARRAYS ARE EQUAL
        System.out.println("Are original array and copy the same? " + ArraysHelper.isEqual(intArray, copyArray));
        System.out.println("Are original array and reversed array the same? " + ArraysHelper.isEqual(intArray, reversed));

        // CREATE AN ARRAY USING STANDARD INPUT
//        int [] newArr = ArraysHelper.createArray();
//        ArraysHelper.printIntArray(newArr, true);

//        Scanner sc = new Scanner(System.in);
//        // get words array from string inputž
//        // bla bla bla -> {bla,bla,bla}
//        String input = sc.nextLine();
//        String [] words = input.split(" ");
//        for(String word : words) {
//            System.out.println(word);
//        }
//        char [] charArr = input.toCharArray();
//        for (char c : charArr){
//            System.out.println(c);
//        }

        // GET INTEGER ARRAY USING sc.nextLine()

//        int [] arrFromString = ArraysHelper.createIntArrayFromString();
//        System.out.println("Array from string");
//        ArraysHelper.printIntArray(arrFromString, true);

        // 2D ARRAYS
        int [][] matrix = {
                {1,2,3}, //row 0
                {4,5,6}, //row 1
                {7,8,5}
        };
        System.out.println(matrix[1][2]);
        matrix[1][2] = 97;
        System.out.println(matrix[1][2]);
        System.out.println("Our matrix");
        ArraysHelper.printMatrix(matrix);
    }

}