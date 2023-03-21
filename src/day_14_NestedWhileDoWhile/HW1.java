package day_14_NestedWhileDoWhile;

public class HW1 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("-------------------------------");
        int a=1;
        while (a<=10){
            int b=1;
            while (b<=10){
                System.out.print("*");
                b++;
            }
            a++;
            System.out.println();
        }
        System.out.println("---------------------------------------");
        int c=1;
        do{ int d=1;
            do{
                System.out.print("*");
                d++;
            } while (d<=10);
            c++;
            System.out.println();
        }while(c<=10);
    }
}
