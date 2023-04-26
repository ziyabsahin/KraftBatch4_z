package day_37_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class C02_ArrayList {
    //içersine istediğimiz sayıda array atabiliyoruz, uzunlugu belirlemeden
    //içerisine atılıyor
    //bir classtır, objeleri depolarız, eklendikçe genişliyor, cıkarttıkca daralıyor
    //java.util import etmek gerekiyor
    //oluşturulurken kaç array oldugunu belirtmiyoruz
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        System.out.println(arrList.add("merhaba"));
        System.out.println(arrList.get(0));
        System.out.println(arrList.size());
       // arrList.clear();
        arrList.add(0,"hayırlı günler");
        arrList.add("bayram");
        arrList.add(1,"bayram");
        System.out.println(arrList.get(0));

        System.out.println(arrList.get(1));

        arrList.remove(0);
        System.out.println(arrList.get(0));



       // System.out.println(arrList.isEmpty());

        //set arraylist içerik degiştirir
        //remove içerisi siler
        //add arrayliste ekleme yapıyor
        //clear listin tamamını siliyor
        //indexOf hangi indexte oldugunu buluyor
        //removeAll baska bir arrayListle karşılaştırır ve siler
        //


    }




}
