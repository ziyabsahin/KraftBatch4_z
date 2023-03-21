package day_14_NestedWhileDoWhile;

import java.util.Scanner;

public class C06_While_Loop_İntro {
    public static void main(String[] args) {
        //parolayı tahmin et
        Scanner scan=new Scanner(System.in);
        String parola="şafak";
        String tahmin="";
        int hak=3;
        System.out.println("parola :");
        while(hak>0){
            tahmin=scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("tebrikler");
                break;
            } else{
                System.out.println("yanlış"+(--hak));
            }
        }

    }
}
