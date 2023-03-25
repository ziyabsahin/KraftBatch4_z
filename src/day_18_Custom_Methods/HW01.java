package day_18_Custom_Methods;

public class HW01 {
    public static void main(String[] args) {

        kuvvet(5,3);

    }

    /**
     * Bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci
     * sayının üslü kuvveti yapıp sonuç versin.
     * @param a
     * @param b
     */
    public static void kuvvet(int a,int b){
        int kuvvet=1;
        for (int i = 1; i <= b; i++) {
            kuvvet*=a;

        }
        System.out.println(kuvvet);
    }

}
