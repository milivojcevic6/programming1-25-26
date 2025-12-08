public class Plant extends Organism{
    private String name;

    Plant(String name){
        this.name = name;
    }

    void photosinthesys(){
        System.out.println(name + " absorbs light");
    }
}
