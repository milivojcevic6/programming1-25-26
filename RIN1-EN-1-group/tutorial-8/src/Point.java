public class Point {
    // public accessible from anywhere
    // private only inside the class
    // final - constant no changing

    // when using private fields it is called encapsulation
    private int x;
    private int y; // fields (attributes) basically data of an object

    // WHEN WE HAVE MORE CONSTRUCTORS WE CALL IT CONSTRUCTOR OVERLOADING

    public Point(){
        this(0,0);
//        x = 0;
//        y = 0;
    }

    public Point(int x){
        this(x,0);
    }

    public Point(int x, int y){ // constructor (parameterized)
        this.x = x;
        this.y = y;
        //drawPoint();
    }

    // methods that help us explain behaviour of our object
    public String toString(){
        return "Coordinates of point are: (" + x +"," + y + ")";
    }

    public void drawPoint(){
        System.out.println("Drawing point at coordinates: " +x + ","+y);
    }

    // getters and setters
    public int getX(){
        return x;
    }

    public void setX(int x){
        if(x >= 0){
            this.x = x;
        }else {
            System.out.println("x should be a positive integer");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // euclidean distance
    public double euclideanDistance(Point other){
        double distance = Math.sqrt(Math.pow((other.x - this.x),2) + Math.pow((other.y - this.y),2));
        return distance;
    }

    // distance from origin (0,0)
    public double distanceFromOrigin(){
        Point origin = new Point();
        return euclideanDistance(origin);
    }

    // calculate midpoint
    public Point midpoint(Point other){
        Point midpoint = new Point((this.x + other.x)/2, (this.y + other.y)/2);
        return midpoint;
    }// should be casted to double

    public double squareArea(Point other){
        double sideOfSquare = euclideanDistance(other) / Math.sqrt(2);
        double area = Math.pow(sideOfSquare,2); //or sideOfSquare * sideOfSquare
        return area;
    }

    public double squarePerimeter(Point other){
        double sideOfSquare = euclideanDistance(other) / Math.sqrt(2);
        double perimeter = 4 * sideOfSquare;
        return perimeter;
    }
}
