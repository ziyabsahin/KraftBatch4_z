package day_19_Methods_Return_Type;

import java.util.Scanner;

public class C06_Method_Kullanma {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("10dan küçük iki sayı giriniz :");
        int i1= scan.nextInt();
        int i2= scan.nextInt();
        int sonuc=C05_Factoriyel.faktoriyelHesaplama(i1)+C05_Factoriyel.faktoriyelHesaplama(i2);
        System.out.println(sonuc);
    }
}
