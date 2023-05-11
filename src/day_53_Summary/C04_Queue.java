package day_53_Summary;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C04_Queue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("harun");
        queue.add("Ayşe");
        queue.add("Ziya");
        queue.add("Umit");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
