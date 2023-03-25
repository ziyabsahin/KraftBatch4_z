package day_19_Methods_Return_Type;

public class HW05 {
    public static void main(String[] args) {
        System.out.println(ebob(12,24));

    }
    public static int ebob(int a, int b) {
        int ebob=1;
        for (int i = 1; i <=a&&i<=b ; i++) {
            if(a%i==0&&b%i==0){
                ebob=i;
            }

        } return ebob;

    }

}
