package day13_For_Loops;

import java.util.Scanner;

public class C02_Switch_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("harf giriniz");
        char harf=scan.next().charAt(0); //charAt metodu kelimenin bir harfini almak için kullanıyoruz

       if (harf=='p'||harf=='P'){
            System.out.println("pazar, pazartesi, perşembe");
        } else if(harf=='s'||harf=='S'){
            System.out.println("salı");
        }else if(harf=='c'||harf=='C'){
            System.out.println("çarşamba, cuma, cumartesi");
        }
        else{
            System.out.println("hatalı");
        }

        System.out.println("---------------------------------");


      switch(harf){
            case 'p','P':
                System.out.println("pazartesi,perşembe,pazar");
                break;
            case 's','S':
                    System.out.println("salı");
                    break;
            case 'c','C':
                System.out.println("çarşamba, cuma,cumartesi");
                break;
            default:
                System.out.println("hatalı giriş"); }


               System.out.println("---------------------------------------");


               String resault=(harf=='p'||harf=='P') ? "pazartesi, perşembe,pazar":(harf=='s'||harf=='S')?"salı":(harf=='c'||harf=='C')?"çarsamba,cuma,cumartesi":"hatalı giriş";
                System.out.println(resault);







    }}

