package day_07_Aritmetic_Operators;

import java.util.Scanner;

public class Scanner_Example {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        C03_String str=scan.nextLine();
        System.out.println("girdiğiniz kelime"+str+"dır");*/

        Scanner scan=new Scanner(System.in);
        System.out.print("fizik =");
        double f=scan.nextDouble();
        System.out.print("kimya =");
       double k=scan.nextDouble();
        System.out.print("matematik");
        double m=scan.nextDouble();
        double ort=(m+k+f)/3;
        System.out.println("ort = " + ort);



    }
}
