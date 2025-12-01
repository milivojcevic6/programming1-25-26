public class Car {
    // fields - data
    private String brand;
    private String model;
    private double price;

    Car(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // methods - possible actions
    public void drive(){
        System.out.println("Driving "+ brand + " " + model);
    }

    public void playMusic(String song){
        System.out.println(song + " is playing");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return brand + " " +model + " with price "+ price;
    }
}
