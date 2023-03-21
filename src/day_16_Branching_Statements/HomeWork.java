package day_16_Branching_Statements;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3



        boolean a=true;
        int money=2000;
      outher: while(a){
          System.out.println("para yatırmak için 1, hesabınızı görmek için 2, para çekmek için3, çıkış için 4");
          int tercih= scan.nextInt();

               inner1: while (tercih==1){
                System.out.println("yatırmak istediğiniz miktar :");
                int yatan= scan.nextInt();
                money+=yatan;
                System.out.println("hesabınızdaki para ="+money);
                System.out.println("işleme devam etmek içi 1 üst menü için 2 ye kart iade için 3 basın");
                int tercih1= scan.nextInt();
                if(tercih1==1)
                { continue; }
                else if (tercih1==2){
                   break ;

                  } else if(tercih1==3){
                    break outher;
                }else{
                    System.out.println("hatalı tercih");
                    break outher;
                }}
               inner2: while (tercih==2){
                   System.out.println("hesap ="+money);



                   System.out.println("işleme devam etmek içi 1 üst menü için 2 ye kart iade için 3 basın");
                   int tercih2= scan.nextInt();
                   if(tercih2==1)
                   { continue inner2; }
                   else if (tercih2==2){
                       continue outher;

                   } else if(tercih2==3){
                       break outher;
                   }else{
                       System.out.println("hatalı tercih");
                       break;
                   }

               }
          inner3: while (tercih==3){
              System.out.println("çekmek istediginiz miktar :");
              int cekilen=scan.nextInt();
              money-=cekilen;
              System.out.println("hesabınız :"+money);
              System.out.println("işleme devam etmek içi 1 üst menü için 2 ye kart iade için 3 basın");
              int tercih3= scan.nextInt();
              if(tercih3==1)
              { continue inner3; }
              else if (tercih3==2){
                 continue outher;

              } else if(tercih3==3){
                  break outher;
              }else{
                  System.out.println("hatalı tercih");
                  break;
              }

          }
          inner4: while (tercih==4){


              System.out.println("hoşçakalın ");
              break outher;

          }



                }

            }
        }




