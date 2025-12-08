public class Main {
    public static void main(String[] args) {
        //INHERITANCE
        System.out.println("------------Rectangle----------");
        Rectangle rect = new Rectangle(5,10);
        rect.print();
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("--------------Cuboid-------------");
        Cuboid cuboid = new Cuboid(4,8,3);
        cuboid.print();
        System.out.println("Area: " + cuboid.area());
        System.out.println("Perimeter: " + cuboid.perimeter());
        System.out.println("Surface area: " + cuboid.surfaceArea());
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("---------------Cube--------------");
        Cube cube =  new Cube(5);
        cube.print();
        System.out.println("Area: " + cube.area());
        System.out.println("Perimeter: " + cube.perimeter());
        System.out.println("Surface area: " + cube.surfaceArea());
        System.out.println("Volume: " + cube.volume());
        System.out.println("-------------Message senders-------------");
        SmsSender sms = new SmsSender("0123871");
        sms.print();
        sms.sendMessage("Hey there!");

        System.out.println();
        EmailSender email = new EmailSender("bogdan.sinik@famnit.upr.si");
        email.print();
        email.sendMessage("YO professor, any grades. Best");

        System.out.println("-----------Animals--------------");
        Dog dog = new Dog("Rex");
        dog.makeSound();
        dog.printName();
        dog.makeSound(3);
        System.out.println("Is alive: " + dog.isAlive);

        System.out.println();
        Cat cat = new Cat("Milly");
        cat.printName();
        cat.makeSound();

        System.out.println("Organism");
        Organism org = new Organism();
        System.out.println("Is alive: " + org.isAlive);

        System.out.println();
        Plant plant = new Plant();
        plant.photosynthesis();
        System.out.println("Is alive: " + plant.isAlive);

        System.out.println();
        Duck duck = new Duck("Donald");
        duck.fly();
        duck.makeSound();
        duck.swim();
        duck.printName();
        System.out.println("Is alive: " + duck.isAlive);

    }
}