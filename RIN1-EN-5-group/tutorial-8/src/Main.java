public class Main {
    public static void main(String[] args) {
        // OBJECTS
        // OOP - Object Oriented Programming

        Point point1; // declaration
        point1 = new Point(5,3,"Green"); // constructor new Point(); // initialization

        System.out.println("X:" + point1.getX());
        System.out.println("Y:" + point1.getY());

        //point1.x = 2;

        point1.draw();

        Point point2 = new Point(6,8,"Red");
        point2.draw();



        Point point3 = new Point();
        // non-static method
        point3.draw();

        // static method
        Point.hi();

       // print object - toString()
        System.out.println(point2);
        System.out.println(point1);
        System.out.println(point3);

        Line l = new Line();
        l.print();

        // distance
        System.out.println("Distance from point1 to point2 = " + point1.euclideanDistance(point2));
        System.out.println("Distance from origin to point2 = " + point2.distanceFromOrigin());

        // area of square
        System.out.println("Area of square defined by point 1 and 3: " + point1.areaOfSquare(point3));

        // create 5 random points with x and y form 0 to 10 and find 2 closest points

        Point [] points = new Point[5];

        for (int i = 0; i < points.length; i++){
            int randomX;
            int randomY;

            int min = 0;
            int max = 10;
            randomX = (int) (Math.random() * (max - min + 1) + min);
            randomY = (int) (Math.random() * (max - min + 1) + min);

            points[i] = new Point(randomX,randomY);
        }

        for (Point p : points){
            System.out.println(p);
        }

        double minDistance = Double.MAX_VALUE;
        Point one = new Point();
        Point two = new Point();

        for(int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++){
                double currentDistance = points[i].euclideanDistance(points[j]);
                if(currentDistance < minDistance){
                    minDistance = currentDistance;
                    one = points[i];
                    two = points[j];
                }
            }
        }

        System.out.println("Minimal distance: " + minDistance + " Points: "+ one + " " + two);


        for(int i = 10; i >= 0; i--){
            for (int j = 0; j <= 10; j++) {
                boolean pointFound = false;
                for(Point p: points){
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
        System.out.println("----------cars---------");
        Car volvo =  new Car("Volvo","XC40", 30000);
        System.out.println(volvo);
        volvo.drive();
        volvo.playSong("Najgori");
        System.out.println("Cars created: " + Car.counter);

        Car bmw = new Car("BMW","X6",50000);
        System.out.println(bmw);
        bmw.drive();
        bmw.playSong("Skhizma - Metak");
        System.out.println("Cars created: " + Car.counter);

    }




}