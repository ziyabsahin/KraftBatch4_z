package day_56_Java_Review1;

public class C02_Wrapper_Class {
    //primitivelerden obje üretmek için kullanıyoruz
    //casting yok
    public static void main(String[] args) {
        Integer x=new Integer(10);
        Double d=new Double(12.2);
        java.lang.String s="123";
        int i=Integer.parseInt(s);
        Integer c=Integer.valueOf(s);

        Character ch=new Character('c');
        System.out.println(Character.isDigit(ch));
        System.out.println(s);
    }
}
