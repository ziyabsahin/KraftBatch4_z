package day_24_String_Class;

public class C03_İs_Empty {
    public static void main(String[] args) {
        //isEmpty stringin boş olup olmadıgına bakar
        String str1="";
        String str2=" ";
        String str3="merhaba";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str2.isEmpty() = " + str2.isEmpty());
        System.out.println("str3.isEmpty() = " + str3.isEmpty());
        System.out.println("str3.isBlank() = " + str3.isBlank());
        System.out.println("str1.isBlank() = " + str1.isBlank());
        System.out.println("str2.isBlank() = " + str2.isBlank());
    }
}
