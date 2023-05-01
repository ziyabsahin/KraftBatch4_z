package day_43_Inharitance_And_Acces_Keywords;

public class Automobil extends Vehicle {
    String radioBrand;
    int hb;
    public Automobil(String model){
        super(model);
    }

    @Override
    public void start() {
        super.start();
    }
}
