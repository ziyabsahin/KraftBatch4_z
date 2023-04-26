package day_32_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class HW {
//Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean length5(int[] arr){
        return arr.length>5;


    }
//Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.
    public static boolean icindeBesVarMi(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==5){
                return true;
            }

        }
        return false;
    }
//Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.
    public static boolean ilkElemanlar(int[] arr1,int[] arr2){
        return arr1[1]==arr2[0];
    }
//Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    public static String[] ikiArrayBirlestir(String arr1[],String arr2[]){
        String[] yeniArray=new String[arr1.length+arr2.length];
        int x=0;
        for (int i = 0; i < yeniArray.length; i++) {
            if(i<arr1.length){
                yeniArray[i]=arr1[i];
            } else{
                yeniArray[i]=arr2[x];

                x++;
            }


        }
        return yeniArray;
    }
//İnt arry in en büyük elemanının döndüren bir method yazın

    public static int enBuyukEleman(int[] arr){

        int result=arr[0];
        for (int i:arr) {

            if(i>result){
                result=i;
            }

        }
        return result;
    }

//Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static String[] ilkVeSonYerDegistir(String[] arr)
    {String a=arr[arr.length-1];
        arr[arr.length-1]=arr[0];
        arr[0]=a;
        return arr;
    }


//2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.
    public static int[] yeniArrayOlustur(int[] arr1,int[] arr2){
        int[] yeniArray=new int[2];
        yeniArray[0]=arr1[0];
        yeniArray[1]=arr2[0];
        return yeniArray;
    }
//Int array in elemanlarının toplamını veren bir method yazın
    public static int arrayToplam(int[] arr){
        int sum=0;
        for (int x:arr) {
            sum+=x;
        }
        return sum;
    }

//Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static String[] terstenArrayOlustur(String[] arr){
        String yeniArray[]=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[arr.length-i-1];

        }
        return yeniArray;

    }
//Bir methodla verilen array ın teksayı indexinde ngbulunan elemanların toplamını alın.
public static void main(String[] args) {
    int[] arr={2,3,4,5,61,9};
    String arr2[]=new String[6];
    arr2[0]="merhaba";
    arr2[1]="iyi";
    arr2[2]="nasılsın";
    arr2[5]="hey";
    System.out.println(Arrays.toString(arrayOlustur()));


}
    public static int tekSayiToplam(int[] arr){
        int sum=0;
        for (int x:arr){
            if (x%2!=0){
                sum+=x;
            }
        }
        return sum;
    }
//İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.
    public static int[] toplamCarpim(int[] arr){
        int[] yeniArray=new int[2];
        int toplam=0;
        int carpim=1;
        for (int x:arr){
            toplam+=x;
            carpim*=x;
        }
        yeniArray[0]=toplam;
        yeniArray[1]=carpim;
        return yeniArray;
    }



//Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
//bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun.
public static String[] arrayOlustur(){
    Scanner scan=new Scanner(System.in);
    System.out.println("arrayin length =");
    int x=scan.nextInt();
    scan.nextLine();

    String[] yeniArray=new String[x];
    for (int i = 0; i < x; i++) {
        System.out.println(i+1+" elemanı girin :");
        yeniArray[i]=scan.nextLine();



    }
    return yeniArray;
}



}
