package day_32_Arrays_2;

import java.util.Arrays;

public class C05_Example {
    public static void main(String[] args) {


        int arr1[] = new int[4];
        int arr2[] = new int[4];
        arr1[0] = 5;
        arr1[1] = 7;
        arr1[2] = 9;
        arr1[3] = 11;
        arr2[0] = 5;
        arr2[1] = 2;
        arr2[2] = 1;
        arr2[3] = 9;
        System.out.println(Arrays.toString(arrayBirlestir(arr1, arr2)));

        System.out.println(uzunluk(arr1));
    }

    public static boolean uzunluk(int array[]) {
        return array.length > 5;

    }

    public static boolean besVarmı(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5)
                return true;

        }
        return false;
    }

    public static boolean ilkElemanEsitmi(int arr[], int arr2[]) {
        return arr[0] == arr2[0];
    }

    public static double[] ilkElemanlarYeniArray(double arr[], double arr2[]) {
        double array[] = new double[2];
        array[0] = arr[0];
        array[1] = arr2[0];
        return array;
    }

    public static int ilkElemanlarYeniArray(int arr[], int arr2[]) {


        return arr[0] + arr2[0];
    }

    public static int arrayToplam(int[] arr) {
        int result = 0;
        for (int x : arr) {
            result += x;
        }
        return result;
    }

    public static int[] arrayToplamCarpim(int[] arr) {
        int[] a = new int[2];
        int result = 0;
        int result2 = 1;
        for (int x : arr) {
            result += x;
            result2 *= x;
        }

        a[0] = result;
        a[1] = result2;

        return a;

    }

    public static int[] arrayBirlestir(int[] arr1, int[] arr2) {
        int[] yeniArray = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0; i < yeniArray.length; i++) {
            if (i < arr1.length) {
                yeniArray[i] = arr1[i];
            } else {
                yeniArray[i] = arr2[j];
                j++;

            }

        }
        return yeniArray;
    }


    }


