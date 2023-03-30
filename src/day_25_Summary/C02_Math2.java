package day_25_Summary;

public class C02_Math2 {
    public static void main(String[] args) {
        System.out.println(usluSayılar(2,3));
    }




    public static int usluSayılar(int x, int y){
        int usluSayi=1;
        for (int i = 0; i < y; i++) {
            usluSayi*=x;

        }
        return usluSayi;
    }
}

