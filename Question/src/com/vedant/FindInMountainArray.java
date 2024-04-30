package com.vedant;

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,3,1};
        int target = 5;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr , int target){
        int peak = find(arr);
        int firstTry = orderagnosticsbs(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderagnosticsbs(arr,target,peak+1, arr.length-1);
    }

    static int find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
//                you are in decreasing part of array
//                this may be ans but look at left
                end = mid;
            } else {
//                you are in increasing part of array
                start = mid + 1;
            }
        }
//       in the end ,start == end and pointing to larger no
        return start;
    }

    static int orderagnosticsbs(int [] arr , int target ,int start , int end){
//        int start =0 ;
//        int end = arr.length -1;
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
