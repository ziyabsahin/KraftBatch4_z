package day_14_NestedWhileDoWhile;

import java.util.Scanner;

public class C09_Add_Numbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int n=scan.nextInt();
        int sum=n;
        while(n!=0){
            System.out.println("sayı giriniz :");
            n= scan.nextInt();
            sum+=n;
        }
        System.out.println("sum ="+sum);
    }
}
