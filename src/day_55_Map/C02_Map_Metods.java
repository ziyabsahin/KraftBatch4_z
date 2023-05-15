package day_55_Map;

import java.util.*;
import java.util.TreeMap;

public class C02_Map_Metods {
    public static void main(String[] args) {
        //put() ile ekleme yapıyoruz
        Map<Integer,String> map=new TreeMap<>();
        map.put(12,"harun");
        map.put(13,"ziya");

        // get() çağırmak için kullanıyoruz
        System.out.println(map.get(13));
        // values() tüm valueları alıp collection olarak döndürüyor, keyleri almıyor
        System.out.println("---------------------------");
        System.out.println(map.values());
        // keySet() maplerin keylerini integar olarak collaections set sınıfına dönüştürür
        Set<Integer> set=map.keySet();
        System.out.println(set);
        System.out.println("---------------------------");
        // clear() hepsni temizler
        // containsKey() keyin içerigi var mı diye kontrol eder boolean dondurur
        System.out.println(map.containsKey(12));
        // remove() içeriği siler ve string döndürür. key alabilir, hem key value alablir
//        System.out.println(map.remove(14, "ali"));
//        System.out.println(map.remove(12));
//        System.out.println(map.get(12));
//
        //map.remove(12);

        // entrySet() map i bir setin içerisine atıyor

        // equals() iki mapin eşit olup olamadığını kontrol ediyor
        Map<Integer,String> map2=new TreeMap<>();
        Map<Integer,String> map3=new TreeMap<>();
        map2.put(12,"harun");
        map2.put(13,"ziya");
        System.out.println(map.equals(map2));
        // forEach() aynı şekilde çalışıyor sadece key ve value ayrı ayrı tanımlamak gerekiyor
        map.forEach((k,v)-> System.out.println(k+" "+v));
        // isEmpty() boş mu diye kontrol ediyor boolean döndürür
        System.out.println(map.isEmpty());
        // putAll() hepsini ekle, map alıyor yine
        map3.putAll(map2);
        System.out.println(map3.get(12));
        // replace()  değişiklik yaparız
        System.out.println(map2.replace(12, "ayşe"));
        System.out.println(map2.get(12));
        map3.replace(12,"ayşe","harun");
        System.out.println(map3.get(12));
        System.out.println("-----------------------------------");
        map3.replace(12,"ayşe","emine");
        System.out.println(map3.get(12));
        System.out.println(map3.replace(12, "ayşe", "emine"));


    }

}
