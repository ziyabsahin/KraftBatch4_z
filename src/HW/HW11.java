package HW;

public class HW11 {
    public static void main(String[] args) {
        System.out.println(enfazlaolanıdondur("merhabaeccc"));
    }




    public static String enfazlaolanıdondur(String str){
        String str2="";
        int a=0;
        int b=0;
        for (int i = 0; i < str.length(); i++) {
             b=str.length()-str.replace(str.substring(i,i+1),"").length();
             if(b>a){
                 str2=str.substring(i,i+1);
             }


        }
        return str2;

    }




}
