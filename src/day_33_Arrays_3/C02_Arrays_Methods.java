package day_33_Arrays_3;

import java.util.Arrays;

public class C02_Arrays_Methods {
    //split() stringleri istedigimiz yerde bölüp array oluşturuyoruz
    //copyOfrange() substring metodunun array versionu
    //sort() arrayin bütün elemanları artan sekilde sıralıyor
    //fill() arrayin içeriğini dolduruyor
    public static void main(String[] args) {
        String str="merhaba java nasıl gidiyor";
        String[] str1=str.split(" ");
        String[] str2=str.split("");

        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        //toCharArray stringin karakterlerini arrayin içine karakter karakter atıyor
         char[] str3=str.toCharArray();

        System.out.println(str3);

        String[] str4=Arrays.copyOfRange(str1, 1, 3);
        String[] str5=Arrays.copyOf(str1,1);
        System.out.println(Arrays.toString(str4));
        System.out.println(Arrays.toString(str5));

      Arrays.sort(str1);
      //sort yeni array oluşturmuyor mevcut arrayin uzerine yazıyor
        System.out.println(Arrays.toString(str1));


       Arrays.fill(str1,0,3,"merhaba");
        System.out.println(Arrays.toString(str1));




    }








}
