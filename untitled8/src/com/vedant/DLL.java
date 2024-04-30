package com.vedant;

public class DLL {
   private Node head;

    //insert at first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null ) {
            head.prev = node;
        }
        head = node;
    }


    //insert at last
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next =null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void insertAfter(int after , int val){
        Node p = find(after);
        if(p==null){
            System.out.println("Does not exixt");
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
             node.next.prev = node;
        }
    }

    // find the element
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;

            }
            node = node.next;
        }
        return null;
    }


    //display the list
    public void Display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in rev");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }












    private class Node{
         int val;
         Node next;
         Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
