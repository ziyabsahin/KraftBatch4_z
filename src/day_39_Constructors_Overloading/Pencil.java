package day_39_Constructors_Overloading;

public class Pencil {
    public String color;
    public double lenght;
    public boolean haveErase;

    public Pencil(){

    }
    public Pencil(String color){

        this.color=color;
    }
    public Pencil(String color,double lenght){
        this(color);
        this.lenght=lenght;

    }
    public Pencil(String color,double lenght,boolean haveErase ){
        this(color,lenght);
        this.haveErase=haveErase;

    }
    public String write(){
        if(lenght>0){
            return "kalem yazıyor";
        }
        return "kalem yazmıyor";
    }
    public String delete(){
        if(haveErase){
            return "kalem siliyor";
        }
        return "kalem silmiyor";
    }


}
