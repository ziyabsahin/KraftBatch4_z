package day_46_Abstraction_And_Interface;

public final class Honda extends Car{


    public Honda(String color, int year, double price, String model) {
        super(color, year,"honda", price, model);
    }

    @Override
    public void start() {
        System.out.println("arabayı çalıştırın");
    }
}
