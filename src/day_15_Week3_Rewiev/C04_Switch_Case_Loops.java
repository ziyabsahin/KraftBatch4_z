package day_15_Week3_Rewiev;

public class C04_Switch_Case_Loops {
    public static void main(String[] args) {
        //byte.short,int,C03_String,char degişkenleri için kullanabiliriz

        int x = 5;
        switch (x) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            default:
                System.out.println("yanlış");
        }

    }
}
