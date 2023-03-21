package day_16_Branching_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_Example {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        boolean flag=true;
      while(flag){
            System.out.println("işlem yapmak istediğiniz 1.sayı :");
            int a= scan.nextInt();
            System.out.println("işlem yapmak istediğiniz 2.sayı");
            int b= scan.nextInt();
            System.out.println("işlemi giriniz");
            String c= scan.next();
            int resault;

            switch(c){
                case "+":
                    resault=a+b;
                    System.out.println(resault);
                    break;
                case "-":
                    resault=a-b;
                    System.out.println(resault);
                    break;
                case "*":
                    resault=a*b;
                    System.out.println(resault);
                    break;
                case "/":
                    resault=a/b;
                    System.out.println(resault);
                    break;
                default:
                    System.out.println("hatalı giriş");


            }


            System.out.println("devam etmek için 1 çıkmak için 0 giriniz ");
            int d= scan.nextByte();
            if (d==1){
                continue;
            } else if (d==0){
                break;
            } else{
                System.out.println("hatalı giriş");
            }



        }



















    }
}
