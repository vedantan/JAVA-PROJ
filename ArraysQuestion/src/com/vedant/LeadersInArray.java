package com.vedant;
import java.util.*;
import java.util.ArrayList;

//https://www.youtube.com/watch?v=M0ffPDQ3cgY

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaderboard(arr));
    }
    static ArrayList<Integer> leaderboard(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();


        // 1st method

//        int maxEle = Integer.MIN_VALUE;
//        for (int i= arr.length -1 ; i>=0 ;i--){
//            if(arr[i] >= maxEle){
//                list.add(arr[i]);
//                maxEle = arr[i];
//            }
//        }
//        Collections.reverse(list);
//        return list;


        // 2nd method

        for (int i=0 ; i<arr.length-1 ; i++){
            for (int j=i+1 ; j<arr.length ;j++){
                if(arr[j] > arr[i]) {
                    break;
                }
                if( j == arr.length-1){
                    list.add(arr[i]);
                }
            }
        }
        list.add(arr[arr.length-1]);
        return list;


        // 3rd method
//        opp to leaders problem statement


//        list.add(arr[0]);
//        int max = arr[0];
//        for (int i=0 ; i<arr.length ;i++){
//            for (int j=i+1 ; j<arr.length ;j++){
//                if(arr[j] > max){
//                    list.add(arr[j]);
//                    max= arr[j];
//                    break;
//                }
//            }
//        }
//        System.out.println(max);
//        return list;
    }
}


