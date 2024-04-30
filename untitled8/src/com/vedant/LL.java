package com.vedant;

public class LL {

    private Node  head;
    private Node  tail;
    private int size ;

    public LL(){
        this.size =0;
    }

    //insert at the first place
    public void insertfirst(int val){
         Node node = new Node(val);
         node.next =head;
         head = node;

         if(tail == null){
             tail = head;
         }
         size = size +1;
    }

    //insert at nth index
    public void insertn(int val , int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertatlast(val);
            return;
        }
        Node temp = head;
        // if the index is 3 we have to go to 2
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;
    }




    // insertatlast
    public void insertatlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // delete the first
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = head;
        }
        size--;
        return val;
    }

    //deletelast
    public int deletelast(){
        if(size <= 1){
            return deletefirst();
        }

        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    //delete n index
    public int deleten( int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }

        //the index which we have to remove -1
        Node pre = get(index-1);
        int val = pre.next.value;

        pre.next = pre.next.next;

        return val;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;

            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i =0 ; i < index  ;i++){
            node = node.next;
        }
        return node;
    }


    // display function
    //print upto when head is equal to null
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }


    // Node consists of all the below
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
