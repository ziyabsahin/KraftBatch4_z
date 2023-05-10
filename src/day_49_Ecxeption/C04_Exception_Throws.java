package day_49_Ecxeption;

public class C04_Exception_Throws {
    public static void main(String[] args) {
        try {
            System.out.println(metod("w"));
        } catch (Exception e){
            System.out.println("hata");
        }

    }
    public static void check() throws InterruptedException {
        Thread.sleep(3000);
    }
    //bir metodda hata varsa bunu handle etmmizi istiyor
    //handle etme try catch yapma
    //bu metod kullanılınca handle edilmeli
    //throws anahtar kelimesiyle bu hatayı kodu kullanana yönlendirilir

    public static String metod(String str){
        String result="";
        for (int i = str.length()-2; i < str.length(); i++) {
            result+=str.charAt(i);

        }
        return result;
    }
}
