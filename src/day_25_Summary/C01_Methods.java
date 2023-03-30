package day_25_Summary;

import java.util.Scanner;

public class C01_Methods {
    public static void main(String[] args) {
        System.out.println(sondeger("merhaba"));


    }
    //static metodlarda static olmayan metodları kullanmayız
    public static char sondeger(String str){
        char result=' ';
        for (int i = 0; i < str.length(); i++) {
            result=str.charAt(i);

        }
        return result;
    }
}
