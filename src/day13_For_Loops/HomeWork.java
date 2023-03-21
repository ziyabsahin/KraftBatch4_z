package day13_For_Loops;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("parolayı giriniz :");


        String parola="şafak";
        int hak=3;
        for(int i=1;i<=3;i++){
            String tahmin= scan.nextLine();
            if (parola.equals(tahmin)){

                System.out.println("tebrikler");
                break;
            } else{
                System.out.println("kalan hakkınız :"+(hak-i));
            }
        }
    }
}
