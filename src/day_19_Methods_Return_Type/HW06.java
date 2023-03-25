package day_19_Methods_Return_Type;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        System.out.println(yildiz(3));

    }
    //Kullanıcıdan satır sayısı alan ve bu satır sayısına göre * (yıldızlar) lardan üçgen oluşturan metodu
    //yazınız? yildizUcgeni(3)

    public static String yildiz(int a){
        String yildiz="*";

        for (int i = a; i>0 ; i--) {
            for (int j = 1; j<0 ; j++) {
                System.out.print(" ");

            } for(int k=a+1-i;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
            a--;
        }



        return yildiz;
    }
}
