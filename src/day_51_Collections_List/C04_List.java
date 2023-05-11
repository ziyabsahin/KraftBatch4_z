package day_51_Collections_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class C04_List {
    public static void main(String[] args) {
        List<Integer> list=new Stack<>();
        list.addAll(Arrays.asList(5,6,7,8,9,10,11));
        System.out.println(list);
        System.out.println(((Stack) list).pop());
        System.out.println(list);
        System.out.println(((Stack) list).push(12));
        System.out.println(list);
        System.out.println(((Stack) list).peek());//sıradaki hangisi bunu buluyor bizim için

    }
}
