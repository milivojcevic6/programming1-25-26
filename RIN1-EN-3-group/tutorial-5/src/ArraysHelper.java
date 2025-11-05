import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int[] arr, boolean fromBeginning){
        if(fromBeginning) {
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }else{
            for (int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static int sum(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int [] arr){
        int sum = sum(arr);
        int numOfElements = arr.length;

        return  (1.0 * sum)/numOfElements; // you can use (double) casting as well
    }

    public static int findMin(int [] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){ // we start fomr index 0 bcs we dont want to compare it to itself
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int countOdd(int [] arr){
        int counter = 0;
        for( int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                counter++;
            }
        }
        return counter;
    }

    public static boolean search(int [] arr, int target){
        for(int number : arr){
            if(number == target){
                return true;
            }
        }
        return false;
    }

    public static String searchWithIndex(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return "Element " +target+ " found at index " + i;
            }
        }
        return "Element "+ target + " not found";
    }

    public static int [] copyArray(int[] arr){
        int [] copy = new int [arr.length];

        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }

        return copy;
    }

    public static int [] reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static int [] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length]; // 0 0 0 0 0...
        System.out.println("Enter " + length + " elements: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int [] createArrayFromString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers separated by semicolons (;) :");
        String input = sc.nextLine();
        String [] elements = input.split(";");
        int [] arr = new int[elements.length];
        for(int i = 0; i < elements.length; i++){
            arr[i] = Integer.parseInt(elements[i]);
        }
        return arr;
    }

    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // start new row
        }
    }
}
