package day_14_NestedWhileDoWhile;

public class HM5 {
    public static void main(String[] args) {
        int a=1;
        do{
            int b=1;
            while(b<=a){
                System.out.print(a);
                b++;
            } a++;
            System.out.println();
        }while(a<=10);


    }
}
