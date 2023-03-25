package day_20_Custum_Methods_Overloading;

public class C05_Method_Overloading4 {


    public static void main(String[] args) {
        System.out.println(area(3, 5));


    }

    public static int area(int num1,int num2){

        return num1*num2;

    }
    public static void area(double radius){
        System.out.println(Math.round(Math.PI*radius*radius));

    }
}
