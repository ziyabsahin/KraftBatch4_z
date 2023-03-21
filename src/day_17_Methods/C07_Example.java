package day_17_Methods;

public class C07_Example {
    public static void main(String[] args) {
        kupHesaplama(4);
        kareHesaplama(5);
        isim("ziya");

        max(3,14);
        ortalama(13,20);

    }
    public static void kupHesaplama(int x){
        System.out.println(x*x*x);

    }

    public static void kareHesaplama(int x){
        int resault=x*x;
        System.out.println(resault);
    }
    public static void isim(String isim){
        System.out.println("isminiz :"+isim);
    }
    public static void max(int x,int y){
        if (x<y){
            System.out.println(y);
        } else{
            System.out.println(x);
        }
    }public static void ortalama(double x,double y){
        double ortalama=(x+y)/2;
        System.out.println("ortalama"+ortalama);
    }

}
