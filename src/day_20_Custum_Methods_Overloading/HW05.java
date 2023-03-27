package day_20_Custum_Methods_Overloading;

public class HW05 {
    public static void main(String[] args) {
        System.out.println(ikili(12,"beyza",false));



    }
    public static boolean ikili(int x, String str,boolean a ){
     String str1;
        if(a==true){
            str1=x+str;
        } else{
            ikili(x,str);


        }
        return a;
    }
    public static void ikili(int a, String s){

        for (int i = 0; i < a; i++) {
            System.out.println(s);

        }

    }
}
