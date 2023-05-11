package day_53_Summary;

import java.util.*;

public class Example {


    public static void polindrom(List<String> list){
        Set<String> result=new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {

          if(list.get(i).equalsIgnoreCase(reverse(list.get(i)))){
              result.add(list.get(i));
          }
        }
        for (String str:result) {
            System.out.println(str);
        }
    }
    public static String reverse(String str){
       try {
           String result="";

        for (int i =str.length()-1; i >=0; i++) {
            result+=str.charAt(i);
        }
        return result;}
       catch (Exception e){
           e.printStackTrace();
           return null;
       }
    }
}
