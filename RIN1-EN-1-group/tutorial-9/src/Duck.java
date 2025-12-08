public class Duck extends Animal implements Flyable,Swimmable{
    Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Kva!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying! yay");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");

    }
}
