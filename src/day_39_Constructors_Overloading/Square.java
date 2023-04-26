package day_39_Constructors_Overloading;

public class Square {
    public double sideLength;
    public Square(double sideLength){
        this.sideLength=sideLength;
    }

    public double calcArea(){
        return sideLength*sideLength;
    }
    public double calcPerimeter(){
        return 4*sideLength;
    }
    public String toString(){
        return "Square {"+
                "sideLenght ="+sideLength+
                " area ="+calcArea()+
                " perimeter ="+calcPerimeter()+
                "}";
    }
}
