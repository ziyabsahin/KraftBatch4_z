package day_14_NestedWhileDoWhile;

public class C03_ReverseString {
    public static void main(String[] args) {
      String str="teneke";
      //          012345

       // System.out.println(str.length());
      //  System.out.println(str.charAt(5));

        String reverse="";

        for(int i=0;i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }


    }
}
