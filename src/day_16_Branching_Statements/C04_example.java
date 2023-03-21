package day_16_Branching_Statements;

public class C04_example {
    public static void main(String[] args) {

        int num=0;
        for(int i=0;i<=20;i++){



            if(i%2==1){
               continue;

            }  num+=i;


        } System.out.println(num);



    }

}
