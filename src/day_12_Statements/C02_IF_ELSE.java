package day_12_Statements;

import java.util.Scanner;

public class C02_IF_ELSE {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //eq

        System.out.println("lütfen sayı girin");
        System.out.println("num1");
        int num1=scan.nextInt();
        System.out.println("num2");
        int num2=scan.nextInt();
        scan.nextLine();

        System.out.println("işlemi seçin");
        String islem=scan.next();
         if (islem.equals("+")){
             System.out.println(num1+num2);
         } else if(islem.equals("-")){
             System.out.println(num1-num2);

         } else if(islem.equals("*")){
             System.out.println(num1*num2);
         }else if(islem.equals("/")){
             System.out.println(num1/num2);
         }else {
             System.out.println("işlem seçimini hatalı girdiniz");
         }











    }
}
