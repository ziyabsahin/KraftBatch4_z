package day_15_Week3_Rewiev;

public class C02_Example {
    public static void main(String[] args) {
        int not = 102;
        String str = "başa dön";
        if (not <= 40 && not >= 0) {
            str = "F";
        } else if (not < 55) {
            str = "D";

        } else if (not < 70) {
            str = "C";
        } else if (not < 85) {
            str = "B";
        } else if (not >= 85 && not <= 100) {
            str = "A";
        } else {
            System.out.println("Hatalı giriş");
        }


        if (!str.equals("")) {
            System.out.println(str);
        }
    }
}
