package day_13_For_Loops;

import java.util.Scanner;

public class C04_Main_Of_Month {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number between(1-12)");
        int n= scan.nextInt();
        String resault="";
        if (n>0&&n<=12){
            if(n==1){
                resault="January";
            } else if(n==2){
                resault="february";
            } else if(n==3){
                resault="March";
            } else if(n==4){
                resault="april";
            } else if(n==5){
                resault="june";
            } else if(n==6){
                resault="june";
            } else if(n==7){
                resault="july";
            } else if(n==8){
                resault="august";
            } else if(n==9){
                resault="september";
            } else if(n==10){
                resault="october";
            }else if(n==11){
                resault="november";
            } else if (n==12){
                resault="december";
            }

        }else{
            resault="invalid number";}

        System.out.println(resault);
        System.out.println("-----------------------------------");

       // C03_String nameOfMonth=
    }
}
