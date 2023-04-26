package day_08_ScannerAndOperatiors;

import java.util.Scanner;

public class Java06_Scanner2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz =");
        int sayi=scan.nextInt();
        System.out.println((int)Math.pow(sayi,2));


    }
}
