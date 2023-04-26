package day_32_Arrays_2;

import java.util.Arrays;

public class C03_ArraysToString {

    public static void main(String[] args) {
        String arr[]=new String[4];
        arr[0]="merhaba";
        arr[1]="nasılsın";
        arr[2]="harun";
        arr[3]="celal";
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayToString(arr));

    }

    public static String arrayToString(String[] array){

        String result="[";
        for (int i = 0; i < array.length; i++) {
            if(i!= array.length-1){
            result+=array[i]+", ";}
            else{
                result+=array[i];
            }

        }
        result+="]";
        return result;
    }




}
