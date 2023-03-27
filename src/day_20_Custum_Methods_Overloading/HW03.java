package day_20_Custum_Methods_Overloading;

public class HW03 {
    public static void main(String[] args) {

        System.out.println(negativePositive(-12));

    }



    public static String negativePositive(int x){
        String str;
        if (x<0){
            str="negative";
        } else if(x>0){
            str="positive";
        } else{
            str="zero";
        }
        return str;
    }
}
