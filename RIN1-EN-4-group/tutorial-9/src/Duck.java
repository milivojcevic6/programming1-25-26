public class Duck extends Animal implements Flyable,Swimmable{
    String name;

    Duck(String name){
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Kva kva");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
