package day_46_Abstraction_And_Interface;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, double size, String colar) {
        super(name, breed, gender, age, size, colar);
    }

    //final metodlar override edilemez
    @Override
    public void eat() {
        System.out.println(getName()+" ciger yer");
    }
    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with mouse");
    }
}
