package HW;

public class Test3 {
    public static void main(String[] args) {

    }
  /*  7DK 3-) Kullanicidan bir String bir de char deger alin. Stringin icinde kac tane char
    oldugunu donen bir metodla sayiyi hesaplatin. Stringde kac adet o harften
    oldugunu da asagidaki formatta ekrana yazdirin. İpucu: length(),
    frequency(String str,char ch)
    orn:input “Merhaba”, ‘a’ Output= Merhaba ‘da 2 adet a bulunmaktadir.*/

    public static int frequency(String str,String ch){

        return str.length()-str.replace(ch,"").length();
    }

}
