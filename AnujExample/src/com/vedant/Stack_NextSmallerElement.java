package com.vedant;

import java.util.ArrayList;
import java.util.Stack;

public class Stack_NextSmallerElement {
    public static void main(String[] args) {
        int[] a = {4,10,5,18,3,12,7};
        nextsmaller(a);
    }
    static void nextsmaller(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=a.length-1 ; i>=0 ;i--){


            while (!s.isEmpty() && s.peek() >= a[i]) {
                    s.pop();
            }
            if (s.isEmpty()) {
                list.add(-1) ;
            } else {
                list.add( s.peek());
            }


            s.push(a[i]);


        }

        ArrayList<Integer> rev = new ArrayList<>();
        for(int i = list.size()-1 ; i>=0 ; i-- ){
            rev.add(list.get(i));
        }


        System.out.println(rev);


    }
}
