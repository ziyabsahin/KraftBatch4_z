package day09_Operators;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Day03_SayınınRakamlarıToplamı {
    public static void main(String[] args){
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen üç basamaklı bir sayı giriniz");
        int number=scan.nextInt();
        int lastDigit=number%10;
        int totolOfDigit=lastDigit;

        number=number/10;
        lastDigit=number%10;
        totolOfDigit=totolOfDigit+lastDigit;

        number=number/10;
        lastDigit=number%10;
        totolOfDigit=totolOfDigit+lastDigit;

        System.out.println("basamakları degeri="+totolOfDigit);






    }
}
