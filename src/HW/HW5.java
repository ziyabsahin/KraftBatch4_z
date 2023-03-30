package HW;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        System.out.println(kelimeConcat());

    }
   /* ullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
    birleştirerek yazdırın*/

    public static String kelimeConcat(){
        Scanner scan=new Scanner(System.in);

        String result="";
        for (int i = 1; i <= 3; i++) {
            System.out.println("1.kelime");
            String str1=scan.nextLine();
            System.out.println("2.kelime");
            String str2=scan.nextLine();
            if(str1.length()>1&&str1.length()<=4&&str2.length()>1&&str2.length()<=4){
                return str1.concat(" ").concat(str2);
            }
            System.out.println("hatalı giriş "+(3-i)+" hakkınız kaldı");

        }
        return result;
    }


}
