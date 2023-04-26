package day_34_Arrays_4;

public class C03_Reversed_Second_Word {
    public static void main(String[] args) {
       String sentence = "I Love Java";
        System.out.println(reversedSecondWord(sentence));


    }


/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
public static String reversedSecondWord(String str){
    String result="";
    String[] words = str.split(" ");
    String reversed="";

    for (int i = words[1].length()-1; i >=0; i--) {
        reversed+=words[1].charAt(i);

    }
    words[1]=reversed;
    for (String word : words) {
        result+=word+" ";
    }
    return result;

}

}
