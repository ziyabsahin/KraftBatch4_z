package day_18_Custom_Methods;

public class C03_CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(23);
        birthYear(1983);
        between(13,22);


    }


    /**
     * a function that can check if a number is odd number or even number
     * @param number
     */
    public static void oddOrEven(int number){
        if(number%2==0)
            System.out.println(number+" sayısı çift");

        else
            System.out.println(number+" sayısı tek");

    }
     //

    /**
     *  a method that can display the age of the person from the birthYear
     * @param birthYear
     */
    public static void birthYear(int birthYear){
        int resault=2023-birthYear;
        System.out.println("yaşınız :"+resault);
    }


    /**
     *  a method that can print all the numbers between X and Y
     * @param x
     * @param y
     */
    public static void between(int x,int y){
        if(x>y){
            while (y<x){
                System.out.print(y+" ");
                y++;
            } }else{
            while(x<y){
                System.out.print(x+" ");
                x++;
            }

            }
        }
    }





