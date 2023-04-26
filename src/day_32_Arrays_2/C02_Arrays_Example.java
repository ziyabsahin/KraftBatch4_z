package day_32_Arrays_2;

import java.util.Scanner;

public class C02_Arrays_Example {

    public static void main(String[] args) {
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

        System.out.println("hangi kelimeyi istersiz :");
        int num= scan.nextInt();
        switch (num){
            case 1:
                System.out.println( array[0]);
                break;
            case 2:
                System.out.println( array[1]);
                break;
            case 3:
                System.out.println( array[2]);
                break;
            default:
                System.out.println("hatalı giriş");

        }

    }




}
