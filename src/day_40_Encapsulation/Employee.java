package day_40_Encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;



        public Employee(String name, char gender, int age, double sallary){
        setName(name);
        setAge(age);
        this.gender=gender;
        this.salary=sallary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()||name.isBlank()){
            return;
        }
      this.name=name;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
