package day_20_Custum_Methods_Overloading;

public class C03_Method_Overloading2 {
    public static void main(String[] args) {
        System.out.println(sum(3, 4, 5, 6));


    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int sum(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }


}

 /*
Task1:
        1. create a method that can find the sum of two numbers


        2. create a method that can find the sum of three numbers


        3. create a method that can find the sum of four numbers

 */

