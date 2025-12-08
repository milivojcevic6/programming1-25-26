public abstract class Animal extends Organism{
    String name;

    Animal(String name){
        this.name = name;
    }

    void printName(){
        System.out.println("My name is " + name);
    }

    // abstract method
    abstract void makeSound();
}
