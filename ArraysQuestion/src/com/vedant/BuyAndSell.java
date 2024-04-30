package com.vedant;

public class BuyAndSell {
    public static void main(String[] args) {
       int[] a = {7,1,5,3,6,4};
        System.out.println(find(a));
        System.out.println(2/5);
    }


    static int find(int[] arr){
        int maxsum = 0;
        int curr = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            curr = Math.min(curr,arr[i]);
            int profit = arr[i] - curr;
            maxsum = Math.max(maxsum , profit);

        }
        return maxsum ;

    }




//    static int find(int[] a){
//      int maxsum = Integer.MIN_VALUE;
//      int curr = a[0];
//
//      for(int i=0 ; i<a.length ; i++){
//          curr = Math.min(curr , a[i]);
//          int profit = a[i] - curr;
//          maxsum = Math.max(profit , maxsum);
//
//      }
//
//      return maxsum;
//
//    }
}

// Asci value of 0 = 47
// Asci value of 9 = 57
// Asci value of a = 96
// Asci value of z = 122
// Asci value of A = 65
// Asci value of z = 90




