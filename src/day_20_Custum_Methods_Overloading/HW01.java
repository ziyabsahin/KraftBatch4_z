package day_20_Custum_Methods_Overloading;

public class HW01 {
    public static void main(String[] args) {
        System.out.println(sonRakam(15,5632115));

    }


    public static boolean sonRakam(int x, int y){
        boolean resault;
        if (x%10==y%10){
            resault=true;
        } else { resault=false; }
        return resault;


    }
}
