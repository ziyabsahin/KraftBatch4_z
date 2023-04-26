package day_39_Constructors_Overloading;

public class C04_CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(1.9,2);
        System.out.println(carpet1);
        Carpet carpet2=new Carpet(1.9,2,120,true);
        System.out.println(carpet2);
        System.out.println("carpet2.calcPrice() = " + carpet2.calcPrice());

    }
}
