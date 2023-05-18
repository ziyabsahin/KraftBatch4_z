package day_32_Arrays_2;

public class C01_For_Each_Loop {


    public static void main(String[] args) {
       // C03_String arr[]={"Merhaba","nasılsın","harun","celal"};
        String arr[]=new String[4];
        arr[0]="merhaba";
        arr[1]="nasılsın";
        arr[2]="harun";
        arr[3]="celal";
        for (String a:arr) {
            System.out.println("a = " + a);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);

        }
    }



}
