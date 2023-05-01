package day_46_Abstraction_And_Interface;



public abstract class Car {


   private final String model,brand;
   private String color;
   private final int year;
  private double price;

    public Car(String color, int year, String brand, double price,String model) {
        setColor(color);
        this.year = year;
        this.brand=brand;
        setPrice(price);
        this.model=model;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid Price "+price);
        }
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    private void setColor(String color) {

    }
    public void stop(){
        System.out.println("Press the brake");
    }
    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
