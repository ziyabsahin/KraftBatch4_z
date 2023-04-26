package day_10_UnaryLogicalOperAndReview;


import java.util.Scanner;

public class C03_SwapVeribles {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen sayi giriniz a =");
        int a= scan.nextInt();
        System.out.println("lütfen sayi giriniz b =");
        int b= scan.nextInt();

        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);








     /*   1. write a program that can swipe two variables' value by using a temporary variable

        Ex:
        if a= 10, b=15

        output:
        a = 15
        b = 10*/


       /* int a=10;
        int b=15;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp=a;
        a=b;
        b=a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b=temp;
        System.out.println("b = " + b);*/


    }
}
