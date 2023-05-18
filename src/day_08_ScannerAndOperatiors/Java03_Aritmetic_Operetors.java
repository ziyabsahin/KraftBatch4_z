package day_08_ScannerAndOperatiors;

public class Java03_Aritmetic_Operetors {
    public static void main(String[] args){
        System.out.println(10+"20"+90);
        System.out.println(10+90+"20"+90);
        System.out.println(10+"20"+90+10);
        System.out.println(""+10+10+"20"+90+10);
        System.out.println(10+"20"+(90+10));
        //C03_String ifade kendisinden sonra gelenleri de C03_String yapar buna concatenation deniyor
        System.out.println(100/3);
        System.out.println(11-2);
        System.out.println(11*2);
        System.out.println(11/2);
        System.out.println(11%2);
        System.out.println(11/2.0);
        //Java işlemleri integar olarak algılayıp sonucu integar olarak verir
        //ama sayılardan birini double olarak belirtirsek sonuc double olur

        System.out.println(10d/8);
        //double burda bu sekilde yazılabilir
        int a=100;
        double b=a/6;
        System.out.println(b);
        //önce işlemi yapar, integer olarak yapılır işlem daha sonra sayıyı double cevirir

        double c=(double)a/6;
        System.out.println(c);
        //işlemin double olmasını istiyorsak bir degeri double olarak casting yapıyoruz

        System.out.println(10%2);
        System.out.println(10%3);
        System.out.println(10%4);


    }
}
