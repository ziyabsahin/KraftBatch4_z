package day_18_Custom_Methods;

public class C04_PracticeTasks1 {
    public static void main(String[] args) {
        eligibleToVote(18,"tr");
        oldNumbers();
        System.out.println();
        evenNumbers();
        System.out.println();
        eligibleForAlcoholPurchase(23);

    }


    /**
     *create a method that can print odd numbers between 1~100 in a same line saperated by space
     *
     */
    public static void oldNumbers(){
        for (int i = 1; i <100 ; i++) {

            System.out.print(i+" ");
        }
        System.out.println();


    }


    /**
     *2. create a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static void evenNumbers(){
    for (int i = 0; i <=100 ; i++) {

        System.out.print(i+" ");
    }
    System.out.println();


}
/**
 *  3. create a method that can check if a person is eligible to buy alcohol

 */
    public static void eligibleForAlcoholPurchase(int age){

        if(21<=age){
            System.out.println("Eligible to buy alcohol");
        } else{
            System.out.println("ineligible to buy alcohol");
        }
    }
//

    /**
     *  create a method that can check if a person is eligible to vote
     * @param age
     * @param citizenship
     */

    public static void eligibleToVote(int age, String citizenship){
        boolean isEligible=age>=18&&citizenship.equalsIgnoreCase("TR");
        System.out.print("you are ");
        if(!isEligible) System.out.print("not");
        System.out.println("eligible to vote");
    }









}
