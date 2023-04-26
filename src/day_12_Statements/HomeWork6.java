package day_12_Statements;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Otelimize Hoş Geldiniz");
        System.out.print("otelimizi tanımak için 1-2-3 kat numaralarından birini saçiniz : ");
        int kat= scan.nextInt();

        switch (kat){
            case 1:
                System.out.println("oda hizmeteleri, güvenlik ve resepsiyon bulunmaktadır");
                System.out.println("oda hizmeteleri için 1, güvenlik için 2 ve resepsiyon için 3ü giriniz");
                int first= scan.nextInt();
                switch (first){
                    case 1:
                        System.out.println(" temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    case 2:
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case 3:
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    default:
                        System.out.println("hatalı seçim yaptınız");
                }
                break;


            case 2:

                System.out.println(" Yemekhane-Dinlenme salonu-Room1-Room2 bulunmaktadır");
                System.out.println("yemekhane için 1, dinlenme salonu için 2 ve Room1 ve Room2 için 3ü giriniz");
                int second= scan.nextInt();
                switch (second){
            case 1:
                System.out.println(": Kahvaltı 08-11\n" +
                        "Öğle yemeği 12-15\n" +
                        "Akşam yemeği 18-21");
                break;
                    case 2:
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case 3:
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("hatalı giriş yaptınız");
                }
                break;



            case 3:
                System.out.println(": Room3-Room4-Room5-Room6 bulunmaktadır");
                System.out.println("Room3 ve 4 için 1i room5 ve 6 için 2 yi seçiniz");
                int third= scan.nextInt();
                switch (third){
                    case 1:
                        System.out.println(" standart oda");
                        break;
                    case 2:
                        System.out.println(": özel oda");
                        break;
                    default:
                        System.out.println("hatalı giriş yaptınız");
                }
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
        }

        System.out.println("otelimize bekleriz");



    }
}
