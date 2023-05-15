package day_55_Map;

import java.util.*;
import java.util.List;
import java.util.Map;

public class C03_OgrenciObject {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci("harun","koc",15);
        Ogrenci ogrenci2=new Ogrenci("ayse","calıskan",13);
        Ogrenci ogrenci3=new Ogrenci("hatice","akıllı",18);

        Map<Integer,Ogrenci> map=new HashMap<>();
        map.put(ogrenci1.getNo(),ogrenci1);
        map.put(ogrenci2.getNo(),ogrenci2);
        map.put(ogrenci3.getNo(),ogrenci3);

        map.get(13).ekleders("almanca");
        map.get(15).ekleders("ingilizce");
        System.out.println(map.get(13).getIsim());

        System.out.println(map.get(13).toString());


        List<Ogrenci> list=new ArrayList<>();
        list.add(ogrenci1);
        list.add(ogrenci2);
        list.add(ogrenci3);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNo()==18){
                list.get(i).ekleders("Almanca");
                break;
            }
        }
        System.out.println(ogrenci3.getDersler());


    }
}
