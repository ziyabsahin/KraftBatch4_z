package day_24_String_Class;
import java.util.Scanner;
public class C01_String_Review {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim :");
        String isim= scan.nextLine();

        int uzunluk=isim.length();
      //  System.out.println(isim.charAt(isim.length() - 1));
        char sonHarf=isim.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);

        System.out.println("isim.equals(\"yahya efe\") = " + isim.equals("yahya efe"));
        System.out.println("isim.equalsIgnoreCase(\"Yahya Efe\") = " + isim.equalsIgnoreCase("Yahya Efe"));
        //equalsIgnoreCase büyük küçük harfe bakmadan karşılaştırıyor sadece


        //toUpperCase büyük harf
        //toLowerCase küçük harf
        //trim başındaki ve sonundaki boşlukları alır
        //indexOf bir karakterin hangi indekse oldugunu int olarak belirtiyor
        //Strinler immutable dır
        //lastIndexOf aradıgımızın son indeksini belirtir
        //indexOf bir indeksin olup olmadıgını karsılastırıyorum
        //contains bir stringin başka bir stringin içinde olup olmadıgını kontrol eder

        System.out.println("isim.lastIndexOf(\"y\") = " + isim.lastIndexOf("y"));
        System.out.println("isim.indexOf(\"y\") = " + isim.indexOf("y"));

        //replace değişiklik yaparız
        System.out.println("isim.replace(\"efe\",\"kemal\") = " + isim.replace("efe", "kemal"));
        String message="merhaba";
        System.out.println("message.replaceFirst(\"a\",\"e\") = " + message.replaceFirst("a", "e"));


    }




}
