package day_46_Abstraction_And_Interface;

public final class Audi extends Car{

    public Audi(String color, int year,  double price, String model) {
        super(color, year, "Audi", price, model);
    }



    @Override
    public void start() {
        System.out.println("push Star-Stop key");
    }
    public void quatro(){
        System.out.println("quatro feature is active");
    }
}
