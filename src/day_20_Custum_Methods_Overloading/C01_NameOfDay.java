package day_20_Custum_Methods_Overloading;

public class C01_NameOfDay {
    public static void main(String[] args) {

        System.out.println(nameOfDay(10));

    }
    public static String nameOfDay(int number){
        String resault;
        if(number<1||number>7) {
            resault="invalid number";
        } else if(number==1){
            resault="monday";
        }else if(number==2) {
            resault = "tuesday";
        }else if(number==3) {
            resault = "wednesday";
        } else if(number==4) {
            resault = "thursday";
        }else if(number==5) {
            resault = "friday";
        }  else if(number==6) {
            resault = "saturday";
        }else {
            resault = "sunday";
        }

       return resault;
    }
}
