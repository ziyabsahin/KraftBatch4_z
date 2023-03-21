package day_14_NestedWhileDoWhile;

import org.w3c.dom.ls.LSOutput;

public class HW9 {
    public static void main(String[] args) {
        int sum=1;
        for(int i=1;i<=8;i++){
            sum*=i;
        }
        System.out.println(sum);

    int a=1;
    int son=1;
    while (a<=8){
        son*=a;
        a++;
    }
        System.out.println(son);

    int b=1;
    int top=1;
    do{
        top*=b;
        b++;
    }while(b<=8);
        System.out.println(top);


    }
}
