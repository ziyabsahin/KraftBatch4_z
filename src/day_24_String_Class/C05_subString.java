package day_24_String_Class;

public class C05_subString {
    public static void main(String[] args) {
        //substring girilen index numarasından başlayıp yeni bir string olusturuyor
        //overloading metod türüdür. ikinci bir deger girince o degere kadar olan kısmı alıyor
        String str="java programlama dili";
        System.out.println("str.substring(5) = " + str.substring(5));
        System.out.println("str.substring(5,16) = " + str.substring(5, 16));
        System.out.println("str.substring(17) = " + str.substring(17));
        System.out.println("str.substring(str.length()) = " + str.substring(str.length()));
        System.out.println("str.substring(str.length()-5) = " + str.substring(str.length() - 5));
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));
        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));
        System.out.println("str.substring(4,4) = " + str.substring(4, 4));


    }
}
