package day_21_Class_And_Object;

import java.util.Scanner;

public class C02_Davetiye_Sorusu {
    public static void main(String[] args) {
        davetiye();



    }
    /*Düğün
kartı bastıran bir program yazın
Kullanıcıdan
2 adet kelim e isteyen bir metodunuz olsun Bu metot
kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin*/


    public static void davetiye() {
        boolean flag = true;
        while (flag) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.kelime");
            String kelime = scan.nextLine();
            System.out.println("2.kelime");
            String kelime2 = scan.nextLine();
            if (kelimeKontrol(kelime, kelime2)) {
                System.out.println("kelimeler aynı");
                continue;

            } else {
                davetiyeYazdır(kelime, kelime2);
                return;

            }

        }
    }
    public static boolean kelimeKontrol(String str, String str2){
        return str.equals(str2);
    }
    public static void davetiyeYazdır(String str1, String str2){
        System.out.println(str1+str2);

    }


}
