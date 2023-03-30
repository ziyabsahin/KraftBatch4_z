package day_24_String_Class;

public class C09_Unique_Characters {
    public static void main(String[] args) {
        String str="aaabccdce";
        String resault="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                resault+=ch;
                System.out.print(ch);
            }


        }






    }
}
