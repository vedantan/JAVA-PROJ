package com.vedant;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//	      Stack<Integer> stack = new Stack<>();
//
//          stack.push(4);
//          stack.push(5);
//          stack.push(6);
//          stack.push(8);
//          stack.push(0);
//          stack.push(13);
//          stack.pop();
//
//        System.out.println(stack.peek());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(9);
        queue.add(4);
        queue.add(6);
        queue.add(7);
        queue.add(8);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());



    }
}
