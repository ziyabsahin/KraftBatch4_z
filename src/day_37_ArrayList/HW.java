package day_37_ArrayList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HW {
    public static void main(String[] args) {
        //Birinci arrayList e elma, armut, kayısı, üzüm, erik;
        //İkinci arrayListe e armut, kayısı, üzüm değerlerini atayalım ve
        //İlk arrayList in içinden ikinci arrayList i çıkartalım.

        ArrayList<String> meyveler=new ArrayList<>();
        ArrayList<String> meyveler2=new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("kayısı");
        meyveler.add("üzüm");
        meyveler.add("erik");
        meyveler2.add("armut");
        meyveler2.add("kayısı");
        meyveler2.add("üzüm");
        meyveler.removeAll(meyveler2);
        System.out.println(meyveler);

        System.out.println("-----------------------------------------");
        ArrayList<Integer> listOfNum=new ArrayList<>();
        listOfNum.add(5);
        listOfNum.add(10);
        listOfNum.add(15);
        listOfNum.add(15);
        listOfNum.add(20);
        listOfNum.add(25);
        listOfNum.add(25);
        listOfNum.add(100);
        listOfNum.add(100);
        listOfNum.add(500);
        printListNumbers(listOfNum);




        printListNumbers(duplicate(listOfNum));
        System.out.println("---------------------------------");
        printListNumbers(arrayListRandom(20));

        ArrayList<String> stringNum=new ArrayList<>();
        stringNum.add("1");
        stringNum.add("100");
        stringNum.add("101");
        stringNum.add("500");
        System.out.println(toIntArr(stringNum));

        ArrayList<Integer> arrayList1234=new ArrayList<>();
        arrayList1234.add(1);
        arrayList1234.add(2);
        arrayList1234.add(3);
        arrayList1234.add(4);
        arrayList1234.add(5);
        arrayList1234.add(6);

        System.out.println(arrayListDondur(arrayList1234, 2));


    }

    //5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
    //bir ArrayListe atın ve
    //printListNumbers(listOfNums); methodu ile yazdıralım.

    public static void printListNumbers(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
    //sum(listOfNums); methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> arr){
        int sum=0;
        for (int i = 0; i < arr.size(); i++) {
            sum+=arr.get(i);
        }
        return sum;
    }
    //duplicate(listOfNums); methodu ile de değerleri dublicate
    //edip list i döndürelim.
    public static ArrayList<Integer> duplicate(ArrayList<Integer> arr){
        ArrayList<Integer> arrNew=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            arrNew.add(arr.get(i));
            arrNew.add(arr.get(i));
        }
        return arrNew;
    }
    //squared(listOfNums); methodu ile de değerleri kendi ile
    //çarpıp list i döndürün.
    public static ArrayList<Integer> squared(ArrayList<Integer> arr){
        ArrayList<Integer> arrNew=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            arrNew.add(arr.get(i)*arr.get(i));

        }
        return arrNew;
    }
    //ArrayList<Integer> myList = getList(20);//return method
    //System.out.println(myList);
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    public static ArrayList<Integer> siraliArrList(int size){
        ArrayList<Integer> arrNew=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrNew.add(i);
        }
        return arrNew;
    }
    //random(20); bir method oluşturup 20 size li 20 ye kadar random
    //rakamlardan oluşan bir ArrayList döndüren method oluşturalım.
    //Random class using example/Random class kullanım örneği
    //Random rm = new Random();
    //rm.nextInt(20)
    public static ArrayList<Integer> arrayListRandom(int size){
        ArrayList<Integer> arrNew=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            arrNew.add(random.nextInt(20));

        }
        return arrNew;
    }


    //"10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    //toIntList(stringNums); methodu Integer bir arrayList e convert edip
    //döndürelim.
    //stringNums isimli arrayList i
    //toIntArr(stringNums); methodu ile int bir array e convert edip
    //döndürelim.
    public static ArrayList<Integer> toIntArr(ArrayList<String> arr){
        ArrayList<Integer> newArr=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(Integer.parseInt(arr.get(i)));
        }
        return newArr;
    }

    public static ArrayList<Integer> arrayListDondur(ArrayList<Integer> arr, int num){


        for (int i = 0; i <arr.size() ; i++) {
          if(arr.size()>num) {
              arr.add(i, arr.get(num));
              arr.remove(num + 1);
              num++;
          }

        }

        return arr;
    }


}
