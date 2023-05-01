package day_44_Final;

import java.util.ArrayList;

public class C01_Final_Keyword {
    //bir acces modifiels degil
    //metod, veriable, classlar uygulanabilir
    //alt sınıfları olmuyor
    //final veriable hiç bir yerde değiştirilmez, değiştirelemeyen final yapılmış isimler büyük yazılır
    //ilk degeri bir yerde vermemiz lazım
    //instance ya da local veriable de final tanımlanabilir
    //final array[] ve arrayList<>  de final yapılan arrayin referansı oluyor, içerik değişebiliyor
    //final metod override edilemez
    //final class lar baska sınıfa eklenemez ama baska sınıflar kendilerine eklenir
    //intance bloklar, her obje oluştugunda çalışır
    //static bloklar ise sadece ilk obje oluşurken çalışır
    //constructeri private yaparsak obje oluşumunu engelleriz
    protected static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("harun");
        arr.add("ziya");
        arr.add("eren");
        System.out.println(arr.get(1));
        arr.remove(1);
        System.out.println(arr.get(1));
    }
}
