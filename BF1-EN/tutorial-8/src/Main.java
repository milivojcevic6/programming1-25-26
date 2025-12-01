public class Main {
    public static void main(String[] args) {
        // OOP - Object Oriented Programming

        //Point.staticDrawPoint("black",2,3);

        //Point.drawPoint();
        Point p1 = new Point(3,2,"white"); // constructor
        p1.setX(23);
        System.out.println("X:" + p1.getX());
        System.out.println("Y:" + p1.getY());
        //p1.color = "green";
        System.out.println("Color: "+ p1.color);
        p1.drawPoint();

        Point p2 = new Point(5,4); // constructor
        System.out.println("X:" + p2.getX());
        System.out.println("Y:" + p2.getY());
        //p2.color = "green";
        System.out.println("Color: "+ p2.color);
        p2.drawPoint();

        // print object
        System.out.println(p1); // toString()
        //int [] a = new int[2];
        //System.out.println(a);

        // distance
        System.out.println("Distance from p1 to p2: "+ p1.euclideanDistance(p2));
        System.out.println("Distance from p1 to origin: " + p1.distanceFromOrigin());

        // area of square
        System.out.println("Area of square defined by p1 and p2: " + p1.areaOfSquare(p2));

        // create array of 10 random points x and y 0-10 and find 2 closest points
        Point [] points = new Point[10];

        for (int i = 0; i < points.length; i++) {
            int min = 0;
            int max = 10;
            int randomX = (int)(Math.random() * (max - min + 1) + min);
            int randomY = (int)(Math.random() * (max - min + 1) + min);
            points[i] = new Point(randomX,randomY);
        }

        for (Point p : points){
            System.out.println(p);
        }

        double minDistance = Double.MAX_VALUE;
        Point first = new Point();
        Point second = new Point();

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++){
                double currentDistance = points[i].euclideanDistance(points[j]);
                if(currentDistance < minDistance){
                    minDistance = currentDistance;
                    first = points[i];
                    second = points[j];
                }
            }

        }

        System.out.println("Minimal distance: " + minDistance);
        System.out.println("Points: " + first + " and " + second);

        // print grid
        for(int i = 10; i >= 0; i--){
            for (int j = 0; j <= 10; j++) {
                boolean pointFound = false;
                for (Point p: points){
                    if(p.getX() == j && p.getY() == i){
                        pointFound = true;
                        break;
                    }
                }
                if(pointFound){
                    System.out.print(" o ");
                }else System.out.print(" . ");
            }
            System.out.println();
        }
    }


}