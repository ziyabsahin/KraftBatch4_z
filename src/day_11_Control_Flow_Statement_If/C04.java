package day_11_Control_Flow_Statement_If;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ders notlarını giriniz.");
        System.out.print("fizik :");
        double fizik=scan.nextDouble();
        System.out.print("kimya :");
        double kimya= scan.nextDouble();
        System.out.print("gecme notu :");
        double gecmeN= scan.nextDouble();

        double ortalama=(fizik+kimya)/2;
        if(ortalama>gecmeN){
            System.out.println("sınıfı gectiniz tebrikler");
        }

    }
}
