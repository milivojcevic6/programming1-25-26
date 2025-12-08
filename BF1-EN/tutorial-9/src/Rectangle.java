public class Rectangle {
    // fields
    int height;
    int width;

    //constructor
    Rectangle(int height, int width){
        this.width = width;
        this.height = height;
    }

    // methods
    int area(){
        return height * width;
    }

    int perimeter(){
        return 2*(height+width);
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
