package day_52_Collections_Queue_Set;

import java.util.*;

public class C05_Set_Practice {
    public static void main(String[] args) {
        String[] arr={"book","book","notebook","pen","pencil","spoon","ruler","phone","miror","phone","brush"};
        Set<String> uniqeItemsInMyBag=new HashSet<>();
        uniqeItemsInMyBag.addAll(Arrays.asList(arr));
        System.out.println(uniqeItemsInMyBag);

        Set<String> uniqeItemsInMyBag2=new LinkedHashSet<>();
        uniqeItemsInMyBag2.addAll(Arrays.asList(arr));
        System.out.println(uniqeItemsInMyBag2);

        Set<String> uniqeItemsInMyBag3=new TreeSet<>();
        uniqeItemsInMyBag3.addAll(Arrays.asList(arr));
        System.out.println(uniqeItemsInMyBag3);

        System.out.println(uniqeItemsInMyBag3.toArray());



    }
}
