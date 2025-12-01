public class Main {
    public static void main(String[] args) {
        // create a Point object
        Point point1; // declaration
        point1 = new Point(4,9); //initialization
        Point point2 = new Point(8,2);
        Point origin = new Point();
        Point point3 = new Point(5);
 //       point2.x = 76;
//        point2.y = 21;

//        point1.setX(32);
//        System.out.println(point1.getX());
//        //System.out.println(point1.y);
//        System.out.println("POINT 2");
//        System.out.println(point2.x);
//        //System.out.println(point2.y);
//        System.out.println("POINT ORIGIN");
//        System.out.println(origin.x);
//        System.out.println(origin.y);
//        System.out.println("POINT 3");
//        System.out.println(point3.x);
//        System.out.println(point3.y);


        // calling a method
//        point1.drawPoint();
//
//        System.out.println(point1);
//        System.out.println(point2);

        // euclidean distance
        System.out.println("Distance from point1 to point2 is: " + point1.euclideanDistance(point2));
        // distance from origin
        System.out.println("Distance from origin for point1: " + point1.distanceFromOrigin());
        // midpoint
        Point p1 = new Point(4,4);
        Point p2 = new Point(4,6);
        Point midpoint = p1.midpoint(p2);
        System.out.println("Midpoint between (3,4) and (4,6): " + midpoint);

        // area of square defined by two points
        System.out.println("Area of sqare defined by point1 and point2: " + point1.squareArea(point2));
        // perimeter of square
        System.out.println("Perimeter of sqare defined by point1 and point2: " + point1.squarePerimeter(point2));

        // Create 5 random points with x and y 0 to 10 and find 2 closest points
        Point [] points = new Point[5];

        for (int i = 0; i < points.length; i++){
            int min = 0;
            int max = 10;
            int randomX = (int) (Math.random() * (max - min + 1) + min);
            int randomY = (int) (Math.random() * (max - min + 1) + min);
            points[i] = new Point(randomX,randomY);
        }

        System.out.println("5 random points:");

        for (Point p: points){
            System.out.println(p);
        }

        double minDistance = Double.MAX_VALUE;
        Point pp1 = new Point();
        Point pp2 = new Point();

        for (int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double currentDistance = points[i].euclideanDistance(points[j]);
                if( currentDistance < minDistance){
                    minDistance = currentDistance;
                    pp1 = points[i];
                    pp2 = points[j];
                }
            }
        }

        System.out.println("Closest point are: " + pp1 + " and " + pp2);

        for(int i = 10; i >= 0; i--){ // rows
            for (int j = 0; j <= 10; j++){ //columns
                boolean pointFound = false;
                for (Point p: points){
                   if(p.getX() == j && p.getY() == i){
                       pointFound = true;
                       break;
                   }
               }

               if(pointFound){
                   System.out.print(" o ");
               }else{
                   System.out.print(" . ");
               }
            }
            System.out.println();
        }

        // CAR OBJECTS
        System.out.println();
        System.out.println("------------CAR OBJECTS---------------");
        Car myCar = new Car("Volvo","XC40",40000.00);
        System.out.println(myCar.getPrice());
        myCar.setPrice(30000);
        System.out.println(myCar.getPrice());
        myCar.drive();
        myCar.breaking();
        System.out.println(Car.counter);
        Car c = new Car("asd","aqwd",12);
        System.out.println(Car.counter);

    }
}