package day06_Type_Casting;

public class HomeWork {
    /*Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
 c musluğu ise dolu havuzu 9 saatte boşaltıyor.
 Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.*/
    public static void main(String[] args){
        double a_muslugu=12;
        double b_muslugu=30;
        double c_muslugu=9;
        double sonuc=1/((1/a_muslugu)+(1/b_muslugu)-(1/c_muslugu));
        System.out.println(sonuc);

    }
}
