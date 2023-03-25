package day_18_Custom_Methods;

public class HW02 {
    public static void main(String[] args) {
        math(20,5,'/');

    }
    public static void math(double a,double b,char islem){
        switch (islem){
            case '+':

                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':

                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*':

                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':

                System.out.println(a+"/"+b+"="+(a/b));
                break;
        }
    }
}
