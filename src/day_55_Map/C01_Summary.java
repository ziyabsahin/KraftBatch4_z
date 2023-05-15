package day_55_Map;

import java.util.*;
import java.util.TreeSet;

public class C01_Summary {
    //Collection gibi davranıyor ama collection değil ayrı bir sınıf
    //map interface oldugu için obje oluşturulmaz, implement eden sınıflardan obje oluşturulur
    //Iterator dataları tek tek geziyor
    //tree ise sıralaması küçükten büyüğe
    //hash ise hash ascısine göre
    //list ise giriş sırasına göre
    //collectionların bazılarının get metodu olmadıgı için mecburen foreach metodu kullanıyoruz
    //iterator da aynı sekilde get metodu yok, foreach metodu kullanırız
    //listin içerisinde map objelerini tutabiliriz

    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.addAll(Arrays.asList(12,8,9,11));
        for(Integer x:set){
            System.out.print(x+" ");
        }
        System.out.println();
        Iterator<Integer> itr= set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        while(itr.hasNext()){
            if(itr.next()<25){
                itr.remove();
            }
        }
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        set.forEach(x-> System.out.print(x+" "));



    }
}
