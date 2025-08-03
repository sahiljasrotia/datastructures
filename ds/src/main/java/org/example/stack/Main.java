package org.example.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack is a lifo
        //sort object in form of vertical tower
        //push() to add on top
        //pop() to remove from top
        Stack<String> stack = new Stack<>();
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("aaa"));
        

        stack.pop();

        System.out.println(stack.empty());
        System.out.println(stack);
    }
}
