public class Main {
    public static void main(String[] args) {
        System.out.println("----------Rectangle--------");
        Rectangle rect = new Rectangle(5, 10);
        rect.print();
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("----------Cuboid--------");
        Cuboid cuboid = new Cuboid(5, 10, 3);
        cuboid.print();
        System.out.println("Area: " + cuboid.area());
        System.out.println("Perimeter: " + cuboid.perimeter());
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface area: " + cuboid.surfaceArea());

        System.out.println("----------Cube--------");
        Cube cube = new Cube(5);
        cube.print();
        System.out.println("Area: " + cube.area());
        System.out.println("Perimeter: " + cube.perimeter());
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface area: " + cube.surfaceArea());

        System.out.println("----------MessageSenders---------");
        SmsSender sms = new SmsSender("072534825");
        sms.print();
        sms.sendMessage("Hello my friend!");

        System.out.println();
        EmailSender email = new EmailSender("bogdan.sinik@famnit.upr.si");
        email.print();
        email.sendMessage("Hi there, any grades yet?");
        System.out.println("-----------------Animals-----------------");

        Dog dog = new Dog("Lili");
        dog.makeSound();
        dog.printName();
        dog.makeSound(5);
        System.out.println("Is alive: " + dog.isAlive);

        Cat cat = new Cat("Mili");
        cat.makeSound();
        cat.printName();System.out.println("Is alive: " + cat.isAlive);

        Organism org = new Organism();
        System.out.println("Is alive: " + org.isAlive);

        Plant plant = new Plant("Rose");
        plant.photosynthesis();
        System.out.println("Is alive: " + plant.isAlive);

        Duck donald = new Duck("Donald");
        donald.fly();
        donald.printName();
        donald.swim();
        donald.makeSound();
        System.out.println("Is alive: " + donald.isAlive);


    }
}