package day_19_Methods_Return_Type;

public class C04_Return_Methods {

    public static void main(String[] args) {
        System.out.println(grades(70));
        System.out.println(areaOfSquare(22));
        System.out.println(areaOfCircle(5));
        System.out.println(chanceDollars(56));




    }
    /**
     * //    5. create a method that can calculate the grade of the student based on the score
     * // score >= 90 grade 'A'
     * // score >= 80 grade 'B'
     * // score >= 70 grade 'C'
     * // score >= 60 grade 'D'
     * // score < 60 grade 'F'
     * @param score
     */

    public static char grades(int score){


        char grade;
        if(score>=90){
            grade='A';
        } else if(score>=80){
            grade='B';
        } else if(score>=70){
            grade='C';
        } else if(score>=60){
            grade='D';
        } else{
            grade='F';
        }
       return grade;

    }

    /**
     *  6. create a method that can calculate the area of a circle
     * @param r
     */
    public static double areaOfCircle(double r){
        return r*r*3.14;
    }

    /**
     * 7. create a method that can calculate the area of a square
     * @param side
     */
    public static double areaOfSquare(double side){

       return side*side;
    }

    /**
     * //    8. create a method that can convert dollar to TL rate:19.04
     * @param dollars
     */
    public static double chanceDollars(double dollars){
        return dollars*19.04;


    }


}
