package HW;

public class Test2 {
    public static void main(String[] args) {

    }
 /*   10DK 2-) Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
    Aldiginiz degerleri bir metoda gondererek hesaplatin
    vucutKitleEndeksiHesapla(kilo,boy)
    vucut kitle endeksi = (kilo*10000 / (boy *boy))
    vucut kitle endeksi
 30’dan buyukse obez,
            25-30 arasi ise kilolu,
            20-25 arasi ise normal,
            20’den kucukse zayif yazdirin.*/
    public static String vucutKitleEndeksiHesapla(double kilo,double boy){
        double vke=(kilo*10000 / (boy *boy));
        String result="";
        if(vke>30){
            result="obez";
        }else if(vke>25){
            result="kilolu";
        }else if(vke>20){
            result="normal";
        }else {
            result = "zayıf";
        }
        return result;
    }
}
