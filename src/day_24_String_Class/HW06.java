package day_24_String_Class;

public class HW06 {
  public static void main(String[] args) {
    name("yahya");
  }




  //  sminizin son 3 harfini 3 kez yazdıran bir method oluşturun.
    public static void name(String name){
    String name2="";
      for (int i = 0; i < 3; i++) {

        for (int j = name.length(); j >name.length()-3 ; j--) {
          System.out.print(name.charAt(j-1));


        }
        System.out.println();


      }
    }
}
