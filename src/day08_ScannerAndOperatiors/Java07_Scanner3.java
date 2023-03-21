package day08_ScannerAndOperatiors;

import java.util.Scanner;

public class Java07_Scanner3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi Giriniz =");
        String isim=scan.nextLine();
        System.out.println("soyisminizi Giriniz =");
        String soyisim=scan.nextLine();
        System.out.println("Yasınızı giriniz =");
        int yas=scan.nextInt();
        scan.nextLine(); //nextLine() nı eger nextInt,long,sort,byete,double vs den sonra kullanacaksak
        //boş bir scan.nextLine() tanımlamamız lazım.
        System.out.println("Dogum yerinizi giriniz=");
        String dogumYeri=scan.nextLine();


        System.out.println("isim :"+isim+"\n"+"soyisim :"+soyisim+"\n"+"yas"+yas+"\n"+"dogum yeri :"+dogumYeri);

        System.out.print("Kaydınız basarıyla gerceklestirilmiştir.");





    }
}
