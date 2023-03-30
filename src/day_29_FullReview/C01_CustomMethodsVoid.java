package day_29_FullReview;

public class C01_CustomMethodsVoid {
    public static void main(String[] args) {
        System.out.println(printNumbers(12, 20));


    }





    public static boolean isEven(int num){

        if(num%2==0)
            return true;
        else
            return false;

    }
    public static int ageOfPerson(int birthday){
        int age=2023-birthday;
       return age;
    }
    public static String printNumbers(int x, int y){
        String str="";
        for (int i = x; i <y; i++) {
            str+=i+" ";
        }
        return str;
    }
}
