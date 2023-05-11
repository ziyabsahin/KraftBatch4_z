package day_51_Collections_List;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<String> letters=new LinkedList<>();
        List<String> letters2=new LinkedList<>();
        letters.add("K");
        letters.add("R");
        letters.add("A");
        letters.add("F");
        letters.add("T");
        letters.add("T");
        System.out.println(letters);
        System.out.println(letters.indexOf("A"));
        System.out.println(letters.lastIndexOf("T"));

        letters2.add("A");
        letters2.add("F");
        letters2.add("K");
        System.out.println(letters2);

        System.out.println(letters.containsAll(letters2));
        System.out.println(letters2.containsAll(letters));
        System.out.println(letters.retainAll(letters2));

       // letters.removeAll(letters2);
       // System.out.println(letters);






    }

}
