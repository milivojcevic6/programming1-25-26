public class Duck extends Animal implements Swimmable,Flyable{

    Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Kva");
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly");
    }

    @Override
    public void swim() {
        System.out.println(name + " can swim");
    }
}
