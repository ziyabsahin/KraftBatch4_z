package day_16_Branching_Statements;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int parola=54;
        int hak=5;
        while (hak>=1){
            System.out.print("şifre :");
            int şifre= scan.nextInt();
            if(şifre==parola){
                System.out.println("tebrikler");
                break;
            } hak--;
        }
    }
}
