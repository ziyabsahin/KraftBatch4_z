package day_18_Custom_Methods;

public class HW05 {
    public static void main(String[] args) {
        not(12);

    }

    /**
     * notları harf cinsine dönüştürüyor
     * @param a
     */
    public static void not(int a){
        if (a>75){
            System.out.println("A");
        }else if(a>50){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}
