public class Helper {
    public static void multTable(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i + "*" + j +"=" + i *  j + "||");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int height, int width){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(" * "); // printing row
            }
            System.out.println();// new row
        }
    }

    public static void drawA(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i >= j) System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawI(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || i == size - 1 || j == 0 || j == size - 1 || i == j || i+j == size - 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
