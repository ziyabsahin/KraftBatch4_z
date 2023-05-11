package day_53_Summary;

public class C01_Exeption {
    public static void a() throws InterruptedException {

        //try catch blokları ile hata giderilir veya throws ile yukarı atılır
        //finally blogun sonuna ekleriz, her halukarda sonunda finally ye gir demek oluyor
        //manuel olarak bir exeption throw edilebilir
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //bir exeptionu kendimiz tanımlayabiliriz
        if (10/5==2){
            throw new InterruptedException("hata var");
        }

    }
}
