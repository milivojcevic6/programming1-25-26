public class Point {
    // data - fields (attributes)
    // private -  accessible inside the same class
    // public - from anywhere
    // default - from same package
    private int x;
    private int y;
    String color;
    // ENCAPSULATION -  fields are private and we create mehtods for accessing them (easily control the access)
    // when we have more constructors it is called constructor overloading
    Point(){
        this(0);
        //new Point(0,0,"black");
    }

    Point(int x){
        this(x, 0, "black");
    }

    Point(int x, int y, String color){ // constructor
        this.x = x; // this references object itself and distinguishes fields from parameters
        this.y = y;
        this.color = color;
    }

    // methods (behaviour)
    void printColor(){
        System.out.println(color);
    }

    public String toString(){
        return "Point coordinates: " + x + "," + y + "      color: " + color;
    }

    // setter and getters
    // setter used to modify fields
    // getter used to read fields
    public int getX(){
        return x;
    }

    public void setX(int x){
        if(x < 0){
            System.out.println("Only positive values");
        }else{
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double euclideanDistance(Point other){
        double result = Math.sqrt((Math.pow((this.x - other.x),2) + (Math.pow((this.y - other.y),2))));
        return result;
    }

    public double distanceFromOrigin(){
        Point origin = new Point(0,0,"black"); // new Point() works as well
        return euclideanDistance(origin);
    }

    public double squareArea(Point other){
        double diagonal = euclideanDistance(other);
        double a = diagonal / Math.sqrt(2);
        double area = Math.pow(a,2);
        return area;
    }

    public double squarePerimeter(Point other){
        double diagonal = euclideanDistance(other);
        double a = diagonal / Math.sqrt(2);
        double perimeter = 4 * a;
        return perimeter;
    }
}
