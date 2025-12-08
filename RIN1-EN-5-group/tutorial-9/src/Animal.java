public abstract class Animal extends Organism {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void printName(){
        System.out.println("My name is "+ name);
    }

    abstract void makeSound(); // abstract method just signature
}
