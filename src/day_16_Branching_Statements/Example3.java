package day_16_Branching_Statements;

public class Example3 {
    public static void main(String[] args) {
        int sum=0;

        for (int i = 0; i <=20 ; i++) {

            if(i%2!=0){
                continue;
            }
            else {
                sum+=i;


            }


        } System.out.println(sum);







    }
}
