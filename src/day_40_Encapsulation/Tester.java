package day_40_Encapsulation;

public class Tester {
    private String name;
    private double salary;
    private char gender;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class TesterObjects{
    public static void main(String[] args) {
        Tester tester1=new Tester();

    }
}
