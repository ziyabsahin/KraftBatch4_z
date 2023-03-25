package day_20_Custum_Methods_Overloading;

public class C02_Method_Overloading1 {
    public static void main(String[] args) {
        int sum=sumOf2Numbers(13, 17);
        int sum2=sumOf3Numbers(10, 20,(int)30.5);
        int sum3=sumOf4Numbers(10, 20, 30, 40);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);


    }
    /*
Task1:
        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
 */

    /**
     *create a method that can find the sum of two numbers
     * @param num1
     * @param num2
     * @return
     */
    public static int sumOf2Numbers(int num1,int num2){
        return num1+num2;
    }

    /**
     * create a method that can find the sum of three numbers
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    /**
     * create a method that can find the sum of four numbers
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @return
     */
    public static int sumOf4Numbers(int num1,int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }


}
