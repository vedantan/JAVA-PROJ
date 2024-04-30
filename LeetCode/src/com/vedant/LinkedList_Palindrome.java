package com.vedant;

public class LinkedList_Palindrome {
    public static void main(String[] args) {
        System.out.println("heres the programme weather the linked list is palindrome or not");
    }
}

//
//    public boolean isPalindrome(ListNode head) {
//        if(head == null){
//            return true;
//        }
//
//        ListNode cur = head;
//        ListNode ser = mid(head);
//        ListNode last = rev(ser);
//
//        while(last != null){
//            if(last.val != cur.val){
//                return false;
//            }
//            last=last.next;
//            cur= cur.next;
//
//        }
//        return true;
//
//    }
//            public  ListNode mid(ListNode head){
//              ListNode fast = head;
//              ListNode slow = head;
//                   while (fast != null && fast.next != null){
//                       fast = fast.next.next;
//                       slow = slow.next;
//                   }
//              return slow ;
//                }
//
//    public  ListNode rev(ListNode head){
//        ListNode curr = head;
//        ListNode prev = null;
//        while(curr != null){
//            ListNode temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//    }