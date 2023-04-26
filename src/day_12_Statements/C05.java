package day_12_Statements;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {



    Scanner scan=new Scanner(System.in);

    System.out.print("ortalamanızı giriniz :");
    int ortalama=scan.nextInt();

    if (ortalama>=85){
        System.out.println("pekiyi");

        if(ortalama>=95){
            System.out.println("onur belgesi almaya hak kazandınız.");
        }

    } else if(ortalama>=70&&ortalama<85){
        System.out.println("iyi");
    } else if(ortalama>=55&&ortalama<70){
        System.out.println("orta");
    }  else if(ortalama>=45&&ortalama<55){
        System.out.println("geçer");
    }  else {
        System.out.println("başarısız");}


    }
}
