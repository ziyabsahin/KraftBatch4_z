package day_23_String_Class;

public class C01_String_Class {
    public static void main(String[] args) {

        String str=new String();
        str="New";
        System.out.println(str.contains("s")); // karakter var mı diye karşılaştırır
        System.out.println(str.length());  //uzunluk

        System.out.println(str.charAt(2)); //karakteri getirir uzunlukta belirtilenin bir eksigi ile istediğimiz sırayı isteriz
        System.out.println(str.toUpperCase()); //büyük yazıyor
        System.out.println(str.toLowerCase()); //küçük yazıyor



    }


}
