public class Car {
    // data
    // fields
    private String brand;
    private String model;
    private double price;
    public static int counter = 0;

    // constructor


    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        counter++;
    }

    // methods
    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }

    public void playSong(String song){
        System.out.println("Playing " + song);
    }

    public String toString(){
        return brand + " " + model + " " + price + "$";
    }

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
}
