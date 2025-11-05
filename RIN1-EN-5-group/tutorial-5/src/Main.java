public class Main {
    public static void main(String[] args) {
        // ARRAYS IN JAVA
        // 1D ARRAYS
        int [] intArray = {10,5,1,0,11,15};

//        int [] intArray2 = new int[5]; // 0 0 0 0 0
//        intArray2[0] = 1;
//        intArray2[1] = 2;
//        intArray2[2] = 3;
//        intArray2[3] = 4;
//        intArray2[4] = 5;
//
//        System.out.println(intArray[4]);
//        //System.out.println(intArray[6]);
//        String [] s = {"bla", "blabla", "blablabla"};
//        System.out.println(s[2]);
//
//        System.out.println(s.length);

        // PRINT ARRAY
        System.out.print("Original array: ");
        ArraysHelper.printArray(intArray, true);
        System.out.print("Array printed backwards: ");
        ArraysHelper.printArray(intArray, false);

//        // Enhanced FOR (FOR EACH)
//        for (int element : intArray) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//
//        // Cinema seats and reservations
//        String [] cinemaSeats = {"Ana", "Maja", "Jan", "Nikola"};
//        for (int i = 0; i < cinemaSeats.length; i++) {
//            System.out.println("Seat number " + i + " is reserved by " + cinemaSeats[i]);
//        }

        // SUM ELEMENTS IN ARRAY
        // 10 + 5 + 1 + 0 + ...
        System.out.println("Sum of elements = " + ArraysHelper.sum(intArray));

        // AVERAGE VALUE IN ARRAY
        // (a+b+c)/3
        System.out.println("Average = " + ArraysHelper.average(intArray));

        // FIND MAX ELEMENT
        System.out.println("Max element = " + ArraysHelper.findMax(intArray));

        // COUNT ODD NUMBERS
        System.out.println("Number od odd elements = " + ArraysHelper.countOdd(intArray));

        // SEARCH FOR ELEMENT IN ARRAY
        // e.g. check if 5 is in intArray
        System.out.println("Element 0 present? ");
        System.out.println(ArraysHelper.search(intArray, 0));
        System.out.println("Element 0 present? ");
        System.out.println(ArraysHelper.searchWithIndex(intArray, 0));

        // CREATE COPY OF ARRAY
        int [] copy = ArraysHelper.copyArray(intArray);
        System.out.print("Original array: ");
        ArraysHelper.printArray(intArray, true);
        System.out.print("Copy of it: ");
        ArraysHelper.printArray(copy, true);

        // REVERSE ARRAY IN PLACE (NOT ON COPY)
        int [] reversed = ArraysHelper.reverseArray(intArray);
        System.out.print("Reversed array: ");
        ArraysHelper.printArray(reversed, true);
        System.out.print("Original array: ");
        ArraysHelper.printArray(intArray, true);
        System.out.print("Copy of it: ");
        ArraysHelper.printArray(copy, true);

        // CHECK IF 2 ARRAYS ARE EQUAL
        System.out.println("Reversed and copy are equal: " + ArraysHelper.isEqual(copy, reversed));

        // USING STDIN TO CREATE ARRAY
//        int [] newArr = ArraysHelper.createArray();
//        System.out.print("New array: ");
//        ArraysHelper.printArray(newArr, true);
//        int [] arrFromString = ArraysHelper.createArrayFromString();
//        System.out.print("Array from string input: ");
//        ArraysHelper.printArray(arrFromString, true);

        // 2D ARRAYS
        int [][] matrix = {
                {1,2,3},
                {4,5,6,2,3,2}, //row 1 or element number 1 in bigger cabinet :)
                {7,8,9}
        };

        System.out.println("Matrix:");
        ArraysHelper.printMatrix(matrix);

//        System.out.println(matrix[1][2]);
//
//        matrix[1][2] = 123;
//
//        System.out.println(matrix[1][2]);





    }
}