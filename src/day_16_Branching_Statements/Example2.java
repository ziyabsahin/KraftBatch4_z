package day_16_Branching_Statements;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("a :");
            int a= scan.nextInt();
            System.out.println("b :");
            int b= scan.nextInt();
            System.out.println("toplam :");
            int resault=a+b;
            if(resault>=25){
                break;

            }



        }





    }
}
