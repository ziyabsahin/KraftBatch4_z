package day13_For_Loops;

public class C06_Tasks {
    public static void main(String[] args) {

        //0-100 arasındaki tüm sayıları yazdır
         for(int s=1;s<=100;s++){
             System.out.print(s+" ");
         }
        System.out.println(" ");
        System.out.println("-----------------------------------");
         for(int i=15;i<=100;i++){
             System.out.print(i+" ");
         }
        System.out.println(" ");
        System.out.println("-----------------");

        for(int i=100;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("------------------------");
        for(int a=2;a<=100;a++){
            if(a%2==0){
                System.out.print(a+" ");
        }
    }
        for(int b=2;b<=100;b+=2){
            System.out.print(b);
        }
        System.out.println(" ");
        System.out.println("---------------------");
        for(int c=1;c<=100;c++){
            if(c%2==1){
                System.out.print(c+" ");
            }
        }

} }
