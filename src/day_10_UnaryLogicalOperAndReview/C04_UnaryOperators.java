package day_10_UnaryLogicalOperAndReview;

public class C04_UnaryOperators {
    public static void main(String[] args){
        int num1=+3;
        int num2=-3;
        System.out.println(num1>0);
        System.out.println(num2>0);
        System.out.println("------------------------");
        int a=10;
        ++a; //bu a+=1 demek. preincrement sayının degerini 1 artırır
        System.out.println("a = " + a);
        --a; //bu a-=1 demektir
        System.out.println("a = " + a);
        System.out.println("-------------------------");
        int b=99;
        System.out.println(++b);  //preincrement oldugu için icerde degeri 1 arttırır.
        int c=99;
        System.out.println(c++); //postincrement c yi yazdırır. sonraki c yi yazmamızda 1 artar
        System.out.println(c);

        System.out.println("------------------------------");

        int x=201;
        System.out.println(--x);

        int y=201;
        System.out.println(y--);
        System.out.println(y);

        System.out.println("------------------");

        int z=44;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z++);

        int i=42;
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

    }
}
