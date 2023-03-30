package day_24_String_Class;

public class C04_starsWith_endsWith {
    public static void main(String[] args) {
        //stars ve ends with başlangıç ve son kısmın karakter kontrolü yapıyor, baştan itibaren ya da sondan itibaren karakter kontrolü yapar
        //true ya da false dönüyor
        String str="merhaba dünya";
        System.out.println("str.startsWith(\"mer\") = " + str.startsWith("mer"));
        System.out.println("str.endsWith(\"nya\") = " + str.endsWith("nya"));
        System.out.println("str.endsWith(\"dnya\") = " + str.endsWith("dnya"));
        System.out.println("str.startsWith(\"merab\") = " + str.startsWith("merab"));
        System.out.println("str.startsWith(\"\") = " + str.startsWith(""));
    }
}
