public class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }


    void makeSound(int numOfTimes){
        for (int i = 0; i < numOfTimes; i++) {
            System.out.println("Woof!");
        }
    }


}
