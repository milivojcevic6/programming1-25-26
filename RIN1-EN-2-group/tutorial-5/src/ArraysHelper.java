import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int[] arr, boolean fromStart) {
        if(fromStart) {
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

    public static int findLargest(int [] arr){
        int max = arr[0];

        for( int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int countEven(int [] arr){
        int counter = 0;
        for (int number : arr){
            if(number % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static boolean search(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int [] copyIntArray(int[] arr){
        int [] copy = new int[arr.length]; // 0 0 0 0 0 ...
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int [] reverseIntArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i]; // save ith element to temp
            arr[i] = arr[arr.length - 1 - i]; // swap ith and arr.length - 1 -i
            arr[arr.length - 1 - i] = temp; // put temp to arr.length - i - 1
        }
        return arr;
    }

    public static boolean isEqual(int [] arr1, int [] arr2){
        if (arr1.length != arr2.length){
            return false;
        }

        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static int [] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = sc.nextInt();
        int [] arr = new int[length]; // 0 0 0 0 0 0
        System.out.println("Enter " + length + " integers");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int [] createIntArrayFromString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers separated by comma (,) ");
        String input = sc.nextLine();
        String [] strings = input.split(",");
        // "1" "2" ...
        int [] arr = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            arr[i] = Integer.parseInt(strings[i]);
            // Integer.parseInt("1") -> 1
        }
        return arr;
    }

    public static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            } // row printed
            //go to new line
            System.out.println();
        }
    }

}
