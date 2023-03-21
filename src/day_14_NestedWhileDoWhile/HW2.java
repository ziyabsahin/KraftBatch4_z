package day_14_NestedWhileDoWhile;

public class HW2 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for (int a=1;a<=i;a++){
                System.out.print("*");
            }
            System.out.println();
        }
        int a=1;
        while(a<=10){
            int b=1;
            while(b<=a){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }
        int c=1;
        do{ int d=1;
            do{
            System.out.print("*");
            d++;
            } while(d<=c);
            System.out.println();
            c++;
        } while(c<=10);
        }
    }

