public class Rectangle {
    int height, width;

    Rectangle (int height, int width){
        this.height = height;
        this.width = width;
    }

    int area(){
        return height * width;
    }

    int perimeter(){
        return 2 * (width + height);
    }

    void print(){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
