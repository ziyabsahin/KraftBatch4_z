package day_13_For_Loops;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yazdırmak istediğiniz kelimeyi yazınız");
        String word= scan.nextLine();
        System.out.println("kaç kere yazdırmak istersiniz :");
        int sayi=scan.nextInt();
        for( int i=1;i<=sayi;i++){
            System.out.println(word);
        }
    }
}
