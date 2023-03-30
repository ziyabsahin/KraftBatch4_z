package day_23_String_Class;

public class HW03 {
    public static void main(String[] args) {
        System.out.println(bosluklariAl("   naber dostum     "));

        System.out.println(tarihiBirlesstir("13:30 17/08/2012"));

    }

    public static String bosluklariAl(String str){
        String trim=str.trim();
        return trim;
    }
    //18/10/2022 20:50:55 tarih bildirimini tarih damgasına
    //döndürün 18102019145055
    public static String tarihiBirlesstir(String tarih){
        String damga=tarih.replace(":","");
        damga=damga.replace("/","");
        damga=damga.replace(" ","");
        return damga;

    }
}
