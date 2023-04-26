package day_33_Arrays_3;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {


// In a char[] write all of the alphabet in reversed order
        char[] alphabet;
        alphabet = new char[26];

        char ch='Z';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch--;
        }


        System.out.println(alphabet);
        System.out.println(Arrays.toString(alphabet));

        //bir array yazdırırken Arrays.toString metoduyla yazdıracagız
        //char array yazdırırken bu olmadan da yazdırabiliriz ama kullanmamaya calışacagız



    }
}