public class Main {
    public static void main(String[] args) {
        // INHERITANCE
        System.out.println("-----------Rectangle---------------");
        Rectangle rect = new Rectangle(5,10);
        rect.print();
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: "+ rect.perimeter());
        System.out.println("-----------Cuboid----------");

        Cuboid cuboid = new Cuboid(10,5,4);
        cuboid.print();
        System.out.println("Area: " + cuboid.area());
        System.out.println("Perimeter: "+ cuboid.perimeter());
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface area: " + cuboid.surfaceArea());

        System.out.println("-----------Cube----------");

        Cube cube = new Cube(10);
        cube.print();
        System.out.println("Area: " + cube.area());
        System.out.println("Perimeter: "+ cube.perimeter());
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface area: " + cube.surfaceArea());

        System.out.println("---------MessageSenders--------");
        SmsSender sms = new SmsSender("084635421");
        sms.print();
        sms.sendMessage("Hello there!");

        System.out.println();
        EmailSender email = new EmailSender("bogdan.sinik@famnit.upr.si");
        email.print();
        email.sendMessage("Hi there. When will we get our grades?");

        System.out.println("-------------Animals-------------");
        Dog dog = new Dog("Roki");
        dog.makeSound();
        dog.printName();
        dog.makeSound(5);
        System.out.println("Is alive? " + dog.isAlive);
        System.out.println();
        Cat cat = new Cat("Una");
        cat.printName();
        cat.makeSound();
        System.out.println("Is alive? " + cat.isAlive);

        System.out.println();
        Plant plant = new Plant("Rose");
        plant.photosinthesys();
        System.out.println("Is alive? " + plant.isAlive);

        System.out.println();
        Duck donald = new Duck("Donald");
        donald.printName();
        donald.makeSound();
        donald.swim();
        donald.fly();
        System.out.println("Is alive? " + donald.isAlive);

    }
}