package day_19_Methods_Return_Type;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("sayı giriniz");
        int sayi= scan.nextInt();
        System.out.println(basamak(sayi));


    }
    public static int basamak(int sayi) {

        int sayac = 0;
        while (sayi > 0) {
            sayi =sayi/10;
            sayac++;

        }
        int resault=sayac;

        return  resault ;

    }}

