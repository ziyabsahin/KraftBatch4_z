package day_20_Custum_Methods_Overloading;

public class C06_Method_Overloading5 {
    public static void main(String[] args) {
        concat(9,"merhaba",false);

    }
    /*
     * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
     * Boolean true ise int ve String değeri concat yapsın.
     * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/

    public static void concat(int num, String str, boolean bl){
        if(bl){
            System.out.println(str+num);
        }else if(!bl){concad(str,num);

        }
    }
    public static void concad(String ktr, int num1){
        for (int i = 1; i <=num1 ; i++) {
            System.out.println(ktr);

        }
    }
}
