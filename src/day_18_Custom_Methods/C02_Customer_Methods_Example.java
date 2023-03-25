package day_18_Custom_Methods;

public class C02_Customer_Methods_Example {
    public static void main(String[] args) {


        helloWord5Times();
        System.out.println("-------------------");
        countdownTenToZero();
        System.out.println("-------------------");
        evenNumbers();


    }
    /**
     * a function that can print hello world 5 times

     */
    public static void helloWord5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }

    /**
     *    a function that print Ten to Zero
     */
    public static void countdownTenToZero(){
        for (int i = 10; i >=0 ; i--) {
            System.out.print(i+" ");

        }
    }

    /**
     * a function that can print all the even numbers from 1 ~ 100
     */
    public static void evenNumbers(){
        for (int i= 0; i<=100 ; i++) {
            if (i%2!=0){
                continue;
            }
            else{
                System.out.print(i+" ");
            }

        }
    }
}
