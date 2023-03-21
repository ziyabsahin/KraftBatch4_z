package day13_For_Loops;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1 de 1000 e kadar bir sayı giriniz :");
        int sayi= scan.nextInt();
        int toplam=0;
        for(int i=1;i<=sayi;i++){

            toplam+=i;

        }
        System.out.println(toplam);
    }
}
