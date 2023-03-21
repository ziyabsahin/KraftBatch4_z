package day_14_NestedWhileDoWhile;

public class HW8 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int a=1;
        while(a<=100){
            if(a%2==0){
                System.out.print(a+" ");
            } a++;
        }
        System.out.println();
        int b=1;
        do{
            if(b%2!=0){
                System.out.print(b+" ");
            } b++;
        }while(b<=100);
    }
}
