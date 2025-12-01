public class Point {
    // object is instance of class
    // DATA
    // fields (attributes)

    // encapsulation - hides data from outside of the object
    // public - accessible from anywhere
    // private - accessible from same class only
    // protected - same project
    // final - constant (unchanglabe)
    private int x;
    private int y;
    String color;

    //Constructor overloading
    public Point(){
        this(0);
    }

    public Point(int x){
        this(x,0);
    }

    public Point(int x, int y){
        this(x, y, "Black");
    }

    public Point(int x,int y, String color){
        this.x = x; // this means this object and this.x means field x
        this.y = y;
        this.color = color;
    }

    // METHODS
    public void draw(){
        System.out.println(color + " point drawn at coordinates: " + x + "," +y);
    }

    // example of static method
    public static void hi(){
        System.out.println("HI I AM STATIC METHOD");
    }

    public String toString(){
        return "Coordinates: (" +x+","+y+")   Color: "+ color;
    }

    // getters
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    // setters
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double euclideanDistance(Point other){
        double distance = Math.sqrt(Math.pow((this.x - other.x),2) + Math.pow((this.y - other.y),2));
        return distance;
    }

    public double distanceFromOrigin(){
        Point origin = new Point();
        return euclideanDistance(origin);
    }

    public double areaOfSquare(Point other){
        double diagonal = euclideanDistance(other);
        return diagonal * diagonal / 2; // ask your colleagues from class why steps are missing
    }

}
