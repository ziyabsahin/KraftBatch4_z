package day12;

public class C01 {
    public static void main(String[] args) {

        //3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız


        int a=1;
        int b=3;
        int c=2;

        if(a==b){
            System.out.println(a);
        } else if(b==c){
            System.out.println(b);
        }else if(a==c){
            System.out.println(c);

        } else{
            System.out.println("eşit sayı yoktur");
        }

    }
}
