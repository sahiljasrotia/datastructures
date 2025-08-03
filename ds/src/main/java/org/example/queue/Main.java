package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //fifo
        //add-> add(e), offer(e)
        //remove-> remove(),poll()
        //examine -> element(), peek()
        //size(), isEmpty(), contains()

        Queue<String> queue = new LinkedList<>();

        queue.add("aaa");
        queue.add("bbb");
        queue.add("ccc");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());

        queue.poll();

        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.contains("ccc"));

    }
}
