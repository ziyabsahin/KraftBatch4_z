package day07_Aritmetic_Operators;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Saniye:");
        int s=scan.nextInt();
        int saniye=s%60;
        int dakika=s/60%60;
        int saat=s/3600;
        System.out.print(saat+":"+dakika+":"+saniye);

    }
}
