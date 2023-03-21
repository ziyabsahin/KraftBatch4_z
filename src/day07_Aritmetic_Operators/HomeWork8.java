package day07_Aritmetic_Operators;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("koltuk sayısı :");
        double ks=scan.nextDouble();
        System.out.print("sıra sayısı:");
        double ss=scan.nextDouble();
        System.out.print("konuk sayısı:");
        double kons=scan.nextDouble();
        double toplamKoltuk=(ks*ss);
       double bosKoltuk=(toplamKoltuk-kons);
        double doluSira=(ss-(kons/ss)+1);
        double bosSira=(ss-doluSira);
        System.out.println("bosSira = " + bosSira);
        System.out.println("doluSira = " + doluSira);
        System.out.println("toplamKoltuk = " + toplamKoltuk);
        System.out.println("bosKoltuk = " + bosKoltuk);


    }
}
