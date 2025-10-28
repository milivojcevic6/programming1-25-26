public class Helper {
    public static void multTable(int n){
        for(int i = 1; i <= n; i++){ //outer
            for(int j = 1; j <= n; j++){
                System.out.print(i + "*" + j + "=" + i * j + " || ");
            }
            System.out.println();
        }
    }

    public static void coordinates(int size){
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int height, int width){
        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                System.out.print(" * ");
            }// start new row
            System.out.println();
        }
    }

    public static void drawA(int size){
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j <= i){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void drawI(int size){
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || i == size -1 || j == 0 || j == size -1 || i == j || i+j == size - 1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
