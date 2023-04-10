package day_31_Arrays_1;

public class C02_Arrays {

    public static void main(String[] args) {

        int array[]=new int[5];

        array[0]=1;
        array[1]=4;
        array[3]=9;

        for (int i = 0; i <array.length; i++) {
          //  System.out.println(array[i]);
        }
        //foreach döngüsüyle de arrayin bütün degerlerine bakabiliriz


        for(int i:array) {
          //  System.out.print(i+" ");

        }

//        int count=0;
//        for (int i:array) {
//            if(i%2!=0){
//                count++;
//            }
//
//        }
//        System.out.println(count);
        int count1=0;
        for (int i:array) {

                count1+=i;


       }
        System.out.println(count1);

        count1=0;
        for (int i = 0; i <array.length; i++) {
            count1+=array[i];
        }
        System.out.println(count1);


    }




}
