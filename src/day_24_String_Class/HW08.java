package day_24_String_Class;

public class HW08 {
    public static void main(String[] args) {

        System.out.println(terstenOkunusAyni("habah"));
    }




    public static boolean terstenOkunusAyni(String str){
        boolean result=true;
        String str2="";
        for (int i = str.length(); i > 0; i--) {
            str2+=str.substring(i-1,i);
        }
        if(str.equalsIgnoreCase(str2)){
            return result;
        }
        result=false;
       return result;

    }

}
