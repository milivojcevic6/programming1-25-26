// class is a blueprint for making objects
public class Point {
    //fields (attributes) - data of our object
    // final means constant no future changes
    // public - accessible from anywhere
    // private - accessible inside class only

    // WHEN USING PRIVATE FIELDS IT IS CALLED ENCAPSULATION
    // we can use setters and getters
    private int x;
    private int y;

    public Point(){
        //new Point(0,0);
        this(0); // it calls other constructor
    }

    public Point(int x){
        this(x,0);
    }

    public Point(int x, int y){ //constructor
        this.x = x; // this means use this objet's field named x
        this.y = y;
    }// never return type and must be public


    // methods - behaviour of our object (possible actions)
    // getter allows us to read data
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
    // setter allows us to write data
    public void setX(int x){
        // only positive values
        if(x < 0){
            System.out.println("Only positive integers");
        }else{
            this.x = x;
        }
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawPoint(){
        System.out.println("Drawing a point at " + x + "," + y);
    }

    public String toString(){
        String s  = "Coordinates of point: ("+x+","+y+")";
        return s;
    }

    public double euclideanDistance(Point other){
        double distance = Math.sqrt(Math.pow((other.x - this.x),2) + Math.pow((other.y - this.y),2));
        return distance;
    }

    public double distanceFromOrigin(){ // origin = (0,0)
        Point origin = new Point(); // by default 0,0
        return euclideanDistance(origin);
    }

    public double areaOfSquare(Point other){
        double diagonal = euclideanDistance(other);
        double sideOfSquare = diagonal / Math.sqrt(2);
        double area = sideOfSquare * sideOfSquare;
        return area;
    }


    // example of static method
    public static void hi(){
        System.out.println("HI");
    }
}
