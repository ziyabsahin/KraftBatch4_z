package day_24_String_Class;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        System.out.println(bayramMesaji2());
    }
  /*  Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
    isteyin cümle içinde sev köküne sahip bir kelime var ise bir
    method what a lovely person(ne hoş bir insan) mesajı
    döndürsün.*/

    public static String bayramMesaji(){
        String resault="";
        Scanner scan=new Scanner(System.in);
        System.out.println("bayram mesajı :");
        String mesaj= scan.nextLine();
        for (int i = 0; i < mesaj.length(); i++) {
            if(mesaj.startsWith("sev")||mesaj.startsWith("Sev")){
                resault="ne hoş bir insan";
            }
            mesaj=mesaj.substring(i);

        }

        return resault;
    }
    public static String bayramMesaji2(){
        String resault="";
        Scanner scan=new Scanner(System.in);
        System.out.println("bayram mesajı :");
        String mesaj= scan.nextLine();
        System.out.println(mesaj.contains("sev"));

        return resault;
    }
}
