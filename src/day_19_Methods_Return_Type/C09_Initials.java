package day_19_Methods_Return_Type;

import java.util.Locale;

public class C09_Initials {

    public static void main(String[] args) {
        System.out.println(initials("Yahya","Büyüksahin"));

    }
    public static String initials(String name,String lastname){
        String resault;
        resault=name.charAt(0)+"."+lastname.charAt(0);
        resault=resault.toUpperCase(Locale.ROOT);
        return resault;


    }
}
