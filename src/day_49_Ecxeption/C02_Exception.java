package day_49_Ecxeption;

import java.util.Scanner;

public class C02_Exception {
    private static int count=0;
    public static void main(String[] args) {
        System.out.println(count);
        System.out.println(sayiGir());
        System.out.println(count);

        try {
            System.out.println(1);
            System.out.println(5/0);
        } catch (Exception e){
            System.out.println(2);

        }

    }

 public static int faktoriyel(int sayi){
     int num=1;


     try{
         for (int i = 1; i <=sayi ; i++) {
             num*=i;

         }
        return num;
     } catch (Exception e){
         return -1;

     }
 }
public static int sayiGir(){

        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("sayi=");
            int x= scan.nextInt();
            return x;
        } catch (Exception e){
            count++;
            if (count==3){
                System.exit(0);
            }
            return sayiGir();
        }
}
}
