package HW;

public class HW3 {
    public static void main(String[] args) {

        System.out.println(ayniHarflerdenKelime("beyazk", "zakyeb"));
    }


  /*  Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
            yazdırın. (anagram kelime ise)*/
    public static boolean ayniHarflerdenKelime(String str1,String str2){
        if(str1.length()==str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                if((str1.replace(str1.substring(i,i+1),"").length())!=(str2.replace(str1.substring(i,i+1),"").length())){
                    return false;
                }



            } return true;
        }
        return false;


    }


}
