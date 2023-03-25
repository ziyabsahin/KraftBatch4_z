package day_19_Methods_Return_Type;

public class C05_Factoriyel {
    public static void main(String[] args) {
        System.out.println(faktoriyelHesaplama(5));



    }
    /* metod oluşturma aşamalar:
    1-public static
    2-sonuc dondurecekse data tipini belirtecegiz
    3-name(acıklayıcı ve anlaşılır)
    4-metodun parantezleri()
    5-body aç{} işlemi yap
    6-return keywordu ile dondurulmesi planlanan degeri döndür.



    */

    public static int faktoriyelHesaplama(int sayı){
        int faktoriyel=1;
        for (int i = 1; i <=sayı ; i++) {

            faktoriyel*=i;
        }
        return faktoriyel;
    }
}
