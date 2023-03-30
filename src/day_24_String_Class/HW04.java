package day_24_String_Class;

import java.util.Scanner;

public class HW04 {

    public static void main(String[] args) {
        System.out.println(kelime());

    }
  /*  Bir method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
    eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
    sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
    kelimeler aynı mesajı döndürsün. Kelimeler her anlamda farklı
    ise kullanıcıyı aynı sürece sokun.(ödev)*/

    public static String kelime(){
        String resault="";
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("ilk kelime:");
            String str1=scan.nextLine();
            System.out.println("ikinci kelime:");
            String str2=scan.nextLine();

        if (str1.equals(str2)) {
            System.out.println("kelimler aynı");
            break;
        } else if(str1.length()==str2.length()){
            System.out.println("kelimlerin uzunlugu aynı");
            break;
        }else{
            System.out.println("başa dönün");
            kelime();

        }}
        return resault;
    }
}
