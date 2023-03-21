package day_14_NestedWhileDoWhile;

public class hm3 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int a=10;a>=i;a--){
                System.out.print("*");

            }
            System.out.println();

        }
        int b=1;
        while(b<=10){
            int c=10;
            while(c>=b){
                System.out.print("*");
                c--;

            }
            System.out.println();
            b++;
        }

        int d=1;
        do{
            int e=10;
            do {
                System.out.print("*");
                e--;
            } while(e>=d);
            System.out.println();
            d++;


        }while(d<=10);




    }
}
