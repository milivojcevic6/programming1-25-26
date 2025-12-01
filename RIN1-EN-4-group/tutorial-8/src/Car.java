public class Car {
    // fields
    private String color;
    private double width;
    private double length;
    private double price;

    public Car(double price, double length, double width, String color) {
        this.price = price;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Car with width: " + width + " length: " + length + " and price "+ price;
    }

    public void drive(){
        System.out.println("Driving my car of price "+ price);
    }
}
