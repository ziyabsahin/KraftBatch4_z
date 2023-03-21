package day08_ScannerAndOperatiors;
import java.util.Scanner;

public class Example_Scanner {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik=");
        int matematik= scan.nextInt();
        System.out.print("Fizik=");
        int fizik=scan.nextInt();
        System.out.print("Kimya=");
        int kimya=scan.nextInt();
        scan.nextLine();
        System.out.print("isim =");
        String isim=scan.nextLine();
        System.out.print("yas=");
        int yas=scan.nextInt();
        double ort=((double) matematik+fizik+kimya)/3;
        System.out.print("isim="+isim+"\nyas="+yas+"\nmatematik="+matematik+
                "\nfizik="+fizik+"\nkimya="+kimya+"\nortalama="+ort);


    }
}
