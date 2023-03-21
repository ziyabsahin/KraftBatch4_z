package day12;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        int num= scan.nextInt();

        if (num<5){
            System.out.println("sayı 5 den küçük");
        } else if((num>=5)&&(num<25)){
            System.out.println("sayı 5ten büyük 25ten küçük");
        } else if((num>=25)&&(num<50)){
            System.out.println("sayı 25ten ve 5ten büyük ve 50 den küçük");
        } else{
            System.out.println("sayınız 50 den büyük");
        }


    }
}
