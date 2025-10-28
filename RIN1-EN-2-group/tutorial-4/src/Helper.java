public class Helper {
    public static void multTable(int n){
        for (int i = 1; i <= n; i++){ // outer loop
            for (int j = 1; j <= n; j++){ // inner loop
                System.out.print(i + "*" + j + "=" +(i * j) + " || ");
            }
            System.out.println();
        }
    }

    public static void drawRectanle(int height, int width){
        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                // print star
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawA(int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(i >= j) System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawI(int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(j == 0 || j == size - 1 || i == 0 || i == size -1 || i == j || (i+j) == size - 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void drawG(int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(i == 0 || i == size - 1 || i + j == size - 1 ) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
