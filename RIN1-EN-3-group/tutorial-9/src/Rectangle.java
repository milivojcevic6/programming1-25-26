public class Rectangle {
    // fields
    int width, height;

    // constructor
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    // method
    int area(){
      return height * width;
    }

    int perimeter(){
        return 2 * (height + width);
    }

    void print(){
        //prints rectangle using *
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * "); //print 1 row
            }
            System.out.println(); //start new row
        }
    }
}
