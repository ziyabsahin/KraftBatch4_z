package HW;

public class HW6 {
    public static void main(String[] args) {

        System.out.println(kacDefaGeciyor("sevmek cok sev seversen seversin","sev"));


    }




    public static int kacDefaGeciyor(String str1, String str2){
        int result=0;
        int donus= str1.length();

        for (int i = 0; i < donus-str2.length(); i++) {
            if(str1.contains(str2)){
                result++;
            }
           str1=str1.replace(str1.substring(0,1),"");

        }
        return result;
    }
}
