package day_34_Arrays_4;

public class C02_Reversed_Sentence {
/*
 Write a method that can reverse a sentence
 Ex:
 sentence = "Today is a perfect day to learn Java";

 output:
 Java learn to day perfect a is Today
 */
public static String reversedSentence(String str){
    String reversed="";
    String[] strArray=str.split(" ");
    for (int i = strArray.length - 1; i >= 0; i--) {
        reversed+=strArray[i]+" ";
    }
    return reversed;
}





}
