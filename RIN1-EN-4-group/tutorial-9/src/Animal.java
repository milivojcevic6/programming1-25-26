abstract public class Animal extends Organism {
    String name;

    Animal(String name){
        this.name = name;
    }

    void printName(){
        System.out.println("My name is " + name);
    }

    abstract void makeSound(); // abstract methods need to be implemented in child class
    // they only have signature


}
