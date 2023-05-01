package day_46_Abstraction_And_Interface;

public class Dragon extends Animal implements CanFly,Wild{
    public Dragon(String name, String breed, char gender, int age, double size, String colar) {
        super(name, breed, gender, age, size, colar);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating steak");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " cok hızlı ucuyor");

    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunting everything");

    }
}
