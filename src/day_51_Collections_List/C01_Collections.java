package day_51_Collections_List;

import java.util.*;

public class C01_Collections {
//interfacelerden obje oluşturamadıgımız için child claslarin constructorlarını kullanarak obje oluştururuz


    public static void main(String[] args) {
        int[] arr=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;


        List<String> list=new ArrayList<>(); //polimorphism kullanarak obje oluşturduk
        List<String> list2=new LinkedList<>(); //polimorphism kullanarak obje oluşturduk
        Queue<String> list3=new LinkedList<>(); //polimorphism kullanarak obje oluşturduk
        Queue<String> list4=new PriorityQueue<>(); //polimorphism kullanarak obje oluşturduk
        Set<String> list5=new TreeSet<>() ; //polimorphism kullanarak obje oluşturduk
        Set<String> list6=new LinkedHashSet<>() ; //polimorphism kullanarak obje oluşturduk


    }
}
