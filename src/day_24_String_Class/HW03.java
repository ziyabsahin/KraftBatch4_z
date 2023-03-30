package day_24_String_Class;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
       // Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.print("mesaj :");
        String mesaj=scan.nextLine();
        for (int i = 0; i < mesaj.length(); i++) {
            switch (mesaj.charAt(i)){
                case 'a':
                    System.out.print("a, ");
                    break;
                case 'e':
                    System.out.print("e, ");
                    break;
                case 'ı':
                    System.out.print("ı, ");
                    break;
                case 'i':
                    System.out.print("a, ");
                    break;
                case 'o':
                    System.out.print("o, ");
                    break;
                case 'ö':
                    System.out.print("ö, ");
                    break;
                case 'u':
                    System.out.print("u, ");
                    break;
                case 'ü':
                    System.out.print("ü, ");
                    break;

            }

        }

    }
}
