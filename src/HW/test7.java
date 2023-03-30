package HW;

public class test7 {
    public static void main(String[] args) {


    }
  /*  5DK 7.equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
    büyükküçük harfleri baz almadan kontrol eden bir metot yazınız.*/

    public static boolean equalsIgnorecase(String str, String str2){
        String a=str.toLowerCase();
        String b=str2.toLowerCase();
        return a.equals(b);
    }



}
