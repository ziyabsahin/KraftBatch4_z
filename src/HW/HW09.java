package HW;

public class HW09 {
    public static void main(String[] args) {
        System.out.println(sonKontrol("kullanacak", "aka"));
    }



    public static boolean sonKontrol(String str1,String str2){
       int donus=str1.length();

        for (int i = 0; i < donus; i++) {
            if(str1.startsWith(str2)){
                return true;
            }
            str1=str1.substring(1);
        }
        return false;
    }
}
