package day13_For_Loops;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz :");
        int sayi= scan.nextInt();
        int toplamTek=0;
        int toplamÇift=0;
        for(int i=1;i<=sayi;i++){
            if(i%2==1){
                toplamTek=toplamTek+i;
            } else {
                toplamÇift+=i;

            }

        }
        System.out.println("çift sayıların tolamı :"+toplamÇift);
        System.out.println("tek sayıların tolamı :"+toplamTek);

    }
}
