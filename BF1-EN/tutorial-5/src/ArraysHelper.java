import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] array, boolean fromStart){
        if(fromStart){
            for(int i = 0; i <= array.length - 1; i++){
                System.out.print(array[i] + " ");
            }
        }else {
            for(int i = array.length - 1; i >= 0; i--){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int sum(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double average(int [] array){
        int sum = sum(array);
        return (double) sum / array.length;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int countOdd(int [] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static boolean search(int [] array, int target){
        for(int element : array){
            if (element == target) {
                return true;
            }
        }
//        for(int i = 0; i < array.length; i++){
//            if(array[i] == target){
//                return true;
//            }
//        }
        return false;
    }

    public static int [] copyIntArray(int [] array){
        int [] copy = new int[array.length];
        for(int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static int [] reverseIntArray(int [] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static boolean isEqual(int [] array1, int [] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;

    }

    public static int [] createIntArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length/size of array:");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter "+ size + " elements:");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int [] createIntArrayFromString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers separated by space:");

        String input = sc.nextLine();
        String[] elements = input.split(" ");
        int [] array = new int[elements.length];
        for(int i = 0; i < elements.length; i++){
            array[i] = Integer.parseInt(elements[i]);
        }
        return array;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j= 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
