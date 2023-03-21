package day07_Aritmetic_Operators;

public class Aritmetic_Operators3 {
    public static void main(String[] args){
        int dogum_yili=1990;
        int bulundugumuz_yil=2023;
        int yas=bulundugumuz_yil-dogum_yili;
        System.out.println("yas: "+yas);

        //kodun içerisinde degişmeyeceginden emin oldugumuz degişken isimlerini
        //büyük harfle yazabiliriz
        //Math. sınıfımız var, hazır metodlalr var. orn:Math.PI

        //fahrenheit celcius c=(f-32)/1.8)

        double f=300;
        double c=(f-32)/1.8;
        System.out.println("c = " + c);

        double cel=32;
        double fah=(1.8*c)+32;
        System.out.println("fah = " + fah);


        //Ali fizik dersinden 92,
// kimya dersinden 55,
// matematik dersinden 89 almıştır.
//1.Ali’nin not ortalaması kaçtır?

        double fizik=92;
        double matematik=89;
        double kimya=55;

        double ortalama=(fizik+matematik+kimya)/3;
        boolean sinifgecme=ortalama>80;
        System.out.println("ortalama ="+ortalama);
        System.out.println(sinifgecme);
        //double sayıyı int olmasını istersek doble olan sonucun yani ortalamanın önüne
        //(int) yazarak casting işlemi yapabiliriz
        //bloan da kullanılabilir.


       /* Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
        1.Toplantı salonun toplam kapasitesi nedir? 2.Kaç adet boş koltuk vardır ?
                3.Kaç adet sırada oturulmaktadır ?
        4. Kaç sıra tamamen boş kalmıştır.
        5.Oturulan sıralarda kaç adet boş koltuk vardır?*/

       /* double sira=15;
        double koltuk=12;
        double kapasite=sira*koltuk;
        double katilim=113;
        double doluSira=katilim/koltuk;
        double bosSira=sira-doluSira;
       // double bosKoltuk=kasirapasite%;
        System.out.println("kapasite ="+(int)kapasite);
        System.out.println("bos koltuk ="+(int)bosKoltuk);
        System.out.println("oturulan sira ="+(int)doluSira);
        System.out.println("bos sira= "+(int)bosSira);
       // System.out.println("bos koltuk=" + (int)bosKoltuk);*/








    }

}
