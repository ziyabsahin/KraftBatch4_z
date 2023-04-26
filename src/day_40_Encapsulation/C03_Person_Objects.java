package day_40_Encapsulation;

public class C03_Person_Objects {
    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.getName());
        person1.setName("Ali");
        System.out.println(person1.getName());
    }
}
