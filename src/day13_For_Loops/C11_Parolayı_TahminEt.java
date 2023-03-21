package day13_For_Loops;

import java.util.Scanner;

public class C11_Parolayı_TahminEt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String parola="safak";
        String tahmin="";
        int hak=3;
        System.out.println("parolayı tahmin ediniz(3 hakkınız var) :");
        for(int i=1;i<=3;i++){
            tahmin= scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("tebrikler");
                break;
            }else{
                System.out.println("parola yanlış. kalan hakkınız :"+(hak-i));
            }
        }



    }
}
