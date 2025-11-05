import java.util.Scanner;

public class ArraysHelper {
    public static void printArray(int[] arr, boolean startFromZero) {
        if(startFromZero) {
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }else{
            for (int i = arr.length - 1; i >= 0; i--) {
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
        int length = arr.length;

        return (double) sum/length;
    }

    public static int findMax(int [] arr){
        int max = arr[0];
        for (int i  = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int countOdd(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) count++;
        }
        return count;
    }

    public static boolean search(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static String searchWithIndex(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return ("Element found at index " + i);
            }
        }
        return "Element not found";
    }

    public static int [] copyArray(int[] arr){
        int [] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int [] reverseArray(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) return false;
        }

        return true;
    }

    public static int [] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = sc.nextInt();
        int [] arr = new int[length]; // 0 0 0 0 0 ...
        System.out.println("Enter " + length + " integers: ");
        for (int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int [] createArrayFromString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers separated by a comma (,): ");
        String input  = sc.nextLine();
        String [] strArray = input.split(",");
        int [] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }
        return arr;
    }

    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // start new row
        }
    }



}
