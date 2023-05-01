package day_46_Abstraction_And_Interface;

public class MyGarage {
    public static void main(String[] args) {
    Honda honda=new Honda("kırmızı",2022,220000,"accord");
    Audi audi=new Audi("beyaz",2023,120000,"RS6");
    Togg togg=new Togg("black",2028,15000,"togg");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(togg);


        System.out.println("---------------------------");

        togg.setPrice(560000);
        audi.setPrice(1200000);
        honda.setPrice(1200000);



    }
}
