package day_39_Constructors_Overloading;

public class Carpet {

    double length, width,unitPrice;
    boolean isHandMade;

    public Carpet(double length, double width){
        this.length=length;
        this.width=width;
    }
    public Carpet(double length, double width,double unitPrice, boolean isHandMade){
        this(length, width);
        this.unitPrice=unitPrice;
        this.isHandMade=isHandMade;
    }
    public double calcPrice(){
        double totalPrice=length*width*unitPrice;
        if(isHandMade){
            return totalPrice*5;
        }
        return totalPrice;
    }
    public String toString(){
        return  "carpet{"+
                " lenght= "+length+
                " width= "+width+
                " unitPrice= "+unitPrice+
                " isHandMade= "+isHandMade+
                " totalPrice= "+calcPrice()+" }";
    }

}
