// class of 2D points
public class Point {
    // DATA
    // private - accessible from same class
    // public - from anywhere
    // default - same package
    // ENCAPSULATION - helps us controls access to our fields
    private int x; // fields (attributes)
    private int y;
    String color;
    // METHODS

    public Point(){
        // set x and y to 0 and color to black
        this(0,0);
        //        color = "black";
        //        this.x = 0;
        //        this.y = 0;
    }

    public Point(int x, int y){
//        color = "black";
//        this.x = x;
//        this.y = y;
        this(x,y,"black");
    } // constructor overloading

    public Point(int x, int y, String color){// parametrized constructor
        this.x = x; // this helps distinguish field from parameter
        this.y = y;
        this.color = color;
        //drawPoint();
    }

    // setter and getters
    // setters - write to data
    // getters - read from data


    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return color + " point drawn at: " + x + "," + y;
    }

    static public void staticDrawPoint(String color, int x, int y){
        System.out.println(color + " point drawn at: " + x + "," + y);
    }
    public void drawPoint(){
        System.out.println(color + " point drawn at: " + x + "," + y);
    }

    public double euclideanDistance(Point other){
        double distance = Math.sqrt(Math.pow((this.x - other.x),2) + Math.pow((this.y - other.y),2));
        return distance;
    }

    public double distanceFromOrigin(){
        Point origin = new Point(); // 0 0 coordinates
        return euclideanDistance(origin);
    }

    public double areaOfSquare(Point other){
        double diagonal = euclideanDistance(other);
        double a = diagonal / Math.sqrt(2);
        return a * a;
    }


}
