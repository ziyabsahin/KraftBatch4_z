package day_16_Branching_Statements;

public class C08_NestedLoop_Branching {
    public static void main(String[] args) {

       outherLop: for (int i = 0; i < 5; i++) {
            System.out.print("A");
           innerLoop:for (int j = 0; j < 5; j++) {
                if(j==2){
                    break outherLop;
                }
               System.out.print("B");

           }

        }



    }
}
