package day_29_FullReview;

import java.util.Scanner;

public class String_Tasks {
    //  1-  Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
//    ise inputu döndüren bir metot yazınız.
    public static String ilkUcHarf(String str) {
        String result = "";
        if (str.length() < 3) {
            result = str;
        } else {
            for (int i = 0; i < 3; i++) {
                result += str.charAt(i);

            }
        }
        return result;
    }

    //2-Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    //Merhaba dünya Merhaba%dünya
    public static String bosluklariDegistir(String str) {
        str = str.replace(" ", "%");
        return str;
    }
    //3-Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
    //yazdırın.

    public static String kelimeninIkinciYarisi(String str) {
        String result = "";
        for (int i = str.length() / 2; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    //   4 Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//    alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
//    yazınız.
    public static String ilkHarfiDegistir(String str, String karakter, String karakter2) {
        return str.replaceFirst(karakter, karakter2);
    }

    //5- Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String ucDefaYazdir(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.charAt(i);
            }

        }
        return result;
    }
    //6-Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    //edilecek)

    public static int karakterSayisi(String str, String karakter) {
        str = str.toLowerCase();
        karakter = karakter.toLowerCase();
        return str.length() - str.replace(karakter, "").length();
    }
//   7- Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
//    kaldırılmış şekilde string döndüren programı yazınız.

    public static String karakteriKaldir(String str, String karakter) {
        return str.replace(karakter, "");
    }

    //8-Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;


    public static boolean kinKontrol(String str) {
        if (str.startsWith("kin") || str.substring(1).startsWith("kin")) {
            return true;
        }
        return false;
    }

    //9-Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
    //defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String ikiKelimeYazdir(String str1, String str2) {
        String result = "";
        if (str1.length() > str2.length()) {
            for (int i = 0; i < 2; i++) {
                result += str2;

            }
            for (int i = 0; i < 30; i++) {
                result += str1;
            }
            for (int i = 0; i < 2; i++) {
                result += str2;
            }
        } else {
            for (int i = 0; i < 2; i++) {
                result += str1;

            }
            for (int i = 0; i < 30; i++) {
                result += str2;
            }
            for (int i = 0; i < 2; i++) {
                result += str1;
            }
        }
        return result;
    }


    //10-Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
//altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    public static String besKaraktereTamamla(String str) {

        String result = "";
        if (str.length() >= 5) {
            result = str.substring(0, 5);
        } else {
            result = str;
            for (int i = 0; i < 5 - str.length(); i++) {
                result += ".";
            }
        }
        return result;
    }

    //11-Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    //almıyorsa false yazdırın.
    public static boolean ilkIkiHarfSondaVarMi(String str) {
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

//  12-  Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//    Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.

    public static String isimSoyisim(String str) {
        int a = str.indexOf(" ");
        String soyisim = str.substring(a + 1);
        String result = " soy isminiz " + soyisim + " dır.";
        return result;
    }

    //13-Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    public static String yenilenenKarakteriCikart(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    //14-Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
    //olarak return eden methot yazınız.
    public static String yinelenenKarakterleriYaz(String str) {
        String result = "";
        while (str.length()>0) {

            if (str.indexOf(str.charAt(0)) != str.lastIndexOf(str.charAt(0))) {
                result += str.charAt(0);
            }
            str=str.replace(str.substring(0,1),"");

        }
        return result;
    }



    //15-Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.
    public static String unluUnsuz(String str) {
        String unlu = "";
        String unsuz = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'ı', 'o', 'ö', 'u', 'ü':
                    unlu += str.charAt(i);
                    break;
                default:
                    unsuz += str.charAt(i);

            }

        }
        String result = "ünlü harfler =" + unlu + " ünsüz harfler =" + unsuz;
        return result;
    }
//16-Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
//harfini kelimeden keserek sonuna ekleyin.

    public static String ilkucHarfiSonaEkle(String str) {
        return str.substring(3) + str.substring(0, 3);
    }
//17-Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
//harfini kelimeden keserek kelimenin başına ekleyin.

    public static String ilkucHarfiSonaEkle2(String str) {
        String result = "";
        for (int i = 3; i < str.length(); i++) {
            result += str.charAt(i);
        }
        for (int i = 0; i < 3; i++) {
            result += str.charAt(i);

        }
        return result;
    }

