public class Main {
    public static void main(String[] args) {
        //OOP
        Point p1 = new Point(7,8,"white");
        Point p2 = new Point(9,2,"green");
        Point p3 = new Point();
        p1.color = "blue";
        p1.setX(23);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.printColor();
        System.out.println(p2.getX());
        //System.out.println(p2.y);
        p2.printColor();
        System.out.println(p3.getX());
        //System.out.println(p3.y);
        p3.printColor();

        // print an object
        System.out.println(p1);
        int [] a = new int [2];
        //System.out.println(a);
        System.out.println(p2);
        System.out.println(p3);

        //Point.printColor();

        // distance
        System.out.println("Distance from p1 to p2: " + p1.euclideanDistance(p2));
        System.out.println("Distance form p1 to origin: " + p1.distanceFromOrigin());

        // area of square defined by 2 poitns
        System.out.println("Area of square defined by p1 and p2: " + p1.squareArea(p2));
        System.out.println("Perimeter of square defined by p1 and p2: " + p1.squarePerimeter(p2));

        System.out.println("---------------------------CARS------------------------");
        Car car1 = new Car(10000, 3074.32, 1231.21, "black");
        Car car2 = new Car(123124, 12312, 3423, "blue");
        System.out.println(car1);
        System.out.println(car2);

        // I HAVE FORGOT TO DO AN EXERCISE WITH YOUR GROUP
        // IT WAS TO CREATE ARRAY OF 10 RANDOM POINTS AND FIND 2 POINTS THAT ARE THE CLOSEST
        // FIND POINTS ITSELF AND THE DISTANCE BETWEEN THEM
        // AFTER THAT YOU CAN DRAW A COORDINATE SYSTEM AND ADD POINTS
        // CHECK CODE FROM OTHER GROUOPS OR TRY IT YOURSELF AND LET ME KNOW NEXT TUTORIAL



    }
}