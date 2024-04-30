package com.vedant;

public class SearchinRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(find(arr,0));
    }
    static int find(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start)/2;

        while(start < end){
            if (target == arr[mid]){
                return mid;
            }

            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            else{
                if(target >= arr[mid] && target <= arr[end] ){
                    start = mid+1;
                }else{
                    end = mid-1;
                }

            }
        }
        return arr[start] == target ? start : -1 ;
    }
}
