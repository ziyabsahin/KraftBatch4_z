package day_17_Methods;

public class C05_Methods2 {
    public static void main(String[] args){

      max();


    }

    public static void ort(){
        int x=3,y=5,z=10;
        double resault=(x+y+z)/3;

        System.out.println("ortalama :"+resault);
    }


    public static void max(){

        int a=5, b=6;
        if (a<b){
            System.out.println(a);
        } else{
            System.out.println(b);
        }
    }
}
