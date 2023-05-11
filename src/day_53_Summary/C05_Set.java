package day_53_Summary;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("ziya");
        set.add("harun");
        set.add("umit");
        set.add("ziya");
        set.add("harun");
        System.out.println(set);
    }
}
