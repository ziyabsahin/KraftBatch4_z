package day_39_Constructors_Overloading;

public class C03_Car_Objects {

    public static void main(String[] args) {
        Car car1=new Car("bmw","3.20");

        System.out.println(car1);
        Car.renkSec(car1,"siyah");
        System.out.println(car1);
    }
}
