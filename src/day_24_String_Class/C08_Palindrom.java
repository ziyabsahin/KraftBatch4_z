package day_24_String_Class;

public class C08_Palindrom {
    public static void main(String[] args) {
        String str="civic";
        String reverse="";

        for (int i = str.length(); 0 <i; i--) {
          reverse=reverse.concat(str.substring(i-1,i));

        }
        System.out.println(reverse);

        boolean palindrom=str.equals(reverse);
        System.out.println(palindrom);


    }
}
