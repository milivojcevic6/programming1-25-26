import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }else{
            for ( int i = arr.length - 1; i >= 0; i --) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static int sum(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int [] arr){
        int sum = sum(arr);

        return (double) sum/arr.length;
    }

    public static int findMax(int [] arr){
        int max = arr[0];
        for (int element : arr){
            if(element > max){
                max = element;
            }
        }
        return max;
    }

    public static int countEven(int [] arr){
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static boolean search(int [] arr, int target){
        for (int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

    public static int [] copyIntArray(int[] arr){
        int [] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int [] reverseIntArray(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            // create tem var
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static int [] createIntArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of int array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " integers of array: ");
        for (int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int [] createIntArrayFromStringInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces: ");
        String input = sc.nextLine();
        // create string array
        String [] inputArray = input.split(" ");
        // transform each string to int
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        return arr;
    }

    public static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
