package HW;

public class HW07 {
    public static void main(String[] args) {
        System.out.println(kontrol("ankara ve bursa arası uzak", "ankara", "bursa"));
    }


    public static boolean kontrol(String str1, String str2, String str3) {
        boolean result1 = false;
        boolean result2 = false;
        String kelime1 = "";
        String kelime2 = "";

        for (int i = 0; i < str1.length(); i++) {
            kelime1 += str1.charAt(i);
            if (kelime1.startsWith(str2)) {
                result1 = true;
                break;
            }



        }
        for (int i = 0; i < str1.length(); i++) {
            kelime2 += str1.charAt(i);
            if (kelime2.startsWith(str2)) {
                result2 = true;
                break;
            }
        }
        return result1 && result2;


    }
}
