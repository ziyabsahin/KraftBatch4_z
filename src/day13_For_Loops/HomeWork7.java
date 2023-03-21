package day13_For_Loops;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int sayi= scan.nextInt();
        System.out.println("sayının kaçıncı kuvveti :");
        int kuvvet= scan.nextInt();
        for(int i=1;i<=kuvvet;i++){
            int sonuc=sayi*i;
            System.out.println(sonuc);
        }

    }

}
