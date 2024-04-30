package com.vedant;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer> (10);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());
//        list.clear();
//        list.size();




        System.out.println(list);

    }
}



//    int length = 0;
//        if(length ==0){
//                return null;
//                }
//
//                ListNode  fast = head;
//                ListNode  slow = head;
//
//                while(fast != null && fast.next != null){
//                fast = fast.next.next;
//                slow = slow.next;
//
//                if(fast == slow){
//                ListNode temp = slow;
//
//                do{
//                temp = temp.next;
//                length++;
//
//                }while(temp!=slow);
//                }
//                return ;
//                }
//                return null;
//                }
