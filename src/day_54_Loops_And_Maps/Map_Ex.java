package day_54_Loops_And_Maps;

import java.util.*;


public class Map_Ex {
    //map interface bir çok yerde kullanırız
    //hash dataları kendince bir yöntemle  sırlar
    //tree küçükten büyüge sıralar
    //mapler collection değil farklı bir interface
    //süslü parantezler map, köşeli parantezler arrayi temsil eder
    //key ve value şeklinde eşleşmeyi temsil eder
    //key aynı value değişik ise ikinciyi üzerine yazar
    //bir cok metodu var remove, clear, equals, get,containsKey,keySet(bütün keyleri alır),

    public static void main(String[] args) {
        Map<String,Double> meyve=new HashMap<>();
        meyve.put("elma",20.00);
        meyve.put("armut",25.50);
        meyve.put("çilek",39.99);
        meyve.put("muz",23.00);
        System.out.println(meyve.get("çilek"));
        System.out.println(meyve);


    }
}
