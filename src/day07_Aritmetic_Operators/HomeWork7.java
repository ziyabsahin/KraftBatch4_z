package day07_Aritmetic_Operators;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Fahrenheit :");
        Double f=scan.nextDouble();
        Double c=(f-32)/1.8;
        System.out.print("Celcius :"+c);


    }
}
