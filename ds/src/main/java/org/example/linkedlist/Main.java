package org.example.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //LinkedList can be used as stack and queue

        LinkedList<String> linkedList = new LinkedList<>();

        //as stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.pop();


        //as queue
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.add(4,"E");
        System.out.println(linkedList);
        linkedList.remove("E");



        System.out.println(linkedList);


    }
}
