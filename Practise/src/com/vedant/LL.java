package com.vedant;

import java.util.*;

//class Solution {
//    public static void main(String[] args) {
//
//    }
//
//
//}

public class LL{
    Node head;
    Node tail;
    int size;

    public LL(){
        this.size = 0;
    }


    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null ){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value +  "->" );
            temp = temp.next;
        }
        System.out.println("End");

    }
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value , Node next ){
        this.value = value;
        this.next = next;
    }
}