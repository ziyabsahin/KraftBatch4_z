package day_24_String_Class;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        sifreKontrol();

    }
 /*   lanıcıdan userName ve password isteyen bir method
    yazın. Method aşağıdaki şartları kontrol etsin.
    Password ve username alanı boş olamaz.
    Password alanı boş olamaz
    Password 8 karakterden az olamaz.
            Username 3 karakterden az olamaz. (ödev)*/
    public static void sifreKontrol(){
        Scanner scan=new Scanner(System.in);
        System.out.println("user name :");
        String userName=scan.nextLine();
        System.out.println("parola :");
        String paralo=scan.nextLine();
        if((userName.indexOf(" ")==-1)&&(paralo.indexOf(" ")==-1)){
            if((userName.length()>=3)&&(paralo.length()>=8)){
                System.out.println("başarıyla oluşturuldu");

            } else {
                System.out.println("parola 8, username 3 karakterden az olamaz");

            }
        } else{
            System.out.println("boşluk olamaz");
        }

    }
}
