package day_46_Abstraction_And_Interface;

public class Togg extends Car{
    public Togg(String color, int year, double price, String model) {
        super(color, year, "TOGG", price, model);
    }

    @Override
    public void start() {
        System.out.println("say \"start\"");
    }
    public void zoom(){
        System.out.println("zoom start");
    }
}
