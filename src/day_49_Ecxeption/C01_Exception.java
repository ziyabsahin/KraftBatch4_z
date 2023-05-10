package day_49_Ecxeption;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz =");
        try {int x= scan.nextInt();
            System.out.println(x*10);
        }catch (Exception e){
            System.out.println("hata "+e.getMessage());

        }


        System.out.println("kod devam ediyor");
        System.out.println("kod devam ediyor");
        System.out.println(bolme(5, 0));
        System.out.println(kelimeGir());

    }
    //kodun hata vercek kısmı varsa Exeption kullanıyoruz, sadece o konuda, try içerisine bu kısmı alıyoruz
    //eger o kısımda hata varsa catch kısmına geciyor
    //ve koda devam ediyor
    //hata ele alınıyor, hata handle ediliyor
    //run time error olması durumunda exception işe yarar

    public static int bolme(int sayi, int bolen){
        try {
            return sayi/bolen;
        } catch (Exception e){
            return -1;
        }

    }
    public static String kelimeGir(){
        System.out.println("kelime :");
        String str="";
        Scanner scan=new Scanner(System.in);

        try {
            str= scan.nextLine();
            return str;
        } catch (Exception e){
            return kelimeGir();
        }

    }


}
