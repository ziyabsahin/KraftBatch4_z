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




    }


}
