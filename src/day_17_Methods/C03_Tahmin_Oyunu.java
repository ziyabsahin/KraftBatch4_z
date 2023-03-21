package day_17_Methods;

import java.util.*;

public class C03_Tahmin_Oyunu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Random random=new Random();
        int sayi= random.nextInt(50);

        for (int i = 1; i <=5; i++) {
            System.out.print(i+" tahmin :");
            int tahmin= scan.nextInt();
            if(tahmin>sayi){
                System.out.println("aşagı");
            } else if(tahmin<sayi){
                System.out.println("yukarı");
            }else {
                System.out.println("bildiniz");
                break;
            }


        }
        System.out.println(sayi);


    }
}
