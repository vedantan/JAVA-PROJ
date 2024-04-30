package com.vedant;
import java.util.Scanner;
class BinarySearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//                     0, 1, 2,3,4,5,6,7, 8 ,9, 10,11
        int [] arr = {-9,-5,-1,0,1,8,9,12,19,24,37,69};
        int target = in.nextInt();
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr , int target){
//        int end = arr.length -1 ;
        int start = 0;
        int end = arr.length -1 ;
        while (start<=end){
            int mid = start + ((end - start) / 2);
            if (target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid +1;
            }else{
                return  mid;
            }
        }
        return -1;

    }
}
