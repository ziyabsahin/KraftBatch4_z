package day_46_Abstraction_And_Interface;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private double size;
    private final String colar;
    public final static boolean canBreathe;

    static {
        canBreathe=true;
    }

    public Animal(String name, String breed, char gender, int age, double size, String colar) {
       setName(name);
        this.breed = breed;
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.colar = colar;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSize() {
        return size;
    }

    public String getColar() {
        return colar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(double size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", colar='" + colar + '\'' +
                '}';
    }

    public abstract void eat();
   public final void drink(){
        System.out.println(name+" is animal drink water");
    }

}
///*Animal task:
//
//
//               Create an abstract class named Animal:
//                    Variables:
//                    name, breed(final), gender(final),  age, size, color(final)
//
//                    Encapsulate all the fields
//
//                    Add a constructor that can set all the fields
//
//                    Methods:
//                        eat(); ==> different animals eat different foods
//                        drink() ==> all the animals drink water
//                        toString() ==> to display the full info of the animal
//*/