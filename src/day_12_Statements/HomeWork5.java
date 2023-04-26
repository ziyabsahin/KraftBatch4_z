package day_12_Statements;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("sayı1 :");
        int num1= scan.nextInt();
        System.out.print("sayı2 :");
        int num2= scan.nextInt();
        System.out.print("işlem :");
        String islem= scan.next();
        System.out.print("sonuc :");

        switch (islem){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case"*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("hatalı işlem yaptınız");

        }

    }
}
