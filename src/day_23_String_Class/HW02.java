package day_23_String_Class;

public class HW02 {
    public static void main(String[] args) {

        String name="ziya";
        String lastname="büyükşahin";
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("lastname.toUpperCase() = " + lastname.toUpperCase());
        System.out.println("--------------------------------------------");


        String mesaj="merhaba dünya";
        System.out.println("mesaj.charAt(mesaj.length()-1) = " + mesaj.charAt(mesaj.length() - 1));
        System.out.println("--------------------------------------------");

        for (int i = 0; i < mesaj.length(); i++) {
            System.out.println(mesaj.charAt(i));

          //  llanıcıdan 3 kelime alın ve length i uzun olandan kısa
           // olana hepsini birleştirin. Concat() kullanın. (Ödev)

        }

        concat("merhaba ","nasılsın ","iyi misin ");


    }
    public static void concat(String str1,String str2,String str3 ){
        String str4=str1.concat(str2.concat(str3));
        System.out.println(str4);
    }



}
