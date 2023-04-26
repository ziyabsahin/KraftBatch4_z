package day_38_Constructors;

public class Person {
    public String name;
    public char gender;
    public int age;

    public Person(){

    }
    public Person(String name,char cinsiyet, int yas){
        this.age=yas;
        this.name=name;
        this.gender=cinsiyet;

    }
}
