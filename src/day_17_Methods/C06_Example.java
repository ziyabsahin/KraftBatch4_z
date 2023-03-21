package day_17_Methods;

import java.util.Scanner;

public class C06_Example {
    public static void main(String[] args) {
        ceviri();

    }
    public static void ceviri(){
        Scanner scan=new Scanner(System.in);
        System.out.print("kg :");
        double kg= scan.nextDouble();
       double o=kg/1.28;


        System.out.println(kg+" kg "+o+" okkadır");




    }

}
