package day12;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu girin");
        int not=scan.nextInt();
        if(not>=85){
            System.out.println("A");
        } else if(not>=70){
            System.out.println("B");
        } else if(not>=55){
            System.out.println("C");
        } else if(not>=40){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}
