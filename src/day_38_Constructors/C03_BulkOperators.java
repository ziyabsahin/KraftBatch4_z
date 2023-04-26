package day_38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperators {
    //arrayListin içerisine toplu olarak atama yapabiliriz
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        ArrayList<Integer> list1=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(10);
        list.addAll(list1);
        System.out.println(list);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10)); //Arrays sınıfının asList metodunu kullanbiliriz
        System.out.println(list2);

        ArrayList<String> jopTitles=new ArrayList<>();
        jopTitles.addAll(Arrays.asList("QA","FULL STACK AUTOMATİON ENGİNEER","SDET",
                "SOFT DEVELOPMENT ENGİNEER İN TEST","DEVELOPER","QA AUTOMATİON ENGİNEER"));
        System.out.println(jopTitles);

        //retainAll istenenler kalsın, diğerlerini sil



    }




}
