package com.vedant;
public class LL {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(3);
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(17);
        list.insertfirst(17);
        list.display();
        list.duplicate();
        list.display();


//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertatlast(1);
//        first.insertatlast(3);
//        first.insertatlast(5);
//
//        second.insertatlast(1);
//        second.insertatlast(2);
//        second.insertatlast(9);
//        second.insertatlast(14);
//
//        LL ans = LL.merge(first,second);
//        ans.display();

    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size = size + 1;
    }

    public void insertatlast(int val) {
        if (tail == null) {
            insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // remove duplicate from linked list
    public void duplicate() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }

        }
        tail = node;
        tail.next = null;
    }

    // merge linked list
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertatlast(f.value);
                f = f.next;
            } else {
                ans.insertatlast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertatlast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertatlast(s.value);
            s= s.next;
        }
        return ans;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }

    }
}
