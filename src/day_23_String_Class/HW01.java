package day_23_String_Class;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        //Konsoldan kullanıcıdan bir mesaj alın ve method onun karakter sayısını versin.
        System.out.println(mesaj("merhaba"));
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime :");
        String kelime=scan.nextLine();
        System.out.println("kelime.length() = " + kelime.length());
        System.out.println("-------------------------------");

        String name="ziya";
        String lastname="büyükşahin";
        System.out.println("name.length() = " + name.length());
        System.out.println("lastname.length() = " + lastname.length());
    }


    public static int mesaj(String str){
        return str.length();
    }
}
