package day_09_Operators;
import java.util.Scanner;
public class Day02_Beden_Kitle_indeksi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi : Kilo / (Boy(m) * Boy(m))

        */
        Scanner xbod=new Scanner(System.in);
        System.out.print("lütfen kilonuzu giriniz=");
        int kilo=xbod.nextInt();
        System.out.print("Lütfen boyunuzu metre giriniz =");
        double boy=xbod.nextDouble();
        double vke=kilo/Math.pow(boy,2);
        System.out.println("vücut kitle endeksi ="+vke);




    }
}
