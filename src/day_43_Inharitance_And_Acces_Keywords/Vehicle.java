package day_43_Inharitance_And_Acces_Keywords;

public class Vehicle {
    String model;
    int speed;
    String color;

    public Vehicle(String model){
        this.model=model;
    }

    public void start(){
        System.out.println("Araç çalıştı");
    }
    public void stop(){
        System.out.println("Araç durdu");
    }
}
