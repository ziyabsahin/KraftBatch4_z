package day_19_Methods_Return_Type;

public class C03_Return_Methods {
    public static void main(String[] args) {
        System.out.println( oldNumbers());

        System.out.println(evenNumbers());

        System.out.println(eligibleForAlcoholPurchase(23));

        System.out.println(eligibleToVote(18,"tr"));


    }
    /**
     *create a method that can print odd numbers between 1~100 in a same line saperated by space
     *
     */
    public static String oldNumbers(){
        String resault="";
        for (int i = 1; i <=100 ; i++) {

           resault+=i+" ";
        }


        return resault;

    }


    /**
     *2. create a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static String evenNumbers(){
        String resault="";
        for (int i = 2; i <=100 ; i+=2) {

            resault+=i+" ";
        }
       return resault;


    }
    /**
     *  3. create a method that can check if a person is eligible to buy alcohol

     */
    public static boolean eligibleForAlcoholPurchase(int age){
        boolean eligible;

        if(21<=age){
            System.out.println(eligible=false);
        } else{
            System.out.println(eligible=true);
        }
        return eligible;
    }
//

    /**
     *  create a method that can check if a person is eligible to vote
     * @param age
     * @param citizenship
     */

    public static boolean eligibleToVote(int age, String citizenship){
        boolean isEligible=age>=18&&citizenship.equalsIgnoreCase("TR");
       return isEligible;
    }


}
