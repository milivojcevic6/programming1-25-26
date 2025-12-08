public class Duck extends Animal implements Swimmable,Flyable{

    Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
