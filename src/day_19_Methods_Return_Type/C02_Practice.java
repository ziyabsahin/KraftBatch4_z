package day_19_Methods_Return_Type;

public class C02_Practice {
    public static void main(String[] args) {
        System.out.println(eachCharInString("yahya"));


        calculator(2,4,'.');



    }

    /**
     *
     * @param str
     * @return
     */
    public static String eachCharInString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }   return str;
    }

    //

    /**
     *  5. create a method named calculator that passes three arguments (num1, num2, mathOperator),
     *   prints the calculation result
     * @param n1
     * @param n2
     * @param operator
     */
    public static void calculator(double n1, double n2,char operator){
        boolean valid=operator=='+'||operator=='-'||operator=='*'||operator=='/';
        if(valid){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;

            }
        } else{
            System.err.println("Invalid Math Operator "+ operator);
        }




    }
}




