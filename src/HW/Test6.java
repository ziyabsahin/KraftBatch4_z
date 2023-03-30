package HW;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(polidrom("arakara"));

    }
    public static boolean polidrom(String str){
        String str2="";
        for (int i = 1; i <= str.length(); i++) {
            str2=str2.concat(str.substring(str.length()-i,str.length()-i+1));


        }
        if (str.equalsIgnoreCase(str2)){
            return true;
        }
        return false;
    }
}
