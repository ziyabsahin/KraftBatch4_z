package day_51_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_List {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
        list1.addAll(Arrays.asList(5,6,7,8,9,10));
        System.out.println(list1.get(2));
        list1.set(2, 15);
        System.out.println(list1);
        list1.remove(5);
        System.out.println(list1);
    }
}
