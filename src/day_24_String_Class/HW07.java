package day_24_String_Class;

public class HW07 {
    public static void main(String[] args) {
        System.out.println(benzersizHarf("aaba"));

    }
    public static String benzersizHarf(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.substring(i,i+1))==str.lastIndexOf(str.substring(i,i+1))){
                result=str.substring(i,i+1);
                return result;
            } else{
                result="benzersiz harf yok";
            }

        }
        return result;
    }



}
