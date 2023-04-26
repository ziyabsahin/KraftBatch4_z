package day_34_Arrays_4;

import java.util.Arrays;

public class C01_Anagram {
    public static void main(String[] args) {



    }
    // write a method that can check if str1 & str2 are build out same characters ANAGRAM
    public static boolean isAnagram(String str1,String str2){

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);



    }





}
