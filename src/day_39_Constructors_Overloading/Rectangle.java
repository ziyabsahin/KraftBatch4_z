package day_39_Constructors_Overloading;

public class Rectangle {
    public double length, width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public String toString(){
        return "retangle{"+
                " length ="+length+
                " width ="+width+
                " area ="+calculateArea()+
                " perimeter ="+calculatePerimeter()+"}";
    }




}
