package day_24_String_Class;

public class C06_LastIndexOf {

    public static void main(String[] args) {
        //indexOf ilk bulunan indeksi getirir
        //lastIndexOf son eşleşen indeksi getirir

        String str="merhaba";
        System.out.println("str.indexOf('c') = " + str.indexOf('c'));
        System.out.println("str.lastIndexOf('a') = " + str.lastIndexOf('a'));
        int length=str.length();
        System.out.println(length);
       int lengthFinal= str.replace("a","").length();
        System.out.println(str+ "  içerisinde a "+(length-lengthFinal)+" adet vardır");


    }
}
