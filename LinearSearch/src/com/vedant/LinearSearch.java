package com.vedant;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2,1,9,8,3,8,47,58,95,34,45};
        int target = 45;
        System.out.println(LinearSearch(arr,target));
    }

    static boolean LinearSearch(int[] arr , int target){
        if(arr.length == 0){
            return false;
        }


        for (int i =0 ; i<arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return true;
            }

        }
        return false;
    }
}
