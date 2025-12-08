public class Rectangle {
    // fields
    int height, width;

    // Constructor
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * (width + height);
    }

    void print(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
