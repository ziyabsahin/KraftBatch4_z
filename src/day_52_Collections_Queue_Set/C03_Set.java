package day_52_Collections_Queue_Set;

import java.util.*;

public class C03_Set {
    //set ve list arasında en büyük fark
    //set yinelenenleri kabul etmez ve add sırasına göre tutmaz
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700));
        list.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700));
        System.out.println("-----------------------------------------------------------");

        Set<Integer> hashset=new HashSet<>();
        hashset.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        hashset.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        hashset.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        hashset.addAll(Arrays.asList(null,null,null));
        System.out.println(hashset);


        //hashsette de sıralama random oluyor ve dublicatelere musade etmiyor, null alıyor

        Set<Integer> linkedHashset=new LinkedHashSet<>();
        linkedHashset.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        linkedHashset.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        linkedHashset.addAll(Arrays.asList(null,null,null));
        System.out.println(linkedHashset);
        //sıralama girildiği şekliyle ama uniq elemanları almıyor, null kabul ediyor

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        treeSet.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        treeSet.addAll(Arrays.asList(10,20,30,100,200,15,600,45,700,20,30,10));
        //treeSet.addAll(Arrays.asList(null,null,null)); runtime error
        System.out.println(treeSet);
        //sıralama artan sekilde sort özelliği var, null kabul etmiyor


    }
}
