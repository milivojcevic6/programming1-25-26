public class Point {
    // DATA
    // fields (attributes)
    // public - accessible from anywhere
    // private - accessible only within same class
    // final - unchangable (constant)

    // ENCAPSULATION - using private fields and accessing using getters and setters
    private int x;
    private int y;

    //constructor overloading
    public Point(){// create 0,0 point
        //new Point(0,0);
        this(0);
    }

    public Point(int x){
        this(x,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // methods - tell us possible actions or behaviour of our object
    public int getX(){
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

    public void drawPoint(){
        System.out.println("Point drawn!");
    }

    public String toString(){
        return "Coordinates: (" + x + "," + y + ")";
    }

    public static void hi(){
        System.out.println("HI I AM STATIC METHOD");
    }

    public double euclideanDistance(Point other){
        double distance = Math.sqrt(Math.pow(this.x - other.x,2) + Math.pow(this.y - other.y,2));
        return distance;
    }

    public double distanceFromOrigin(){ // point (0,0)
        Point origin = new Point();
        return euclideanDistance(origin);
    }

    public double areaOfSquare(Point other){
        double diagonal = euclideanDistance(other);
        double sideOfSquare = diagonal / Math.sqrt(2);
        double area = sideOfSquare * sideOfSquare; // change to * 4 to get perimeter
        return area;
    }

}
