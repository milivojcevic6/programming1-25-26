public class Duck extends Animal implements Flyable, Swimmable{
    public Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying! YAAY");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming! YAAY");

    }
}
