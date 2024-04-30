package com.vedant;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[][] arr = {
                {9,12,3,5,4,7,},
                {45,29,37},
                {1,0},
        };

        for(int row = 0; row< arr.length; row++){
            for(int col =0 ; col< arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

}
