package day_24_String_Class;

public class C07_Reverse_String {
    public static void main(String[] args) {
        String str="java proglama dili";
        String reversed="";
        for(int i=str.length();i>0;i--){
            reversed+=str.charAt(i-1);
        }
        System.out.print(reversed);
    }
}
