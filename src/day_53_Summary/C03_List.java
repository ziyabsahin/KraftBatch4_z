package day_53_Summary;

import java.util.*;

public class C03_List {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        arrayList.addAll(Arrays.asList("Harun","Mehmet"));
        linkedList.addAll(Arrays.asList("Harun","Mehmet"));
        System.out.println(arrayList);
        System.out.println(linkedList);


        Vector<Integer> stack=new Stack<>();
        Vector<Integer> stack2=new Vector<>();
        stack.addAll(Arrays.asList(1,3,4,5,2,6,7,8,90,0));
        stack2.addAll(Arrays.asList(1,3,4,5,2,6,7,8,90,0));
        System.out.println(stack.capacity());



    }
}
