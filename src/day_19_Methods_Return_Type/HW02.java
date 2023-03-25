package day_19_Methods_Return_Type;

public class HW02 {
    public static void main(String[] args) {
        System.out.println(pow(3,3));




    }

    public static double pow(int a, int b){
        int i=1;
        int num=1;
        while (i<=b){
            num*=a;
            i++;
        }
        return num;
    }
}
