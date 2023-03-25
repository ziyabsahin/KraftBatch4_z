package day_19_Methods_Return_Type;

public class C01_PractiseTasks2 {
    public static void main(String[] args) {


        tlToDollar(130);


        double bagWeight=kgToLb(22);
        System.out.println("bagWeight = " + bagWeight);


        System.out.println( signOfNumber(232));


    }


    public static void tlToDollar(double TL){
        System.out.println(TL+" TL makes "+Math.round((TL/19.04)*100)/100.00+" USD" );

    }

    //create a method that can convert kg to lb

    public static double kgToLb(double kg){
       double resault;
      resault=Math.round((kg*2.20462262)*100)/100.00;
      return resault;


    }
    //    3. create a method that can if the given integer is positive, negative or zero

    public static int signOfNumber(int number){

        if(number<0){
            System.out.println(number+" is a negative");
        }
        else if(number>0){
            System.out.println(number+" is a positive");
        } else{
            System.out.println(number+" is a zero");

        }
        return number;

    }







}
