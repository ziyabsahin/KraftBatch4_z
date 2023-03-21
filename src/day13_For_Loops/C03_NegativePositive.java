package day13_For_Loops;

import java.util.Scanner;

public class C03_NegativePositive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz :");
        int n= scan.nextInt();
        if(n>0){
            System.out.println("pozitif");
        } else if(n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        System.out.println("------------------------------");
        String resault=n>0?"sayı pozitif":n<0?"sayı negative":"zero";
        System.out.println(resault);
    }
}
