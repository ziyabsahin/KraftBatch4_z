package day_19_Methods_Return_Type;

public class C07_NameOfMonth {
    public static void main(String[] args) {
        System.out.println(nameOfMonth(2));

    }

    public static String nameOfMonth(int number) {
        String name = "";
        switch (number) {
            case 1:
                name += "jan";
                break;
            case 2:
                name += "feb";
                break;
            case 3:
                name += "mar";
                break;
            case 4:
                name += "apr";
                break;
            case 5:
                name += "may";
                break;
            case 6:
                name += "jun";
                break;
            case 7:
                name += "jul";
                break;
            case 8:
                name += "aug";
                break;
            case 9:
                name += "sep";
                break;
            case 10:
                name += "oct";
                break;
            case 11:
                name += "nov";
                break;
            case 12:
                name += "dec";
                break;
            default:
                name += "invalid ";


        } return "month name :"+ name;
    }
}
