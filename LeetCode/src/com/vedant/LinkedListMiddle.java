package com.vedant;

public class LinkedListMiddle {
    public static void main(String[] args) {
        System.out.println("code for Middel of linked list");
    }
}


//    ListNode slow = head;
//    ListNode fast = head;
//
//             using fast and slow pointers
//             slow pointer incremented by 1 node
//             fast pointer incremented by 2 nodes
//             when the while loop breaks slow pointer will be middle node
//
//       while(fast != null && fast.next != null){
//                slow = slow.next;
//                fast = fast.next.next;
//                }
//
//                return slow;
//          }
//      }



//    ListNode res = new ListNode(Integer.MIN_VALUE);
//    ListNode reset = res;
//
//        while(list1 != null && list2 != null){
//                if(list1.val <= list2.val){
//                res.next = list1;
//                list1 = list1.next;
//                }
//                else{
//                res.next = list2;
//                list2 = list2.next;
//                }
//                res = res.next;}
//
//                if(list1!=null){
//                res.next = list1;
//                }
//
//                if(list2 != null){
//                res.next = list2;
//                }
//
//                return reset.next;
//
//
//                }