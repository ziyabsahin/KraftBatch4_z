package day_13_For_Loops;

import java.util.Scanner;

public class C12_Factoriyel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= scan.nextInt();
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++){
            faktoriyel=faktoriyel*i;


        }
        System.out.println(faktoriyel);
    }
}
