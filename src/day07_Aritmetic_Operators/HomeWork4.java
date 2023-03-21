package day07_Aritmetic_Operators;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Dogum yılınız =");

        int dogum=scan.nextInt();
        System.out.print("hangi yıldasınız =");
        int yil=scan.nextInt();
        int yas=yil-dogum;
        System.out.print("yasınız="+yas);
    }
}
