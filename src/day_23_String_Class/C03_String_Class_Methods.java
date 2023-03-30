package day_23_String_Class;

public class C03_String_Class_Methods {
    public static void main(String[] args) {
        //length
        String programmingLanguage="java";
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        programmingLanguage="python";   //String immutable, javayı işaret ediyordu. String poolda yeni bir obje oluşturdu

        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());


        //toUppercase()
        //toLowercase

        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());
        System.out.println("programmingLanguage = " + programmingLanguage);
        programmingLanguage=programmingLanguage.toUpperCase();
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("programmingLanguage = " + programmingLanguage);


        //CharAt() girdiğimiz indeksi bize getirir, 0 dan baslayarak ilerler.
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));

        System.out.println(programmingLanguage.charAt(programmingLanguage.length() - 1));
        System.out.println("------------------------------------------");


        //concat() iki seyi ekliyor

        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println( programmingLanguage.concat(" proglamlama dili Javadan daha kolaydır."));
        System.out.println("programmingLanguage = " + programmingLanguage);
        programmingLanguage=programmingLanguage.concat(" proglamlama dili Javadan daha kolaydır.");
        System.out.println("programmingLanguage = " + programmingLanguage);

        //contains() degeri aratır, true ya da false döner

        System.out.println("programmingLanguage.contains(\"dili\") = " + programmingLanguage.contains("dili"));
        System.out.println("programmingLanguage.contains(\"s\") = " + programmingLanguage.contains("s"));
          System.out.println("-------------------------------");
        //trim() Stringin basındaki sonundaki boşluları alır.


        String s="     hello    world            ";
        System.out.println("s = " + s);
        System.out.println("s.trim() = " + s.trim());
        s=s.trim();
        System.out.println("-------------------------------");


        //replace() stringi degiştirir
        System.out.println("s.replace(\"hello\", \"big big\") = " + s.replace("hello", "big big"));
        System.out.println("s.replace(\"world\",\"developer\") = " + s.replace("world", "developer"));
        System.out.println("s.replace(\"hel\",\"\") = " + s.replace("hel", ""));

        //indexOf() karakterin index numarasına döndürür

        System.out.println("s.indexOf(\"he\") = " + s.indexOf("he"));
        System.out.println("s.indexOf(\"l\") = " + s.indexOf("l"));
        System.out.println("s.indexOf(\"d\") = " + s.indexOf("d"));

    }


}
