package day_08_ScannerAndOperatiors;

import java.util.Scanner;

public class Java05_Scanner {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz :");
        String name=scan.nextLine();
        System.out.println("name ="+name);

        //String için scan.nextLine()
        //byte için scan.nextByte()
        //short için scan.nextShort()
        //int için scan.nextInt()
        //float için scan.nextFloat()
        //double için scan.nextDouble()

        scan.close(); //açılan scan objesi kapanıyor


    }

}
