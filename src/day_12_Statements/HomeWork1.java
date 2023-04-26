package day_12_Statements;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int num=50;
        System.out.print("Sayıyı tahmin ediniz :");
        int tahmin=scan.nextInt();

        if(tahmin<num){
            if(tahmin>(num/2)){
                System.out.println("cevaba yaklaştınız");
            } else {
                System.out.println("tahminiz cevaptan çok uzak");
            }} else if(tahmin>num){
                if(tahmin>=(num+10)){
                    System.out.println("tahmininiz sayıdan cok büyük");
                }    else{
                    System.out.println("tahmininiz sayıya cok yakın");
                }
        } else{
                System.out.println("tebrikler bildiniz");}
        }


    }

