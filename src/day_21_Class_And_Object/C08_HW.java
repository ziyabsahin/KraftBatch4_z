package day_21_Class_And_Object;

import java.util.Scanner;

public class C08_HW {
    public static void main(String[] args) {
        tekVeCiftSayilarTolami();



    }
   /* Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
    girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
    tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
    yazınız.*/

public static void tekVeCiftSayilarTolami(){
    Scanner scan=new Scanner(System.in);
    System.out.println("sayi :");
    int sayi= scan.nextInt();
    int num=0;
    int num1=0;
    for (int i =0; i <=sayi ; i++) {
        if(i%2==0){
            num+=i;
        } else{
            num1+=i;
        }


    }
    System.out.println("tek sayilar :"+num1);
    System.out.println("çift sayilar :"+num);
}






}
