package day_43_Inharitance_And_Acces_Keywords;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("bmw");
        Automobil automobil=new Automobil("mercedes");
        Motorbylcle motorbylcle=new Motorbylcle("bmw");
        automobil.start();
        motorbylcle.stop();
        motorbylcle.start();
        //Overriding üst sınıftaki bir metod yeterli gelmezse ya da uygun olmazsa alt sınıf
        //için alt sınıfta yeni bir metod yazılabilir
        //is a ilişkisi olan claslar içerisnde, aynı isim, acces modifier aynı veya daha görünür olmalı
        //return type aynı veya bir alt sınıfı olmalı
        //obje oluşturunca object sınıfını java otomatik olarak extends eder

    }





}
