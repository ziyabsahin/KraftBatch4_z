package day_23_String_Class;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {

        kelimeKarsılastır();



    }
    //Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
     //2. kelimede varsa index ini alın.
    public static void kelimeKarsılastır(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime 1:");
        String kelime1= scan.nextLine();
        System.out.println("kelime 2:");
        String kelime2= scan.nextLine();
        System.out.println(kelime2.indexOf(kelime1.charAt(0)));
    }


}
