package day_19_Methods_Return_Type;

public class C08_ReturnTheBiggest {


    public static void main(String[] args) {
        System.out.println(max(5,8));

    }

    public static int max(int a, int b){
        int resault;
        if(a>b){
            resault=a;
        }else{
            resault=b;
        }
        return resault;
    }
}
