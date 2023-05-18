package day_23_String_Class;

public class C02_String_Intro {
    public static void main(String[] args) {
        String str1="hello"; //literal yolla, heap memoryde C03_String poolda oluştu
        String str2="hello"; //poola baktı ve ordaki herlloyu işaret ediyor

        String str3="Hello"; //literal yolla, heap memoryde C03_String poolda oluştu
        String str4=new String("hello"); //new keyword ile oluşturdu, heap memoryde bir yer açıp oraya yazıyor

        boolean bl;  //initilize edilmediği için hata verir

        bl=str1==str2;   //C03_String poolda oldugu için true döndü, referanslara bakıyor ==
        System.out.println(bl);
        bl=str1.equals(str2); // sadece stringlerin içeriğini karşılastırdı. referanslarına bakmıyor
        System.out.println(bl);
        System.out.println("--------------------------");
        bl=str1.equals(str3);
        System.out.println(bl);
        System.out.println("-----------------------------");
        bl=str1==str4;
        System.out.println(bl);
        bl=str1.equals(str4);
        System.out.println(bl);




    }



}
