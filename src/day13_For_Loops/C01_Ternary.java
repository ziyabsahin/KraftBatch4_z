package day13_For_Loops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı girin :");
        int num= scan.nextInt();

        if((num%2)==0){
            System.out.println("sayı çift");
        } else{
            System.out.println("sayı tek");
        }
        System.out.println("-------------------------------------------------");

        System.out.println(num%2==0?"çift":"tek");
        System.out.println("----------------------------------------");
        String str=num%2==0?"çift":"tek";

    }
}
