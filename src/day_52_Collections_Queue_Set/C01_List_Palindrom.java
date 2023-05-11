package day_52_Collections_Queue_Set;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class C01_List_Palindrom {
    //list içerisinde bulunan palindrom (terside kendisi ile ayni olan kelimeler)
    // kelimeleri ekrana yazdıran metodu yazınız.
    //kaşık,adanada,kazak,radar,ses,harun
    //adanada,kazak,radar,ses

    //list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
    // metodu yazınız.(aynı kelimeleri ekrana yazma-sın)
    public static String palindrom(ArrayList<String> arr) {

        String result="";

        for (int i = 0; i < arr.size(); i++) {
            String str=arr.get(i);
            String reverse="";

            for (int j = str.length()-1; j >=0; j--) {
                reverse+=str.charAt(j);
            }
            if (str.equals(reverse)){
                str+=reverse+" ";
                arr.removeAll(Arrays.asList(str));
                i--;
            } }

        return result;


    }

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.addAll(Arrays.asList("kazak","kızak","kitap","adanada","ses"));
        System.out.println(palindrom(arr));
    }
}
