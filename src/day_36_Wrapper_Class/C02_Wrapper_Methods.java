package day_36_Wrapper_Class;

import java.util.Arrays;

public class C02_Wrapper_Methods {
    public static void main(String[] args) {
        //valueOf() int ve string alıyor, çağrıldıgı metoda göre deger oluşturuyor
        String s="123";
        System.out.println(s+5);
        int x=Integer.valueOf(s);
        System.out.println(x+5);


        //parseInt() parametre olarak String alıyor ama int döndürüyor
        //valueOf ise Integer döndürüyor
        int z=Integer.parseInt(s);


        //typeValue() int olarak döndürüyor

//        String str="bugün hava 50 derece";
//        System.out.println(str);
//        String[] strArr=str.split(" ");
//        int derece=Integer.parseInt(strArr[2]);
//        int result=derece+10;
//        String str2=String.valueOf(result);
//        strArr[2]=str2;
//        System.out.println(Arrays.toString(strArr).replace(",","").replace("[","").replace("]",""));


        String str="Alinin dogum yılı 1996";
        String[] strArr=str.split(" ");
        int dogum=Integer.parseInt(strArr[3]);
        int yas=2023-dogum+10;
        String str2=String.valueOf(yas);
        String[] strArr2=new String[4];
        strArr2[0]="Ali";
        strArr2[1]=str2;
        strArr2[2]="yasında";
        strArr2[3]="olur";
        System.out.println(Arrays.toString(strArr2).replace(",","").
                replace("[","").replace("]",""));


//        String str3="merhaba 234 nasıl 341 okul094";
//        char[] atr3Arr=str3.toCharArray();
//        int sum=0;
//        for (int i = 0; i < atr3Arr.length; i++) {
//            if(Character.isDigit(atr3Arr[i])){
//              int num=Integer.parseInt(atr3Arr[i]);
//            }
//        }
//        System.out.println(sum);

        String str21 ="|''11'>>///M++>,,_//e%%&/'-&&r//%<>/)h>%//'9a+%^^^((b><###a678* +%&&/))<+J>>>" +
                ">56a##v||;;;a~>>> 4500001<<İ##n--//+%^^s>><<|478a12%%n" +
                "*-<<|>>012345l679--a**//##++34r``~~((ı[234]+||";
        String harfler="";
        String rakamlar="";
        String karakterler="";




        for (int i = 0,j=0; i < str21.length(); i++) {
            if(Character.isDigit(str21.charAt(i))){
                rakamlar+=str21.charAt(i);
            }
        }
       String[] rakamlarArr=rakamlar.split("");
        int[] sayilarArr=new int[rakamlarArr.length];
        for (int i = 0; i < sayilarArr.length; i++) {
            sayilarArr[i]=Integer.parseInt(rakamlarArr[i]);
        }
        System.out.println(Arrays.toString(sayilarArr));


    }
}
