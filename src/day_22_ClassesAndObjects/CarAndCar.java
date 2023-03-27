package day_22_ClassesAndObjects;

public class CarAndCar {
    public static void main(String[] args) {


  Car car=new Car();
  Car car2=new Car();
  car.model="E200";
  car.marka="mercedes";
  car.beygir=2000;
  car2.marka="honda";
  car2.model="crv";
  car.beygir=1600;
  if(car.beygir> car2.beygir){
      System.out.println(car.model+" "+car.marka);
  } else{
      System.out.println(car2.model+" "+car2.marka);

  }


}  }
