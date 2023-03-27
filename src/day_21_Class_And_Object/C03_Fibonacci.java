package day_21_Class_And_Object;

public class C03_Fibonacci {
    public static void main(String[] args) {
        fibonacci(11);
    }
//return void metodlarda da kullanabiliriz, bir deger döndürmeden kullanırız
    //return bulundugu metoddan cıkıs yapar, main metodda da kullanılabilir
    //void metodlar sadece ekranda yazar, icersindeki degerlerle bir işlem yapılmaz

    public static void fibonacci(int n){
        int x=0;
        int y=1;
        int z;
        System.out.print(x+" ");
        System.out.print(y+" ");
        for (int i = 0; i <n-2 ; i++) {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;

        }
    }
}
