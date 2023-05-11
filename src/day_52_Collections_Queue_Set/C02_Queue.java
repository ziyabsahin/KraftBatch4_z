package day_52_Collections_Queue_Set;

import java.util.*;

public class C02_Queue {
    public static void main(String[] args) {
        Queue<Integer> priorityque=new PriorityQueue<>();
        priorityque.addAll(Arrays.asList(2,3,4,1,11,5,6,23,123,0,45));
        System.out.println(priorityque);
        //priorityque verileri giriş sırasına göre değil, karısık sıralar random olarak, index yok


        Queue<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(2,3,4,1,11,5,6,23,123,0,45));
        System.out.println(arrayDeque);
        //arraydeque verileri giriş sırasına göre sıralar, index yok
        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(2,3,4,1,11,5,6,23,123,0,45));
        System.out.println(linkedList);
        //linkedList Queue sınıfının child sınıfıdır

        System.out.println(priorityque.peek());
        System.out.println(priorityque.poll());
        System.out.println(priorityque.peek());

    }
}
