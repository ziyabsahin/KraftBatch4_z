package day_15_Week3_Rewiev;

public class C08_Example {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");

            }
        }
        System.out.println();
        System.out.println("------------------");
        int i=0;
        while(i<=100){
            if(i%2==0){
                System.out.print(i+" ");
            } i++;
        }
        System.out.println();
        System.out.println("--------------------------");
        int c=0;
        do{
            if(c%2==0){
                System.out.print(c+" ");
            } c++;
        }while(c<=100);



    }
}
