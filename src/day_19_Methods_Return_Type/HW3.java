package day_19_Methods_Return_Type;

public class HW3 {
    public static void main(String[] args) {
       armstrong();

    }

   /* 100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın. Sayının her
    basamağının küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak
    adlandırılır.*/

    public static void armstrong(){
       int deger=0;
       int a;


        for (int i = 111; i <1000 ; i++) {
            a=i;
            for (int j = 3; j > 0; j--) {

           deger=i%10*i%10*i%10;
           i=i/10;
           deger+=deger;  }


            deger+=deger;
            if(a==deger){
                System.out.println(a);}


        }







    }
}
