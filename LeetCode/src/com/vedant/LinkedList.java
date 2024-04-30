package com.vedant;

public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Reverse the linked list");
    }
//    using recursion   1st method

//    if(head == null || head.next == null){
//            return head;
//        }
//         ListNode newhead = reverseList(head.next);
//         ListNode headnext = head.next;
//         headnext.next = head;
//         head.next = null;
//         return newhead;

//  simple method     2nd method

//    ListNode curr = head;
//    ListNode prev = null;
//        while(curr != null){
//        ListNode temp = curr.next;
//        curr.next = prev;
//        prev = curr;
//        curr = temp;
//    }
//         return prev;


}
