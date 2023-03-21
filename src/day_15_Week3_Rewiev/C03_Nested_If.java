package day_15_Week3_Rewiev;

public class C03_Nested_If {
    public static void main(String[] args) {
        int money=105;
        boolean zaman=false;
        if(money>=100){
            if(zaman){
                System.out.println("sinemaya gidebilir");
            }else{
                System.out.println("zamanı yok");
            }
        } else{
            System.out.println("parası yok");
        }
    }
}
