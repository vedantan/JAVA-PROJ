package com.vedant;

import java.util.Arrays;

public class ApniKakshaProblem {
    public static void main(String[] args) {
        int[][] numbers = {   {1,2,3},
                              {6,5,4},
                              {9,8,7}
                           };
        int x = 5;
        System.out.println(Arrays.toString(find(numbers , x)));
    }

    static int[] find(int[][] arr , int x){
        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] == x){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
