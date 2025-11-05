import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ARRAYS
//        int [] intArr;
//        intArr = new int[5]; // default is 0
//
//        int [] intArr2 = {1,2,3,4,5};
//        System.out.println(intArr2[2]);
//
//        String [] strArr = new String[3]; // default value is Null
//        strArr[0] = "zero";
//        strArr[1] = "one";
//        strArr[2] = "two";
//        System.out.println(strArr[2]);
//        strArr[2] = "three";
//        System.out.println(strArr[2]);

        //strArr[3] = "four";

        // print or traverse array
        int [] intArray = {1,2,3,4,5,6,7,8,9,10,11};

        ArraysHelper.printArray(intArray, "first");
        System.out.println();
        ArraysHelper.printArray(intArray, "last");
        System.out.println();

        // get sum of int array
        System.out.println("Sum = " + ArraysHelper.sumArray(intArray));

        // average of array
        System.out.println("Average = " + ArraysHelper.averageArray(intArray));

        // find minimum
        System.out.println("Minimum = " + ArraysHelper.findMinimum(intArray));

        // find max fo at home

//        String [] theater = {"Ana", "Marko", "Jan"};
//        for (String seat : theater) {
//            System.out.println(seat);
//        }
//
//        for(int i = 0; i < theater.length; i++) {
//            System.out.println("On the seat number " + i + ": " + theater[i]);
//        }

        // count even elements
        System.out.println("Number of even: " + ArraysHelper.countEven(intArray));

        // search for element in array
        System.out.println("Element 10 is in array: " + ArraysHelper.search(intArray, 10));
        System.out.println("Element 14 is in array: " + ArraysHelper.search(intArray, 14));

        // create copy of int array
        int [] copy = ArraysHelper.copyArray(intArray);
        ArraysHelper.printArray(copy, "first");

        // reverse array
        System.out.println();
        int [] reversed = ArraysHelper.reverseArray(intArray);
        ArraysHelper.printArray(reversed, "first");
        System.out.println();
        ArraysHelper.printArray(intArray, "first");
        System.out.println();
        int [] reversed2 = ArraysHelper.reverseArrayCopy(intArray);
        ArraysHelper.printArray(reversed2, "first");
        System.out.println();
        ArraysHelper.printArray(intArray, "first");
        System.out.println();

        // create new array using STDIN
        int [] newArray = ArraysHelper.createIntArray();
        ArraysHelper.printArray(newArray, "first");

        System.out.println();
        System.out.println("Please input integers separated by spaces:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] inputStrings = input.split(" ");
        int [] transformed = new int[inputStrings.length];
        for( int i = 0; i < inputStrings.length; i++ ) {
            transformed[i] = Integer.parseInt(inputStrings[i]);
        }
        ArraysHelper.printArray(transformed, "first");

        System.out.println();
        System.out.println("Please enter string to transform into char array:");
        char [] charArray = sc.nextLine().toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        // 2D

        int [][] matrix = {
                {1,2,3},
                {4,5,6}, // row 1
                {7,8,9}
        };

        System.out.println(matrix[1][2]);



        ArraysHelper.printMatrix(matrix);
        System.out.println();
        matrix[1][2] = 12;
        ArraysHelper.printMatrix(matrix);

        System.out.println(ArraysHelper.isEqual(intArray, copy));
        System.out.println(ArraysHelper.isEqual(intArray, reversed));






    }
}