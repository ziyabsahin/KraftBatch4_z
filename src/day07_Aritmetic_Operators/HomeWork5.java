package day07_Aritmetic_Operators;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik =");
        int matematik=scan.nextInt();
        System.out.print("fen bilgisi=");
        int fen=scan.nextInt();
        int ortalama=(matematik+fen)/2;
        System.out.print("ORTALAMA="+ortalama);

    }


}
