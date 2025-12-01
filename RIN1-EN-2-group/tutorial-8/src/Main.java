public class Main {
    public static void main(String[] args) {
        // OBJECTS
        Point point1; // declaration
        // we want to create new point and specify x and y directly
        point1 = new Point(4,3); // initialization // new Point() - constructor
        Point point2 = new Point(4);

        // change x and y when public
        point1.setX(10);

        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());

        System.out.println("POINT 2");
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());

        // static method - can be called directely from class
        Point.hi();
        // non-static method - needs instance of object first
        point1.drawPoint();

        // method toString() that transforms object to meaningful string representation
        System.out.println(point1);
        System.out.println(point2);

        // distance form point1 to point2
        System.out.println("Distance from point1 to point2: " + point1.euclideanDistance(point2));
        System.out.println("Distance from origin to point2: " + point2.distanceFromOrigin());

        // area of square defined by two points
        System.out.println("Area of square defined by point1 and point 2: " + point1.areaOfSquare(point2));

        // create 5 random points with x and y 0 to 10 and find 2 points that are the closest
        Point [] points = new Point[5];

        for(int i = 0; i < points.length; i++){
            int min = 0;
            int max = 10;
            int randomX = (int) (Math.random() * (max - min + 1) + min);
            int randomY = (int) (Math.random() * (max - min + 1) + min);
            points[i] = new Point(randomX,randomY);
        }

        System.out.println("5 random poitns");
        for (Point p : points){
            System.out.println(p);
        }

        double minDistance = Double.MAX_VALUE;
        Point first = new Point();
        Point second = new Point();

        for(int i = 0; i < points.length; i++){
            for (int j = i+1; j < points.length; j++){
                double currentDistance = points[i].euclideanDistance(points[j]);
                if(currentDistance < minDistance){
                    minDistance = currentDistance;
                    first = points[i];
                    second = points[j];
                }
            }
        }
        System.out.println("Minimal distance is " + minDistance + " and points are: " + first + second);


        // print grid with points
        for(int i = 10; i >= 0; i--){ // rows (y axis)
            for (int j = 0; j <= 10; j++){ // columns (x axis)
                boolean pointFound = false;
                for (Point p: points){
                    if(p.getX() == j && p.getY() == i){
                        pointFound = true;
                        break;
                    }
                }
                if(pointFound){
                    System.out.print(" o ");
                }else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------CAR OBJECTS----------");

        Car mercedes = new Car("Mercedes","G wagon", 100000.00);

        mercedes.drive();
        mercedes.playMusic("Wake me up");

        System.out.println(mercedes.getPrice());
        mercedes.setPrice(80000);
        System.out.println(mercedes.getPrice());

        System.out.println(mercedes);
        Car volvo = new Car("Volvo","XC90", 90000);
        System.out.println(volvo);

    }

}