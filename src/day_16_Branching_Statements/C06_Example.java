package day_16_Branching_Statements;

import java.util.Scanner;

public class C06_Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        String sifre="ziya";
        int i=0;
        while (i < 5) {
            System.out.println(i+1+".tahmin "+"lütfen şifre giriniz");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            System.out.println("yanlış şifre");
            i++;

        }





    }
}
