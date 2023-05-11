package day_52_Collections_Queue_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_Set_Practice {
    public static void main(String[] args) {
        String str="Yattın mi \n" +
                "Yorgun musun\n" +
                "Uyu düşünme beni\n" +
                "Ben ki hiç düşünülmedim senden öncesi";
        Set<Character> siir=new HashSet<>();
       // Set<Character> siir2=new HashSet<>();
        for (int i = 0; i < str.length(); i++ ){
            siir.add(str.charAt(i));

        }
        siir.remove(' ');
        System.out.println(siir.size());
        System.out.println(siir);
//        String[] arr=str.split("");
//        siir2.addAll(Arrays.asList(arr));

    }
}
