package day_15_Week3_Rewiev;

import java.util.Scanner;

public class C05_Menü {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("et, sebze, çocuk menülerinden birini tercih edin :");
        int tercih= scan.nextInt();
        switch(tercih){
            case 1:
                System.out.println("pirzola mı tavuz mu");
                int tercih2= scan.nextInt();
                switch (tercih2){
                    case 1:
                        System.out.println("pirzola 50 tl");
                        break;
                    case 2:
                        System.out.println("tavuk 30 tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            case 2:
                System.out.println("pırasa mı ıspanak mu");
                int tercih3= scan.nextInt();
                switch (tercih3){
                    case 1:
                        System.out.println("pırasa 10 tl");
                        break;
                    case 2:
                        System.out.println("ıspanak 30 tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            default:
                System.out.println("hatalı giriş");
        }
    }
}
