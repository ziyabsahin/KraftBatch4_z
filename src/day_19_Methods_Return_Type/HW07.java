package day_19_Methods_Return_Type;

public class HW07 {
    public static void main(String[] args) {
        System.out.println(day(2));

    }
    public static String day(int a){
        String day;
        switch (a){
            case 1:
                day="pazartesi";
                break;
            case 2:
                day="salı";
                break;

            case 3:
                day="çarşamba";
                break;
            case 4:
                day="perşembe";
            case 5:
                day="cuma";
                break;
            case 6:
                day="cumartesi";
                break;
            case 7:
                day="pazar";
                break;
            default:
                day="wrong number";

        }
        return day;
    }
}





