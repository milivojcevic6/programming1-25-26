public class Main {
    public static void main(String[] args) {
        System.out.println("-----------RECTANGLE-------------");
        Rectangle rect = new Rectangle(5,10);
        rect.print();
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("-----------CUBOID-----------");
        Cuboid cuboid = new Cuboid(5, 10, 3);
        cuboid.print();
        System.out.println("Surface area: " + cuboid.surfaceArea());
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Area: " + cuboid.area());
        System.out.println("Perimeter: " + cuboid.perimeter());
        System.out.println("-------------CUBE----------------");
        Cube cube = new Cube(5);
        cube.print();
        System.out.println("Surface area: " + cube.surfaceArea());
        System.out.println("Volume: " + cube.volume());
        System.out.println("Area: " + cube.area());
        System.out.println("Perimeter: " + cube.perimeter());
        System.out.println("------------------Message sender--------------");
        SmsSender sms = new SmsSender("01873282");
        sms.sendMessage("Hi there!");
        EmailSender email = new EmailSender("bogdan.sinik@famnit.upr.si");
        email.sendMessage("Hi!");

        System.out.println("---------------------Animals----------------------");

        Dog dog = new Dog("Max");
        dog.makeSound();
        dog.printName();
        dog.makeSound(4);

        System.out.println();
        Cat cat = new Cat("Cici");
        cat.printName();
        cat.makeSound();

        System.out.println();
        Duck donald = new Duck("Donald");
        donald.printName();
        donald.makeSound();
        donald.swim();
        donald.fly();
        System.out.println("Is alive?" + donald.isAlive);

        Duck daisy = new Duck("Daisy");
        daisy.printName();
        daisy.makeSound();
    }

}