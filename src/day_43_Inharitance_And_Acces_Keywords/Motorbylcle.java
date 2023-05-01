package day_43_Inharitance_And_Acces_Keywords;

public class Motorbylcle extends Vehicle {
    int cc;
    public Motorbylcle(String model){
        super(model);
    }


    public void chanceCcHp(int cc)  {
       this.cc=cc;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public void start() {
        System.out.println("motor çalıştı");
    }
}
