public class Plant extends Organism {
    String name;

    Plant(String name) {
        this.name = name;
    }

    void photosynthesis(){
        System.out.println(name + " is absorbing light!");
    }
}