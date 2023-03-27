package day_22_ClassesAndObjects;

public class Daire {
    double r;
    double PI=Math.PI;
    public double daireAlan(){
        return Math.pow(r,2)*PI;

    }
    public double daireCevre(){
        return 2*r*PI;
    }

    public static double daireCevre(int r){
        return 2*r*3.14;
    }
    public static double daireAlan(int r){
        return Math.pow(r,2)*Math.PI;

    }



}
