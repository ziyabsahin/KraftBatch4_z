package day_39_Constructors_Overloading;

public class Car {

     String marka;
     String model;
     String renk;
     int hiz;
     boolean elektrik;

     public Car(){

     }
     public Car(String marka){
          this.marka=marka;

     }
     public Car(String marka,String model){
          this.marka=marka;
          this.model=model;

     }
     public Car(String marka,String model,String renk){
          this.marka=marka;
          this.model=model;
          this.renk=renk;

     }
     public Car(String marka,String model,String renk,int hiz){

          this.marka=marka;
          this.model=model;
          this.renk=renk;
          this.hiz=hiz;


     }
     public Car(String marka,String model,String renk,int hiz, boolean elektrik){
          this.marka=marka;
          this.model=model;
          this.renk=renk;
          this.hiz=hiz;
          this.elektrik=elektrik;


     }

     public String toString(){
          return "car{marka ="+marka+
                  " model ="+model+
                  " renk ="+renk+
                  " hiz ="+hiz+
                  " elektrik ="+elektrik+"}";
     }
     public static Car renkSec(Car car,String renk){
          car.renk=renk;
          return car;
     }





}
