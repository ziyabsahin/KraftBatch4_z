package day_11_Control_Flow_Statement_If;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args){

        //Bir program yazın
// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
// 2 veya 3 farklı yol ile çözmeye çalışın


        System.out.println("lütfen sayı giriniz");
        System.out.print("a :");
                Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.print("b :");
        int b= scan.nextInt();
        System.out.print("c :");
        int c= scan.nextInt();

     /*   if(a>b&&a>c){
            System.out.println(a); }
        else if (b>a&&b>c){
            System.out.println(b);
        } else{
            System.out.println(c);
        }*/
       /* if(Math.max(a,b)<c){
            System.out.print(c);
        } else if (Math.max(a,c)<b){
            System.out.print(b);
        } else{
            System.out.print(a);
        }*/
       /* if (b<a&&a>c){
            System.out.println(a);
        } else if (a<b&&b>c){
            System.out.println(b);
        }  else {
            System.out.println(c);
        }*/
        int enBuyukSayi=(Math.max(a,Math.max(b,c)));
        System.out.println("büyük sayi :"+enBuyukSayi);







        }







    }

