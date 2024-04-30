package com.vedant;

public class CycleDetection {

    public static void main(String[] args) {

    }





    private Node head;
    private Node tail;
    private int size;
    public CycleDetection(){
        this.size = 0;
    }

    private void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size =size+1;
    }

    private void insertlast(int val){
        if (tail == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node ;
        node = tail;
        size =size+1;

    }


    // is given lst cycle or not
    public boolean hascycle(ListNode head){
        ListNode  fast = head;
        ListNode  slow = head;

        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    // length of cycle
    public int  lengthcycle(ListNode head){
        ListNode  fast = head;
        ListNode  slow = head;

        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate the length
                ListNode temp = slow;
                int length =0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp!=slow);

                return length;
            }
        }
        return 0;
    }


    // from where the cycle start
    public ListNode detectcycle(ListNode head){
        int length =0 ;

        if(length == 0){
            return null;
        }
            ListNode  fast = head;
            ListNode  slow = head;

            while(fast != null && fast.next != null ){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    length = lengthcycle(slow);
                    break;
                }
            }

            // find the start node
        ListNode  f = head;
        ListNode  s = head;
        while (length >0 ){
            s= s.next;
            length -- ;
        }
        // keep moving  both forward and they will meet at cycle start
        while(f != s){
            f =f.next;
            s = s.next;
        }
        return s;

    }

    // is happy or not
    // sum of square of all digit is equal to 1
    public boolean ishappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));

        }while (fast!=slow);
        if(slow == 1){
            return true;
        }
        return false;
    }


    private int findsquare(int number){
        int ans =0 ;
        while (number>0){
            int rem = number % 10;
            ans = ans+ rem*rem;
            number = number/10;
        }
        return ans;
    }


    // find the middle element of ll
   public ListNode middle(ListNode head){
        ListNode s = head;
        ListNode f= head;

        while (f != null && f.next != null){
            s =s.next;
            f = f.next.next;
        }
        return s;
   }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }



    }

    private void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int  val;
        public Node(int val) {
            this.val = val;
        }
        private Node next;
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}

