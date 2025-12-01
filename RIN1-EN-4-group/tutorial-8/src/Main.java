public class Main {
    public static void main(String[] args) {
        // OBJECTS IN JAVA
        // OOP - Object Oriented Programming

        Point p1; // declaration
        p1 = new Point(); //initialization //constructor new Point()
        Point p2 = new Point(10,7);
        Point p3 = new Point(4);

        System.out.println(p1.getX());
        System.out.println(p1.getY());
//        p2.setX(12);
//        p2.setY(0);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println(p3.getX());
        System.out.println(p3.getY());

        //non-static method calling
        p1.drawPoint();

        // static
        Point.hi();
        //Point.drawPoint();

        // print object toString()
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // calc dist from another point
        System.out.println("Distance between point 1 and point 2: "+ p1.euclideanDistance(p2));
        System.out.println("Distance form point 3 to origin: " + p3.distanceFromOrigin());
        System.out.println("Distance form point 2 to point 3: " + p3.euclideanDistance(p2));

        // calculate area of the square defined by point2 and point3
        System.out.println("Area = " + p2.areaOfSquare(p3));

        // we want to create 5 random points xa and y 0 to 10 and find 2 that are the closest
        Point [] points = new Point[5];

        for (int i = 0; i < points.length; i++){
            int min = 0;
            int max = 10;

            int randomX = (int) (Math.random() * (max - min + 1) + min);
            int randomY = (int) (Math.random() * (max - min + 1) + min);

            points[i] = new Point(randomX,randomY);
        }

        for (Point p: points){
            System.out.println(p);
        }

        double minDistance = Double.MAX_VALUE;
        Point first = new Point();
        Point second = new Point();

        for (int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++) {
                double currentDistance = points[i].euclideanDistance(points[j]);
                if(currentDistance < minDistance){
                    minDistance = currentDistance;
                    first = points[i];
                    second = points[j];
                }
            }
        }

        System.out.println("Closest points: " + first + " " + second + " with distance "+ minDistance);



        // print a grid with points

        for (int i = 10; i >= 0; i--){ //  y axis (rows)
            for (int j = 0; j <= 10; j++){ // x axis (cols)
                boolean pointFound = false;
                for (int k = 0; k < points.length; k++){
                    if(points[k].getX() == j && points[k].getY() == i){
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
        System.out.println();
        System.out.println("--------Car objects--------");

        Car bmw = new Car("BMW", "M5", 60000);
        bmw.drive();
        bmw.playSong("Wake me up");
        System.out.println(bmw);
        System.out.println("AFTER DISCOUNT");
        bmw.setPrice(45000);
        System.out.println(bmw);
        System.out.println(Car.counter);
        Car volvo = new Car("Volvo", "XC90", 90000);
        System.out.println(volvo);
        System.out.println(Car.counter);


    }
}