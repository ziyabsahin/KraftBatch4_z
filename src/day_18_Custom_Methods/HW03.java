package day_18_Custom_Methods;

public class HW03 {
    public static void main(String[] args) {
        esit(5,5);



    }

    /**
     * iki sayının eşit olup olmadıgını kontrol ediyor
     * @param a
     * @param b
     */
    public static void esit(int a, int b){
        boolean sonuc;
        if(a==b){
           sonuc=true;
        } else{
            sonuc=false;
        }
        System.out.println(sonuc);

    }
}
