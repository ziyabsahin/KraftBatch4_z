package day_16_Branching_Statements;

import java.util.Scanner;

public class C03_Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean resault=true;

        while(resault){
            System.out.print("x :");
            int x= scan.nextInt();
            System.out.print("y :");
            int y= scan.nextInt();
            int top=x+y;
            if(top>=25){
                resault=false;
            } else{
                System.out.println("toplam "+top );
            }

        }
    }
}
