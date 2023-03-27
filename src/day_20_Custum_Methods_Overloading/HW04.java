package day_20_Custum_Methods_Overloading;

public class HW04 {
    public static void main(String[] args) {
        System.out.println(area(3,12));



    }

    public static double area(double r){
      double area;
      area=r*r*3.14;
      return area;

    }
    public static double area(double x, double y){
        double area;
        area=x*y;
        return area;
    }
}
