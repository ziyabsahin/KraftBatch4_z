package day_39_Constructors_Overloading;

public class C05_KraftBank {
    public static void main(String[] args) {
        KraftBank musteri1=new KraftBank("ziya büyükşahin",12345,true);
        musteri1.addMoney(12000);
        System.out.println(musteri1);
    }
}
