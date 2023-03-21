package day11_Control_Flow_Statement_If;

import java.util.Scanner;
public class C06 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);


        System.out.println("lütfen notlarınızı giriniz");
        System.out.print("fizik :");
        double f=scan.nextDouble();
         System.out.print("kimya :");
        double k=scan.nextDouble();
         System.out.print("gecme notu :");
        double gn=scan.nextDouble();
        double ort=(f+k)/2;
        if (ort>=gn){
            System.out.println("gectiniz");
        } else{
            System.out.println("kaldınız");
        }



    }
}
