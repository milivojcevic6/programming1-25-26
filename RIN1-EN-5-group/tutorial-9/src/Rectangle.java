public class Rectangle {
    // fields
    int height, width;

    // constructor
    public Rectangle(int height, int width){
        this.width = width;
        this.height = height;
    }

    // methods
    int area(){
        return height * width;
    }

    int perimeter(){
        return 2 * height + 2 * width;
    }

    void print(){
        // draw it using stars
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * "); // draw 1 row
            }
            System.out.println(); // start new row
        }
    }
}
