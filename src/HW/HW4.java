package HW;

public class HW4 {
    public static void main(String[] args) {
        System.out.println(tekrarEdenKarakterler("aassdfrrrggvvxzss"));
    }


   // Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
   // yazın.

    public static String tekrarEdenKarakterler(String str){
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                result+=str.substring(i,i+1);
            }

        }
        return result;
    }

}
