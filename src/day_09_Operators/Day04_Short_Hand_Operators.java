package day_09_Operators;

public class Day04_Short_Hand_Operators {
    public static void main(String[] args) {
        int num=10;
        num=20;
        num=30;
        System.out.println("num = " + num);
        System.out.println("...........................");

        String word="Java Programing language";
        System.out.println("word = " + word);
        word="phiton";
        System.out.println("word = " + word);
        System.out.println("..........................");
        int x=100;
        System.out.println("x = " + x);
        x=x+100;
        System.out.println("x = " + x);
        System.out.println("...........................");


        x+=100;
        System.out.println("x = " + x);

        System.out.println("..........................");

        String str="golden";
        str+=" globe";
        System.out.println(str);

        System.out.println("..........................");

        double num1=3.5;
        num1+=6.5;
        System.out.println("num1 = " + num1);


        double bakiye=3520.50;
        System.out.println("bakiye = " + bakiye);
        bakiye+=1500;
        System.out.println("bakiye = " + bakiye);
        bakiye-=2200;
        System.out.println("bakiye = " + bakiye);
     System.out.println("............................");

        double maas=42500.50;
        System.out.println("maas = " + maas);
        maas *=2;
        System.out.println("maas = " + maas);

        double gramAltin=0.001;
        gramAltin *=120;
        System.out.println("gramAltin = " + gramAltin);


        double maas2 =50000;
        maas2/=2;
        System.out.println("maas2 = " + maas2);

        double num3=100;
        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("............................");
        int odenecektutar=1130;
        int ikiyuzluk=1130/200;

        odenecektutar%=200;
        System.out.println("odenecektutar = " + odenecektutar);
        int yuzluk=odenecektutar/100;
        odenecektutar%=100;

        int yirmilik=odenecektutar/20;
        odenecektutar%=20;

        int onluk=odenecektutar/10;
        odenecektutar%=10;
        System.out.println("1130TL için "+ikiyuzluk+" ikiyüzlük "+ yuzluk+
                " yuzluk " + yirmilik + " yirmilik "+ onluk+ " onluk banknot gerekli");









    }
}
