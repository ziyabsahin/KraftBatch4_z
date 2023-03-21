package day06_Type_Casting;

public class Aritmetic_Operators {
    public static void main(String[] args){
        int x=5;
        int y=2;
        int z=x+y;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        //String ifade olsa bile işlem önceligi gecerli mod almada carpma ve bölme gibi
        //bölme işlemi double ama int deger atadıgımız için tam sayı
        //int/int sonuc int oluyor

        double c=(double)x/y;
        System.out.println(c);
        //tek seferlik double olarak birini genişlettik bu nedenle işlem double
        //oldu
        double f=2;
        System.out.println(f/x/y);
       System.out.println(20%9);
       System.out.println(8%9);
       System.out.println(3+5/2*4%(12-9));

       double sayi= 3+5.0/2*4%(12-9);

       System.out.println(sayi);

    }
}
