package day_20_Custum_Methods_Overloading;

public class HW02 {
    public static void main(String[] args) {
        System.out.println(asal(27));

    }
    public static boolean asal(int x){
        boolean asal;
        if(x%2==0||x%3==0||x%5==0){
            asal=false;
        } else{
            asal=true;
        }
        return asal;
    }



}
