package day_10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C2_Tam_Bölüneblirlik {
    public static void main(String[] args){
        /*
* 2. Create a class called C01_EvenlyDivisible,and write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5

            Ex:
                number = 65;*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz ;");
        int sayi=scan.nextInt();
        boolean isDivisibleTwo=sayi%2==0;
        boolean isDivisibleThere=sayi%3==0;
        boolean isDivisibleFour=sayi%4==0;
        System.out.println("sayının 2ye bölünüp bölünmediği="+isDivisibleTwo);
        System.out.println("sayının 3ye bölünüp bölünmediği="+isDivisibleThere);
        System.out.println("sayının 4ye bölünüp bölünmediği="+isDivisibleFour);


    }
}
