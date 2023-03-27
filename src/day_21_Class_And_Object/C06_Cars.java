package day_21_Class_And_Object;

public class C06_Cars {

    String renk;
    int model;
    String marka;
    int beygir;
    String saseNo;
    boolean isSuv;
    boolean isManuel;

    public void hizlan(){
        System.out.println("araç hızlanıyor");
    }
    public String SaseNo(){
        if(beygir>100){
            return "güçlü";
        }
        return "zayıf";
    }







}
