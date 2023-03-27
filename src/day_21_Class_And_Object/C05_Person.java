package day_21_Class_And_Object;

public class C05_Person {
    // isim cinsiyet yas fieldları
    //uyu oyun oyna methods

    String isim;
    String cinsiyet;
    int yas;
    String tcNo;

    public void uyu(){
        System.out.println(isim+" uyuyor");
    }
    public void oyunOyna(){
        System.out.println(isim+" oyun oynuyor");
    }

    public void tumBilgileriGetir(){
        System.out.println("isim "+isim);
        System.out.println("yas "+yas);
        System.out.println("cinsiyet "+cinsiyet);
        System.out.println("tc no "+tcNo);
    }

}
