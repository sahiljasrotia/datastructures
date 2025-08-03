package org.example.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //fifo but sorted by priority.

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("c");
        queue.offer("a");
        queue.offer("b");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
