public class Main {
    public static void main(String[] args) {
        // ARRAYS IN JAVA
        int [] intArray = {1,2,3,4,5};
//        System.out.println(intArray[2]);
//        intArray[2] = 99;
//        System.out.println(intArray[2]);
//
//        String [] strArray;
//        strArray = new String[3]; //default for Strings is Null and for ints is 0
//        System.out.println(strArray[2]);
//        strArray[0] = "hello";
//        strArray[1] = "world";
//        strArray[2] = "!";
//        System.out.println(strArray[1]);
//        System.out.println(strArray[2]);

        //System.out.println(strArray[20]);
        // PRINT ARRAY
        System.out.println("Original array:");
        ArraysHelper.printIntArray(intArray, true);
        System.out.println("Original array in reverse:");
        ArraysHelper.printIntArray(intArray, false);

        // SUM ELEMENTS IN ARRAY
        System.out.println("Sum = " + ArraysHelper.sum(intArray));

        // AVERAGE OF ELEMENTS
        System.out.println("Average = " + ArraysHelper.average(intArray));

        // FIND SMALLEST NUMBER (MINIMUM)
        System.out.println("Minimum = " + ArraysHelper.findMin(intArray));

        // COUNT ODD NUMBERS
        System.out.println("Number of odd elements = " + ArraysHelper.countOdd(intArray));

        // SEARCH FOR ELEMENT IN ARRAY
        System.out.println("Element 5 is in our array: " + ArraysHelper.search(intArray,5));
        System.out.println("Element 77 is in our array: " + ArraysHelper.search(intArray,77));

        // EXAMPLE FOR FOR EACH
//        String [] theater = {"Ana", "Marko", "Janez"};
//        for(String seat : theater){
//            System.out.println(seat);
//        }
//        for(int i = 0; i < theater.length; i++){
//            System.out.println("Seat number " + i + " is reserved by " + theater[i]);
//        }

        // CREATE A COPY OF ARRAY
        System.out.println("Copy of our array:");
        int [] copy = ArraysHelper.copyIntArray(intArray);
        ArraysHelper.printIntArray(copy, true);

        // REVERSE ARRAY
        System.out.println("Array reversed:");
        int [] reversed = ArraysHelper.reverseIntArray(intArray);
        ArraysHelper.printIntArray(reversed, true);
        System.out.println("Original array:");
        ArraysHelper.printIntArray(intArray, true);
        System.out.println("Copy of array:");
        ArraysHelper.printIntArray(copy, true);

        // CHECK IF 2 INT ARRAYS ARE EQUAL (SAME)
        System.out.println("Are original array and copy same now: " + ArraysHelper.isEqual(copy, intArray));

//        // STDIN TO CREATE ARRAYS
//        int [] newArray = ArraysHelper.createIntArray();
//        System.out.println("New array:");
//        ArraysHelper.printIntArray(newArray, true);
//        // USE STRING (NEW LINE) TO GET INT ARRAY
//
//        int [] fromString = ArraysHelper.createIntArrayFromString();
//        System.out.println("New array from string:");
//        ArraysHelper.printIntArray(fromString, true);

        String s = "Hello World";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }

        // 2D ARRAYS
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Last element of Matrix:" + matrix[2][2]);
        ArraysHelper.printMatrix(matrix);
        matrix[2][2] = 999;
        System.out.println("Last element of Matrix:" + matrix[2][2]);
        System.out.println("Printing matrix:");
        ArraysHelper.printMatrix(matrix);






    }
}