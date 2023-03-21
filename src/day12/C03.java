package day12;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("yasınız :");
        int yas = scan.nextInt();

        if (yas >= 18) {

            System.out.println("yanınızda bayan var mı?");
            String cevap = scan.next();
            if (cevap.equals("evet")) {
                System.out.println("yüzme biliyor musunuz?");
                String yüzme = scan.next();
                if (yüzme.equals("evet")) {
                    System.out.println("hoş geldiniz");
                } else {
                    System.out.println("giremezsiniz");
                }
            }
         else {
            System.out.println("giremezsiniz");
        } } else {
            System.out.println("giremezsiniz");

        }
    } }







