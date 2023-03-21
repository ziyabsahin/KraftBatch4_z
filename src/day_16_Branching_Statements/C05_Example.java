package day_16_Branching_Statements;

public class C05_Example {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print("b");
            for (int j = 0; j < 10; j++) {
                if(j>2){
                    continue;
                }
                System.out.print("a");

            }

        }
    }
}
