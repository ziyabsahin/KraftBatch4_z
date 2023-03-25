package day_18_Custom_Methods;

public class HW04 {
    public static void main(String[] args) {

        asalSayi(211);

    }

    public static void asalSayi(int a){
        boolean asal;
        if(a%2==0||a%3==0||a%5==0||a%7==0){
            asal=false;
        }else{
            asal=true;
        }
        System.out.println(asal);


    }
}
