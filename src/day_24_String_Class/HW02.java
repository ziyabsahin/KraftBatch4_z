package day_24_String_Class;

public class HW02 {
    public static void main(String[] args) {
        /*"javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren
bir program yazın.*/
        String str="javayı seviyorum";
        int harfSayisi=str.length()-str.replace("y","").length();
        System.out.println(harfSayisi);



    }
}
