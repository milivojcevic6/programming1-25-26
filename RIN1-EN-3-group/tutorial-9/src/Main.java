public class Main {
    public static void main(String[] args) {
        // INHERITANCE
        System.out.println("-----------Rectangle---------");
        Rectangle rect = new Rectangle(10,5);
        rect.print();
        System.out.println("Area: " +  rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        System.out.println("--------------Cuboid---------------");
        Cuboid cuboid = new Cuboid(5,10,7);
        cuboid.print();
        System.out.println("Area: " +  cuboid.area());
        System.out.println("Perimeter: " + cuboid.perimeter());
        System.out.println("Volume: " +  cuboid.volume());
        System.out.println("Surface area: " + cuboid.surfaceArea());

        System.out.println("------------------Cube--------------------");
        Cube cube = new Cube(5);
        cube.print();
        System.out.println("Area: " +  cube.area());
        System.out.println("Perimeter: " + cube.perimeter());
        System.out.println("Volume: " +  cube.volume());
        System.out.println("Surface area: " + cube.surfaceArea());

        System.out.println("------------------MessageSenders-----------");
        SmsSender sms = new SmsSender("08627634");
        sms.print();
        sms.sendMessage("Hi my friend!");

        System.out.println();
        EmailSender email = new EmailSender("bogdan.sinik@famnit.upr.si");
        email.print();
        email.sendMessage("What up professor, I need my grade!");

        System.out.println("-----------------Animals----------------");
        Dog dog = new Dog("Rex");
        dog.makeSound();
        dog.printName();
        dog.makeSound(4);

        System.out.println();
        Cat cat = new Cat("Lilly");
        cat.makeSound();
        cat.printName();

        System.out.println();
        Duck duck = new Duck("Donald");
        duck.printName();
        duck.swim();
        duck.fly();
        duck.makeSound();
        System.out.println("Is alive: " + duck.isAlive);

        System.out.println();
        Plant plant = new Plant();
        plant.photosyntesize();
        System.out.println("Is alive: " + plant.isAlive);

        System.out.println();
        Organism org = new Organism();
        System.out.println("Is alive: " + org.isAlive);



    }
}