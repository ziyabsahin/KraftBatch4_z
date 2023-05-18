package day_06_Type_Casting;

public class Concatinetion {
    public static void main(String[] args){
        String a="merhaba";
        String b="dünya";
        String c=a+b;
        System.out.println(c);
        // C03_String ifadeye kadar toplama.C03_String ifadeyi gördükten sonra
        //diger ifadeelrde string devam eder
        System.out.println(2+5+c+2+5);
        System.out.println(2+5+c+(2+5));
        System.out.println(2+5+c+(2+5)+3);
        int i=10;
        System.out.println(i+2+5+c+(2+5)+3+" dünya");
        System.out.println(i+2+5+c+(2+5)+3+i+" dünya");
        //önce parantez içi

    }
}
