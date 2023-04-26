package day_34_Arrays_4;

import java.util.Arrays;
import java.util.Random;

public class Arrays_Labs {

    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int arraySum(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    //Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.
    public static int arrayCiftSayiToplam(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız

    public static int arrayUcleriTopla(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i==3){
                sum+=i;
            }
        }
        return sum;
    }
    //Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. (Arrays.sort
    //kullanılmayacak)

    public static int[] arraysMaxMin(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i : arr) {
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }


        }
        int[] maxMin={max,min};
        return maxMin;
    }


    //Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
    //Arrays.fill kullanılmayacak)
    //[1,2,-8,-9] [-9,-9,-9,-9]
    public static int[] enKucuguAta(int[] arr){
        int min=arr[0];
        for (int i : arr) {
            if(i<min){
                min=i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=min;
        }
        return arr;
    }


    //Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    //createArray(8,15) → [8,9,10,11,12,13,14,15]

    public static int[] intArrayOlustur(int x,int y){
        int baslangıc=0;
        int bitis=0;
        if(x>y){
            baslangıc=y;
            bitis=x;
        }else{
            baslangıc=x;
            bitis=y;
        }
        int[] arr=new int[bitis-baslangıc+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=baslangıc+i;

        }
        return arr;
    }


    //Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
    //oluşturan metodu yazınız.
    //[1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]
    public static int[] ikiArrayiBirlestir(int[] arr1,int[] arr2){
        int[] result=new int[arr1.length+arr2.length];
        for (int i = 0, j=0; i < result.length; i++) {
            if(i< arr1.length){
                result[i]=arr1[i];
            }else{
                result[i]=arr2[j];
                j++;

            }

        }
        return result;
    }

    public static boolean ikiArrayKontrol(int[] arr1,int[] arr2){

        int[] arr3=new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    arr1[i]=arr3[i];
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr3[i]){
                return false;

            }
        }

        return true;
    }
//Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
//[5,4,3,2,1] -----------> [1,2,3,4,5]

    public static int[] tersCevir(int[] arr){
        int[] result=new int[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--) {
            result[j]=arr[i];
            j++;
        }


        return result;
    }



//Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
//rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
public static int[][] randomArray(){
    Random random=new Random();
    int[][] arr=new int[10][10];
    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr.length; j++) {
            arr[i][j]=random.nextInt(100);
        }
    }
    return arr;
}
//Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
//arasında rasgele sayılar atayı
public static int[][] randomArray2(){
    Random random=new Random();
    int[][] arr=new int[50][10];
    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j <arr[i].length; j++) {
            arr[i][j]=random.nextInt(50,80);

        }

    }
    return arr;
}

//Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
//arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
public static int randomArray3(){
        int sum=0;
    Random random=new Random();
    int[][] arr=new int[50][10];
    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j <arr[i].length; j++) {
            arr[i][j]=random.nextInt(120,140);
            if(arr[i][j]==125){
                sum++;
            }

        }

    }

    return sum;
}

//Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
//arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
//(Array.sort kullanılmayacak)


    public static int randomArrayEnbuyukIkinci(){

        Random random=new Random();
        int[][] arr=new int[50][10];
        int max=120;
        int maxTwo=120;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j]=random.nextInt(120,140);
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }


        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {


                if(arr[i][j]>maxTwo&&arr[i][j]!=max){
                    maxTwo=arr[i][j];
                }

            }


        }

        return maxTwo;
    }

    //Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
    //[2,3,3,4,5,6,5,6,3] → true
    //[2,4,5,8,8] → false
    //[1,2,3] → true
    //[1,2] → false
    public static boolean ardArdaUcSayi(int[] arr){
        boolean result=false;
        for (int i=0;i<arr.length-2;i++){
            if((arr[i]+1)==(arr[i+1])&&(arr[i]+2)==(arr[i+2])){
                return true;
            }
        }
        return result;
    }

    //Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
    //yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
    //[2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
    //[2,2,5,8,8] →5
    //[2,2,3] → 3
    //[1,2] → 1,2
    public static int[] yalnizSayi(int[] arr){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(i==0&&arr[i]!=arr[i+1]){
                sum++;
            } else if(i<arr.length-1&&arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                sum++;
            } else if(i==arr.length-1&&arr[i]!=arr[i-1]){
                sum++;
            }
        }
        int[] yalnizSayi=new int[sum];
        for (int i = 0,j=0; i < arr.length; i++) {
            if(i==0&&arr[i]!=arr[i+1]){
                yalnizSayi[j]=arr[i];
                j++;
            } else if(i<arr.length-1&&arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                yalnizSayi[j]=arr[i];
                j++;
            } else if(i==arr.length-1&&arr[i]!=arr[i-1]){
                yalnizSayi[j]=arr[i];
                j++;
            }
        }
        return yalnizSayi;
    }



    //Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
    //birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
    //[2,3,3,3,6,6,5,6,3] → 3
    //[2,4,5,8,8] → 8
    //[2,4,5,8] → -1

    public static int enCokSayiyiBul(int[] arr){
        int result=-1;
        int sum=0;
        int max=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    sum++;
                }
            }
            if(sum>max){
                result=arr[i];
                max=sum;
            }
            sum=0;

        }
        return result;
    }

    //Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
    //[1,2,8,1] true
    //[25,89,78,98] false

    public static boolean dublicate(int[] arr){
        boolean result=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j&&arr[i]==arr[j]){
                    result=true;
                }
            }
        }
        return result;
    }

    //Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
    //dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
    //sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
    //üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
    //harfi vardır. (Büyük ve küçük ihmal edilecek)

    public static int harfSayisiBulma(String str,String ch){

        String[] arr=str.toLowerCase().split("");
        ch=ch.toLowerCase();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(ch)){
                sum++;
            }
        }
        return sum;

    }

    //Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
    //yazınız.
    //araba ile yola çıktık fakat araba arıza yaptı true
    //araba ile yola çıktık fakat arıza yaptı false

    public static boolean dublicateKelime(String str){
        boolean result=false;
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if(k!=i&&arr[i].equals(arr[k])){
                    result=true;
                }
            }
        }
        return result;
    }

    //Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
    //indekslere 0 atayan metodu yazınız.
    //[5,7,1,9] [1,0,0,0]

    public static int[] enkucuguBul(int[] arr){
        int[] newArr=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(newArr);
        Arrays.fill(newArr,1,newArr.length,0);
        return newArr;
    }
    //Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
    //[6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
    //[5,7,8,5,9] → [5,7,8,5,9]

    public static int[] bestenSonraSekiz(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==5&&arr[i+1]==8){
                arr[i+1]=1;
            }
        }
        return arr;
    }
    //?Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
    //[21,7,29,12] ----→ 7 29



    public static int[] asalSayiBul(int[] arr){
        int sum=0;

    out:  for (int i=0;i<arr.length;i++){
            for (int j = 2; j < arr[i]; j++) {
                if(arr[i]%j==0){


                    continue out;
                }
            } if(arr[i]>=2){


            sum++;
            }

        }
        int[] asalSayilar=new int[sum];

       out2: for (int i=0,k=0;i<arr.length;i++){
            for (int j = 2; j < arr[i]; j++) {
                if(arr[i]%j==0){
                    continue out2;

                }
            } if(arr[i]>=2) {


               asalSayilar[k] = arr[i];
               k++;
           }

        }
        return asalSayilar;

    }
    //Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
    //[21,7,29,12] ----→ [7,12,21,29]
    public static int[] sort(int[] arr){
        int[] newArr=new int[arr.length];
        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if(arr[j]>max){
                    max=arr[j];
                }
                if(arr[j]<min){
                    min=arr[j];
                }


            }
            newArr[i]=min;

            for (int k = 0; k < newArr.length; k++) {
                if(arr[k]==min){
                    arr[k]=max;
                    break;
                }
            }
            min=max;


        }
        return newArr;
    }


    //Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
    //toplamını veren metodu yazınız.
    //[1,1,2,3] → 5
    //[2,5,5,5,9] →11
    //[5,5,5,5,9] →9
    //[5,5,5,5,5] →0
    //[5,1,5,1,5] →17
    public static int dublicateHaricToplam(int[] arr){
        int result=0;
        out:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j&&arr[i]==arr[j]){

                    continue out;
                }
            }result+=arr[i];
        }
        return result;
    }
    //Örnek 25:Array’in içerisindeki sayıların toplamını veren fakat 5 ile 9 dahil arasındaki sayıları
    //toplama dahil etmeyin.
    //[1,5,9,3] → 4
    //[2,5,28,36,9] →2
    //[5,3,9,11,9] →20
    //[5,5,5,5,9] →0
    //[5,9,5,1,9] →0

    public static int toplam(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=5&&arr[i]<=9){
                continue;
            }
            sum+=arr[i];
        }
        return sum;
    }
    //Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
    //[5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]

    public static int[] birleriSagaTasi(int[] arr){
        int[] newArr=new int[arr.length];
        for (int i = 0,j=0,k=arr.length-1; i < arr.length; i++) {
            if(arr[i]!=1){
                newArr[j]=arr[i];
                j++;
            } else{
                newArr[k]=arr[i];
                k--;
            }
        }

        return newArr;
    }





}
