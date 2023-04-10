package day_29_FullReview;

public class String_Exam {


//    contain() kullanmadan contain metodunu yazınız?
//    (2 kelime alan ve 2.kelimenin ilk kelimenin içinde olup olmadığını kontrol eden)
public static boolean contain(String str1,String str2){
    boolean result=false;
    for (int i = 0; i <str1.length() ; i++) {
        if(str1.substring(i).startsWith(str2)){
            result=true;
            break;
        }
    }
    return result;
}

//    Girilen bir sayının Binary olup olmadığını bulan bir metot yazın. 110 true  112 false

    public static boolean binary(int x){


        while(x>0){
            if(x%10==1||x%10==0){
                return true;
            }
            x=x/10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(binary(8));
    }

//    girilen 2 adet sayının EBOB'unu bulan bir metot yazınız (en büyük ortak bölen)
 public static int ebob(int x,int y){
    int z=0;
     for (int i =Math.min(x,y); i >0 ; i--) {
         if(x%i==0&&y%i==0){
             z=i;
             break;
         }

     }   return z;
 }


//    girilen 2 adet sayının EKOK'unu bulan bir metot yazınız (en küçük ortak kat)

    public static int ekok(int x,int y){
        int z=0;
        for (int i =Math.max(x,y); i >0 ; i++) {
            if(i%x==0&&i%y==0){
                z=i;
                break;
            }

        }   return z;
    }



//isEmpty() metodunu kullanmadan girilen bir değerin boş (null değil) olup olmaduğunu kontrol eden bir motot yazınız?
public static boolean isEmpty(String str){
    boolean bl=false;
    if(str.length()>0&&str.replace(" ","").length()==0){
        bl=true;
    }

    return bl;
}



}
