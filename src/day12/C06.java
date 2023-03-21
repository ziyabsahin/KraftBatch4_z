package day12;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen sayı girin");
        System.out.println("num1");
        int num1=scan.nextInt();
        System.out.println("num2");
        int num2=scan.nextInt();
        scan.nextLine();
        System.out.println("lütfen islemi seçiniz");
        String islem= scan.next();


        switch (islem){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("hatalı giriş");








        }


    }
}
