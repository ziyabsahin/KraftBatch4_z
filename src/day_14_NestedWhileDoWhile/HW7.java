package day_14_NestedWhileDoWhile;

public class HW7 {
    public static void main(String[] args) {
        for(int i=100;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        int a=100;
        while(a>=1){
            System.out.print(a+" ");
            a--;
        }
        System.out.println();
        int b=100;
        do{
            System.out.print(b+" ");
            b--;
        }while(b>=1);
    }
}
