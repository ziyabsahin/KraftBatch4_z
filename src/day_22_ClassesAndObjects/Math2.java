package day_22_ClassesAndObjects;

public class Math2 {
    int x;
    int y;
    public int sayininKuvveti(){
        int num=1;
        for (int i = 0; i < y; i++) {
            num*=x;

        }
        return num;
    }

    public static int sayininKuvveti2(int x, int y){
        int num=1;
        for (int i = 0; i < y; i++) {
            num*=x;

        }
        return num;
    }
}
