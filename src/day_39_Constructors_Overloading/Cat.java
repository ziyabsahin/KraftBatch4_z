package day_39_Constructors_Overloading;

public class Cat {
    String eyeColor, breed;
    boolean isFat, isPet;
    public Cat(){

    }
    public Cat(String eyeColor){
        this.eyeColor=eyeColor;

    }
    public Cat(String eyeColor, String breed){
        this(eyeColor);
        this.breed=breed;


    }
    public Cat(String eyeColor, String breed,boolean isFat){
        this(eyeColor,breed);
        this.isFat=isFat;

    }
    public Cat(String eyeColor, String breed,boolean isFat,boolean isPet){
        this(eyeColor,breed,isFat);
        this.isPet=isPet;

    }
    public boolean sleep(){
        if(isFat){
            return true;
        }
        return false;
    }
    public boolean food(){
        if(isFat){
            return true;
        }
        return false;
    }
    public String run(){
        if(isFat||isPet){
            return "dont run" ;
        }
        return "run";
    }
}
