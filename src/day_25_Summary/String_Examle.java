package day_25_Summary;

public class String_Examle {
    //lenght() metodu girilen bir ifadenin uzunlugu

    public static int uzunluk(String str){
       return str.length();
    }
    public static String kucukHarf(String str){
        return str.toLowerCase();
    }
    public static String buyukHarf(String str){
        return str.toUpperCase();
    }
    public static char karakterGetir(String str,int x){
        return str.charAt(x);
    }
    public static String concat(String str,String str2){
        return str.concat(str2);
    }
    public static boolean iceriyorMu(String str,String str2){
        return str.contains(str2);
    }
    public static String trim(String str){
        return str.trim();
    }
    public static String degeriDegistir(String str,String str2, String str3){
        return str.replace(str2,str3);
    }
    public static String ilkDegeriDegistir(String str,String str2, String str3){
        return str.replaceFirst(str2,str3);
    }
    public static int ilkDegerinNoGetir(String str,String str2){
        return str.indexOf(str2);
    }
    public static int sonDegerinNoGetir(String str,String str2){
        return str.lastIndexOf(str2);
    }



    public static void main(String[] args) {
        String cumle="Merhaba";
        System.out.println(uzunluk(cumle));
        System.out.println(kucukHarf(cumle));
        System.out.println(buyukHarf(cumle));
        System.out.println(karakterGetir(cumle, 4));
        System.out.println(concat(cumle, " Dünya"));
        System.out.println(iceriyorMu(cumle, "ha"));
        System.out.println(trim(" merhaba"));
        System.out.println(" Merhaba ".trim());
        System.out.println(degeriDegistir(cumle, "a", "e"));
        System.out.println(cumle.replace("e", "a"));
        System.out.println(ilkDegeriDegistir(cumle, "a", "e"));
        System.out.println(cumle.replaceFirst("a", "e"));
        System.out.println(ilkDegerinNoGetir(cumle, "ab"));
        System.out.println(cumle.indexOf("z"));
        System.out.println(sonDegerinNoGetir(cumle, "a"));


    }

}
