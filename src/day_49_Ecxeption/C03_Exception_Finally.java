package day_49_Ecxeption;

public class C03_Exception_Finally {
    public static void main(String[] args) {
        // her durumda çalışsın isteniyorsa finally blogu kulluanıyoruz
        //her durumda finally blogu calışır
        //catch blogunda hata varsa finally çalışır sonra hatayı yazar
        try {
            System.out.println(2);
            System.out.println(5/0);
        } catch(Exception e){
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}
