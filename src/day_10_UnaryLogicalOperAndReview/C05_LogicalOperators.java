package day_10_UnaryLogicalOperAndReview;

public class C05_LogicalOperators {
    public static void main(String[] args) {

        String name= "ayse";
        int age=34;
        String citizen="Turkey";

        boolean isEligibleVote= age>=18 && citizen=="Turkey";
        System.out.println("isEligibleVote = " + isEligibleVote);
        System.out.println("isEligibleVote = " + (age>=18 && citizen=="Turkey"));

        System.out.println("...............................");
         String name1="umit";
         int findexScore=800;
         int age1=43;
         int income=40000;

         boolean isEligibleForLoan = findexScore>=1500 && age1>=18 && income>30000;

        System.out.println(name1 +" isEligibleForLoan = " + isEligibleForLoan);
        System.out.println("--------------------");
        String name2="Hatice";
        int ag=23;
        char gender='F';
        boolean isEligible=ag>=18 & (gender=='M'||gender=='F');
        System.out.println("isEligible = " + isEligible);


        System.out.println("-------------------------------");

        double gpa=2.5;
        int income1=2500;
        boolean isEligibleForSchollShip= gpa>=3.5||income1<=20000;
        System.out.println("isEligibleForSchollShip = " + isEligibleForSchollShip);

        System.out.println("--------------------------------------");

        boolean resault = true;
        System.out.println("resault = " + resault);

        boolean resault1=!resault;
        System.out.println("resault1 = " + resault1);

        System.out.println(!resault1);




    }
}
