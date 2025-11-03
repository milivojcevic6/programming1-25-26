import java.util.Scanner;

public class ArraysHelper {
    public static void printArray(int [] arr, String whereToStart){
        if(whereToStart.equals("first")){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }else if(whereToStart.equals("last")){
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }else{
            System.out.println("Invalid input");
        }
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i = 0; i <= arr.length - 1; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double averageArray(int[] arr){
        int sum = sumArray(arr); // reuse function we created
        return (double) sum / arr.length;
    }

    public static int findMinimum(int[] arr){
        int min = arr[0];
        for(int element: arr){
            if(element < min){
                min = element;
            }
        }
//        for(int i = 0; i <= arr.length - 1; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
        return min;
    }

    public static int countEven(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean search(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return true;
            }
        }
        return false;
    }

    public static int [] copyArray(int[] arr){
        int [] copy = new int[arr.length]; // initialize new array with same length as input array
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int [] reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static int [] reverseArrayCopy(int[] arr){
        int [] copy = copyArray(arr);
        for(int i = 0; i < arr.length/2; i++){
            int temp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = temp;
        }
        return copy;
    }

    public static int [] createIntArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Please enter " + length + " elements: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isEqual(int [] arr1 , int [] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
