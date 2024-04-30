package com.vedant;
//index value is returned
public class SearchInRotated {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,9,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int search(int[] arr , int target){
        int pivot = findPivot(arr);

        if(pivot != -1){
            return binarysearch(arr,target,0, arr.length -1);
        }else if (arr[pivot] == target ){
            return pivot;
        }else if (target >= arr[0]){
            return binarysearch(arr,target,0,pivot-1);
        }else{
            return binarysearch(arr,target,pivot+1 , arr.length -1);
        }
    }

    static int binarysearch(int[] arr , int target ,int start , int end){
//        int end = arr.length -1 ;
//        int start = 0;
//        int end = arr.length -1 ;
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
//    this will not work in duplicate values
    static int findPivot(int[] arr ){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end - start)/2);
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if (mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }else if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
