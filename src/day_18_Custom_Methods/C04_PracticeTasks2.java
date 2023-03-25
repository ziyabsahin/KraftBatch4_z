package day_18_Custom_Methods;

public class C04_PracticeTasks2 {


    public static void main(String[] args) {

      areaOfSquare(12);

      chanceDollars(1200);



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

    public static void grades(int score){

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
        System.out.println("your score "+score+" and your grade is "+ grade);

    }

    /**
     *  6. create a method that can calculate the area of a circle
     * @param r
     */
    public static void areaOfCircle(double r){
        double area=Math.round(r*r*Math.PI);
        System.out.println("circle of area : "+area);
    }

    /**
     * 7. create a method that can calculate the area of a square
     * @param side
     */
    public static void areaOfSquare(double side){
    double area=side*side;
    System.out.println("karenin alanı : "+area);
}

    /**
     * //    8. create a method that can convert dollar to TL rate:19.04
     * @param dollars
     */
    public static void chanceDollars(double dollars){
        System.out.println(dollars+ " dollar is "+(dollars*19.04)+" TL");

    }
















        }
