package day_46_Abstraction_And_Interface;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, char gender, int age, double size, String colar) {
        super(name, breed, gender, age, size, colar);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating bone");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with ball");

    }

  void bark(){
        System.out.println(getName()+" is barking");
    }
}
