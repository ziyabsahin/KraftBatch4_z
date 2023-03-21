package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C01_PositiveOrNegative {
    public static void main(String[] args){
        /*
1. Create a class called C01_PositiveAndNegative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

            Ex:
                number = 200*/
        Scanner num=new Scanner(System.in);

        System.out.print("bir sayı giriniz :");
       int sayi=num.nextInt();
       boolean isPositive=sayi>0;
       boolean isNegative=sayi<0;
       boolean isZero=sayi==0;
       System.out.println(sayi+" isPositive "+ isPositive);
       System.out.println(sayi+" isNegative "+ isNegative);
       System.out.println(sayi+" isZero "+ isZero);

    }
}
