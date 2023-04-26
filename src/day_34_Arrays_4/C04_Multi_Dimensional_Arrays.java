package day_34_Arrays_4;

import java.util.Arrays;

public class C04_Multi_Dimensional_Arrays {

    public static void main(String[] args) {

        String[][] groups=new String[3][3];

        //toString metodu sadece tek boyutlu arrayler için
        //burda yazdırmak için deepToString metodunu kullanıyoruz

        int[][] arr2D={{2,3,4},{1,2,5}};
        System.out.println(arr2D[1][2]);
        System.out.println(Arrays.deepToString(arr2D));


    }
}
