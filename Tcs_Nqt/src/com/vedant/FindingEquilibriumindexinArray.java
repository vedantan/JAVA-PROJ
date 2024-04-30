package com.vedant;

public class FindingEquilibriumindexinArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-1,8,4};
        System.out.println(find(arr));
    }

    static int find(int []arr ){
        int totalsum = 0;
        for (int i=0 ; i< arr.length ;i++){
            totalsum+= arr[i];
        }

        int leftsum=0 , rightsum = totalsum;
        for (int i=0 ; i<arr.length ;i++){
            rightsum -= arr[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum = leftsum+arr[i];
        }
        return -1;
    }
}

