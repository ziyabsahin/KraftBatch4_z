package day_33_Arrays_3;

import java.util.Arrays;

public class HW {


   //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //element olacak şekilde bir array a dönüştüren bir method yazın.
    public static String[] stringsToArray(String str){
        return str.split(" ");
    }
    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]
    public static int[] intToArray(int n){
        int[] numArray=new int[n];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i]=i;

        }
        return numArray;
    }
    //«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //varsa onun yerine armut atayın.

    public static String[] StringToArray(String str){
        String[] newArray=str.split(", ");
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i].length()<5){
                newArray[i]="armut";
            }

        }
        return newArray;
    }

    //«elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.
    public static String[] newArraySwap(String str){
        String[] newArray=str.split(", ");
        String str1=newArray[0];
        newArray[0]=newArray[newArray.length-1];
        newArray[newArray.length-1]=str1;
        return newArray;
    }
    //«merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
    //harflerinden bir döndüren method yazın.
    public static char[] ikinciKelimeyiDöndür(String str){
        String[] newArray=str.split(" ");
        char[] charArray=newArray[1].toCharArray();
        return charArray;

    }


    //Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    public static int aritmeticOrtalama(int[] dizi){
        Arrays.sort(dizi);
        int ortalama=(dizi[0]+dizi[dizi.length-1])/2;
        return ortalama;

    }
    //Bir sayı dizisinin en küçük harfi ne ise sayı dizisini onunla dolduran bir
    //method yazın.
    public static int[] sayiDizisi(int sayi[]){
        Arrays.sort(sayi);
        Arrays.fill(sayi,1,sayi.length-1,sayi[0]);
        return sayi;
    }
    //Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
    //onunla dolduran bir method yazın.
    public static int[] sayiDizisi2(int sayi[]){
        Arrays.sort(sayi);
        Arrays.fill(sayi,1,sayi.length-2,sayi[0]);
        return sayi;

    }
//«merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
    //insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.

    public static String[][] splitArray(String str){

        String[] strArr=str.split(" ");

     String[] strArr1=Arrays.copyOfRange(strArr,0,3);
     String[] strArr2=Arrays.copyOfRange(strArr,3,5);
        String[][] twoArray=new String[2][];
       twoArray[0]=strArr1;
       twoArray[1]=strArr2;
       return twoArray;


    }



    public static void main(String[] args) {
        String str="merhaba java insanları bugün nasılsınız";


        System.out.println(Arrays.deepToString(splitArray(str)));
      /*  for (int i = 0, j=0; i < arr.length; i++) {
            if(i<arr.length/2){
                newarr1[i]=arr[i];
            }else{
                newarr2[j]=arr[i];
                j++;
            }*/

        System.out.println(ikinciKelimeyiDöndür(str));

    }


    }


