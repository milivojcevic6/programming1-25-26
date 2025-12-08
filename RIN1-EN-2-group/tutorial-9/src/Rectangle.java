public class Rectangle {
    // fields
    int height, width;

    // constructor
    Rectangle(int height, int width){
        this.width = width;
        this.height = height;
    }

    int area(){
        return height * width;
    }

    int perimeter(){
        return 2* (height + width);
    }

    void print(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * "); // print 1 row
            }
            System.out.println(); // start new row
        }
    }
}
