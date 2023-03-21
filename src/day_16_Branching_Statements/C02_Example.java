package day_16_Branching_Statements;

public class C02_Example {
    //piramit sorusu
    public static void main(String[] args) {
        for (int i = 5; i >0 ; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }
            for (int k =6-i; k>0 ; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }




    }
}
