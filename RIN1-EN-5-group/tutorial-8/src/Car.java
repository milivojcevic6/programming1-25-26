public class Car {
    // data
    private String brand;
    private String model;
    private double price;
    static int counter = 0;
    //constructor

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        counter++;
    }

    //methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return brand + " " + model + " " + price + "$";
    }

    public void drive(){
        System.out.println("Driving " + brand);
    }

    public void playSong(String song){
        System.out.println("Song "+ song + " is playing");
    }
}
