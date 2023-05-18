package day_58_Java_Review3;

public class C04_Exeptions {
    //iki tür exeptions var checked ve unchecked
    //error:dış bir faktörden kaynaklı ve handle edilemiyor, düzenlememiz gerekiyor
    //hafıza cpı sınırlı oldugu için error verir
    //exeption beklenmeyen, bir şeyin yanlış gitmesi durumları
    // run sırasında (uncheck)
    //veya compile sırasında(check) ortaya cıkıyor
    //try catch blogu ile hatayı yakalıyoruz Exeption e
    //finally koyarak her halukarda finallye girmesini saglarız
    //kendi hatamızı uretip kullanıcıya sunabiliriz kendi hatamızı throw keywordü ile yapıyoruz,
    //sadece check exeptionlar
    //için kullanıyoruz
    //e.printStackTrace() hatanın ne oldugunu yazdırabiliriz

    public static void main(String[] args) {
runtimeExeption(); //hata giderilmez, handle etmemiz lazım ya da throws ile ötelememiz lazım
    }
    public static void runtimeExeption(){
        throw new RuntimeException("this exeption runtime");
    }
}
