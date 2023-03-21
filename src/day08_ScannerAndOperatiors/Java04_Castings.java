package day08_ScannerAndOperatiors;

public class Java04_Castings {
    public static void main(String[] args) {
        float bodyTempeture=36.5f;
        byte num1=(byte)bodyTempeture; //narrowing casting, manuel yapmak gerekli
        short num2=(short) bodyTempeture;//narrowing
        int num3=(int)bodyTempeture;//narrowing
        float num4=bodyTempeture;//narrowing
        double num5=bodyTempeture;//widening casting, otomatik olarak yapıyor.
        long num6=(long) bodyTempeture; //narrowing
        System.out.println("num1 ="+num1);
        System.out.println("num2 ="+num2);
        System.out.println("num3 ="+num3);
        System.out.println("num4 ="+num4);
        System.out.println("num5 ="+num5);
        System.out.println("num6 ="+num6);



    }
}
