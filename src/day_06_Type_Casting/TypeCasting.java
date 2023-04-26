package day_06_Type_Casting;

public class TypeCasting {
    public static void main(String[] args){
        // aynı tür verableları birbirine dönüştürebiliriz. Sayıları sayılarla.
        // primitive data typeları kendi içlerinde dönüştürüyoruz
        // küçük olanı büyük olana otomatik dönüştürüyor
        //tam tersinde ise manuel yapmamız lazım.


        short a=5;
        byte b;
        b=(byte)a;

        int i=10;
        double d=20;
        d=i;
        i=(int)d;
        float f=2.5f;
        f=i;
        i=(int)f;
        System.out.println(f);
        byte c=20;
        byte d2=10;
        //byte z=c+d; işlem olunca int oluyor, işlemin byte olması için manuel casting
        //yapmamız gerekli
        byte z=(byte)(c+d2);
        //double işlemlerde sonuc int olsun istersek double olan kısmı int diye casting yaparız
    }
}
