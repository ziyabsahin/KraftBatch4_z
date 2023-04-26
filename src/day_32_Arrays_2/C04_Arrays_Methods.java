package day_32_Arrays_2;

import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {
        System.out.println(kelimeDepola()[1]);


    }
    public static String[] kelimeDepola(){
        Scanner scan=new Scanner(System.in);
        String[] array=new String[3];
        System.out.println("kelime 1");
        String kelime1=scan.nextLine();
        array[0]=kelime1;
        System.out.println("kelime 2");
        String kelime2=scan.nextLine();
        array[1]=kelime2;
        System.out.println("kelime 3");
        String kelime3=scan.nextLine();
        array[2]=kelime3;
        return array;
    }


}
