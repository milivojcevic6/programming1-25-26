public class Main {
    public static void main(String[] args) {
        // JAVA ARRAYS
        // 1D ARRAYS

        int [] intArray = {10,5,1,0,3,13,15};
//        System.out.println(intArray[4]);
//        int [] intArray2;
//        intArray2 = new int [5]; // 0 0 0 0 0 deafault values
//        intArray2[0] = 1;
//        intArray2[1] = 2;
//        intArray2[2] = 3;
//        intArray2[3] = 4;
//        intArray2[4] = 5;
//        System.out.println(intArray2[4]);
//        //System.out.println(intArray2[5]);
//        String [] s = {"asd","asfd","asdfdf"};
//        System.out.println(s[2]);
//        double [] d = {1.2,3.4};
//        System.out.println(d[1]);

        // PRINT ARRAY
        //System.out.println(intArray);
        // Element by element and print each
        System.out.println("From index 0");
        ArraysHelper.printIntArray(intArray, true);
        System.out.println("From arr.length - 1");
        ArraysHelper.printIntArray(intArray, false);

        // Enhanced for loop (for each)
        // works with elements directly not using indexes
//        for (int integer : intArray){
//            System.out.println(integer);
//        }

//        String [] cinema = {"Ana", "Marko", "Jan"};
//        for(int i = 0; i < cinema.length; i++){
//            System.out.println("Seat number " + i + " is reserved by " + cinema[i]);
//        }

        // SUM OF ELEMENTS IN ARRAY
        // 10 + 5 + 1 ... all of them
        System.out.println("Sum of numbers in array = " + ArraysHelper.sum(intArray));

        // AVERAGE VALUE
        // (a + b +c) / 3
        System.out.println("Average value = " + ArraysHelper.average(intArray));

        // FIND SMALLEST (MIN) ELEMENT
        System.out.println("Minimal value in array = " + ArraysHelper.findMin(intArray));

        // COUNT ODD NUMBERS IN ARRAY
        System.out.println("Number of odd elements = " + ArraysHelper.countOdd(intArray));

        // SEARCH METHOD TO CHECK FOR ELEMENT IN ARRAY
        // is 5 in array? we check all elements and return true/false
        System.out.println("Number 5 is in the array: " + ArraysHelper.search(intArray, 5));
        System.out.println("Number -5 is in the array: " + ArraysHelper.search(intArray, -5));
        System.out.println("Searching for number 5: " + ArraysHelper.searchWithIndex(intArray, 5));

        // MAKE A COPY OF ARRAY
        int [] copy = ArraysHelper.copyArray(intArray);
        System.out.println("Original array");
        ArraysHelper.printIntArray(intArray, true);
        System.out.println("Copy of array");
        ArraysHelper.printIntArray(copy, true);

        // REVERSE ARRAY (IN PLACE; WITHOUT COPYING)
        int [] reversed = ArraysHelper.reverseArray(intArray);
        System.out.println("Reversed array");
        ArraysHelper.printIntArray(reversed, true);
        System.out.println("Original array");
        ArraysHelper.printIntArray(intArray, true);
        System.out.println("Copy of array");
        ArraysHelper.printIntArray(copy, true);

//        // CREATE ARRAYS USING STANDARD INPUT
//        int [] newArray = ArraysHelper.createArray();
//        ArraysHelper.printIntArray(newArray, true);
//
//        int [] arrayFromString = ArraysHelper.createArrayFromString();
//        System.out.println("Array from string input");
//        ArraysHelper.printIntArray(arrayFromString, true);

        // 2D ARRAYS
        int [][] matrix = {
                {1,2,3},
                {4,5,6,2,3,4}, // row 1  //jagged arrays if different num of elements in rows
                {7,8,9}
        };

//        System.out.println(matrix[1][2]);
        System.out.println("Our matrix");
        ArraysHelper.printMatrix(matrix);

//        matrix[1][2] = 12312;
//        System.out.println(matrix[1][2]);




    }
}