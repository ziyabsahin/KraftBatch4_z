package day11_Control_Flow_Statement_If;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz :");
        int sayi= scan.nextInt();
        boolean result=(sayi%2)==0;
        if(result){
            System.out.println("çift");
        } else{
            System.out.println("tek");
        }
    }
}
