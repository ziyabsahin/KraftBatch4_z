package HW;

import java.util.ArrayList;

public class HW12 {
    public static void main(String[] args) {
        //Create a list of unique elements taken from the user sort and print
        int[] uniqe={1,2,3,1,5,2,0,7,8,5,5,4,3,5,6,7,8,9};
        ArrayList<Integer> uniqeNew=new ArrayList<>();
        for (int i = 0; i < uniqe.length; i++) {
            for (int j = 0; j <=uniqeNew.size(); j++) {
                if(uniqe[i]!= uniqeNew.get(j)){
                    uniqeNew.add(uniqe[i]);
                    break;
                }
            }
        }
        System.out.println(uniqeNew);
        //Example
        //enter 10 integers: 1 8 9 2 6 6 1 3 5 5
        //your unique sorted elements: [1,2,3,5,6,8,9]
        //
        //enter 10 integers: 1 1 1 1 1 1 1 1 1 2
        //your unique sorted elements: [1,2]
        //
        //
        //Enter 5 String: Kraft Kraft Tech Tech Kraft
        //your unique sorted elements: [Kraft, Tech]
    }
}
