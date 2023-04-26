package day_33_Arrays_3;

import java.util.Arrays;

public class C03_Methods_Task {

    //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//element olacak şekilde bir array a dönüştüren bir method yazın.

    public static String[] stringToArray1(String str){
        return str.split(" ");
    }

    public static String[] stringToArray2(String str){
        String[] newStr=str.split(" ");
        for (int i = 0; i < newStr.length; i++) {
            if(newStr[i].length()<5){
                newStr[i]="armut";
            }
        }
        return newStr;

    }


}
