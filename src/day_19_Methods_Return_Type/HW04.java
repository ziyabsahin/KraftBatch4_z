package day_19_Methods_Return_Type;

public class HW04 {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }

    public static int fib(int a){
        int ilk=0;
        int iki=1;
         int üc=ilk+iki;

        System.out.print(ilk+" "+iki+" ");
        while(a>0){

            ilk =iki;
            iki=üc;
            üc=ilk+iki;

            System.out.print(üc+" ");

            a--;

        }
        return üc;
    }
}
