package day_15_Week3_Rewiev;

import java.util.Scanner;

public class C06_For_Loops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //döngüler birbirlerinin yerine kullanılabilir ancak
        //kullanım amaçları farklı
        //belirli sayıda dönecegini biliyorsak for
        //bilmiyorsak while
        //bilmiyorsak ve kullanıcıya bir kere döngüyü sunmak için do while
        //if gibi çalışıyorlar condition dogru oldugu sürece çalışır

        for(int i=0;i<5;i++) {
            System.out.println("merhaba");
        }
        int sifre=56;
        int a=0;
        while(a<3){
            System.out.println("şifre :");
            int tahmin=scan.nextInt();
            if(sifre==tahmin){
                System.out.println("sifre dogru");
                break;


            } else{
                System.out.println("sifre yanlıs");
            } a++;

        }


    }
}
