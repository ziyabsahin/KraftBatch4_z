package day_16_Branching_Statements;

public class Example1 {


    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k =6-i; k>0 ; k--) {
                System.out.print("* ");

            }System.out.println();
        }




    }
}
