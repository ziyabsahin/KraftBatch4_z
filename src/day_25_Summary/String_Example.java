package day_25_Summary;

import java.util.Scanner;

public class String_Example {
    public static void main(String[] args) {
        System.out.println(kelime());

    }
    public static String kelime(){
        String resault="";
        Scanner scan=new Scanner(System.in);

            System.out.println("ilk kelime:");
            String str1=scan.nextLine();
            System.out.println("ikinci kelime:");
            String str2=scan.nextLine();

            if (str1.equals(str2)) {
                System.out.println("kelimler aynı");
                return resault;
            } else if(str1.length()==str2.length()){
                System.out.println("kelimlerin uzunlugu aynı");
                return resault;
            }else{
                System.out.println("başa dönün");
                kelime();


            }
            return resault;

    }}