//18-Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//ikazı versin.

    public static String benzersizHarf(String str) {
        str = str.toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
                return result;
            }

        }
        result = "benzersiz harf yok";
        return result;
    }
    //19-Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //yazdırın. (anagram kelime ise)

    public static boolean anagram(String str1, String str2) {
        boolean kontrol = true;
        if (str1.length() == str2.length()) {

            while (str1.length() != 1) {
                str1 = str1.replace(str1.substring(0, 1), "");
                str2 = str2.replace(str1.substring(0, 1), "");
                if (str1.length() != str2.length()) {
                    kontrol = false;
                    break;
                }
            }
        } else {
            kontrol = false;
        }
        return kontrol;
    }

//20-Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
//yazın.

    public static String ardardaharfler(String str) {
        String result = "";

        while (str.length() > 1) {


            if (str.substring(0, 1).contains(str.substring(1, 2))) {
                result += str.charAt(0);

            }
            str = str.replace(str.substring(0, 1), "");

        }
        return result;
    }
    //21-Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    //girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    //Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    //giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
    //birleştirerek yazdırın.

    public static String kelimeBirlestir() {
        String result = "";
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {

            System.out.println("birinci kelime");
            String str1 = scan.nextLine();
            System.out.println("ikinci kelime");
            String str2 = scan.nextLine();
            if (str1.length() <= 4 && str2.length() <= 4 && str1.length() > 1 && str2.length() > 1) {
                result = str1.concat(str2);
                break;

            } else {
                System.out.println(3 - i + " hakkınız var");
            }
        }
        return result;

    }

    //22-Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    //küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    //ikazı versin.
    public static String benzersizHarfKontrol(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                result += str.charAt(i);
                break;
            } else {
                result = "benzersiz harf yok";
            }
        }
        return result;
    }

    //23-Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    //true değil ise false döndüren metot yazınız.
    public static boolean tersiAyni(String str) {
        boolean bl = true;
        String str2 = "";
        for (int i = str.length(); i > 0; i--) {
            str2 += str.substring(i - 1, i);

        }
        if (str.equals(str2)) {
            return bl;
        }
        bl = false;
        return bl;
    }
    //24-Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    //true değil ise false döndüren metot yazınız.
    public static boolean tersiAyni2(String str) {
        boolean bl = true;
        String str2 = "";
        for (int i = str.length(); i > 0; i--) {
            str2 += str.substring(i - 1, i);

        }
        if (str.startsWith(str2)) {
            return bl;
        }
        bl = false;
        return bl;

    }

    //25-Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
    //ekrana yazdırın.

    public static int kaçDefaVar(String str){
        String a="";
        int sum=0;

        for (int i = 0; i <str.length(); i++) {
            a=str.substring(i);
            if(a.startsWith("sev")){
                sum++;
            }
            a=str.substring(i);


        }
        return sum;
    }

    //26-Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
    //sayılarda dönüyorsa false yazdıran metodu yazınız.
    //Ankara ile Bursa arası 500 km. True
    //Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //İstanbul çok uzak false

    public static boolean cümledeVarMı(String str){
        boolean bl=false;

        String str1="";
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < str.length(); i++) {



            str1=str.substring(i);
            if(str1.startsWith("Bursa")){
                sum1++;
            }
            str1=str.substring(i);


        }
        for (int i = 0; i < str.length(); i++) {



            str1=str.substring(i);
            if(str1.startsWith("Ankara")){
                sum2++;
            }
            str1=str.substring(i);


        }
        if(sum1==sum2){
            bl=true;

        }
        return bl;
    }
    //27-Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    //döndüren metodu yazdırın.

    public static boolean sonuEcekMi(String str){
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            str2=str.substring(i);
            if(str2.equals("ecek")||str2.equals("acak")){
                return true;
            }


        }
        return false;
    }
//28-Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
//yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)

    public static String karakterVeSayisi(String str){
        String result="";
        while ( 0 < str.length()) {
            int a=str.length()-str.replace(str.substring(0,1),"").length();
            result=result.concat(a+str.substring(0,1));
            str=str.replace(str.substring(0,1),"");

        }
        return result;
    }

    //29-Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız

    public static String enCokKarakteriDöndur(String str){
        String result="";
        int a=0;
        int b=0;
        for (int i = 0; i < str.length(); i++) {
            a=str.length()-str.replace(str.substring(i,i+1),"").length();
            if(a>b){
                result=str.substring(i,i+1);
            }
            b=a;
        }
        return result;
    }



}







