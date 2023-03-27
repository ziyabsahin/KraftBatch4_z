package day_20_Custum_Methods_Overloading;

import java.util.Scanner;

public class HW06 {

    public static void main(String[] args) {
        System.out.println(sayıCagırma());

    }


    public static int sayıCagırma( ) {
        Scanner scan = new Scanner(System.in);
        int toplam;
        System.out.println("1.sayı =");
        int sayi1 = scan.nextInt();
        System.out.println("2.yayı =");
        int sayi2 = scan.nextInt();
        if (sayi1 != sayi2 * 3) {
            sayi2 = ucKatı(sayi1);



        }
        toplam = toplam(sayi1, sayi2);
        return toplam;



    }
    public static int ucKatı(int sayi1){

        int sayi3;
        sayi3=sayi1*3;
        return sayi3;

    }
    public static int toplam(int a, int b){
        return a+b;

    }

}
