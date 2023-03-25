package day_20_Custum_Methods_Overloading;

public class C04_Method_Overloading3 {
    public static void main(String[] args) {
        double sum=sum(10.5,20.7);
        System.out.println(sum);
        double sum2=sum(11.1,22.2,33.3);
        System.out.println(sum2);
    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2 ;
    }

    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}

