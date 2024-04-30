package com.vedant;
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-1,0,12,16,18,24,26,37,95,98,99};
        int[] arr = {99,89,74,65,56,46};
        int target = 46;
        System.out.println(orderagnosticsbs(arr,target));
    }
    static int orderagnosticsbs(int [] arr , int target){
        int start =0 ;
        int end = arr.length -1;
        boolean isAse = arr[start] < arr [end];
        while (start<end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]== target){
                return mid;
            }
            if(isAse){
                if (target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;

                }
            }
            else{
                if(target > arr[mid]){
                    end = mid -1;

                }else {
                    start = mid +1;

                }
            }
        }
        return -1;
    }
}
