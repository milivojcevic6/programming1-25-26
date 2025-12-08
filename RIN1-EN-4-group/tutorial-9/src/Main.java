public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,10);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        rect.print();
        System.out.println("----------------Cuboid------------------");
        Cuboid cuboid = new Cuboid(5,7,3);
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface area: " + cuboid.surfaceArea());
        System.out.println("Area: " + cuboid.area());
        System.out.println("Perimeter: " + cuboid.perimeter());
        cuboid.print();
        System.out.println("----------------Cube-------------------");
        Cube cube = new Cube(5);
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface area: " + cube.surfaceArea());
        System.out.println("Area: " + cube.area());
        System.out.println("Perimeter: " + cube.perimeter());
        cube.print();
        System.out.println("------------------------Message Senders----------------");
        SmsSender sms = new SmsSender("0873652");
        sms.sendMessage("Hi there!");
        System.out.println();

        EmailSender email = new EmailSender("bogdan.sinik@famnit.upr.si");
        email.sendMessage("Hi there!");

        System.out.println("----------------Animals--------------");
        Dog dog = new Dog("Rex");
        dog.makeSound(3);
        dog.printName();
        dog.makeSound();
        System.out.println("Is alive?: " + dog.isAlive);

        Cat cat = new Cat("Molly");
        cat.makeSound();
        cat.printName();
        System.out.println("Is alive?: " + cat.isAlive);

        Duck donald = new Duck("Donald");
        donald.fly();
        donald.swim();
        donald.makeSound();
        donald.printName();
        System.out.println("Is alive?: " + donald.isAlive);


    }
}