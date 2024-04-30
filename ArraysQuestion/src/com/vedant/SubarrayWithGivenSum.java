package com.vedant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 15;
        find(arr,sum);
    }
    static void find(int[] arr, int sum) {
       int currsum = 0;
       int start = 0 ;
       int end = -1 ;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0 ; i < arr.length ; i++){
           currsum = currsum + arr[i];
           if(currsum == sum){
               start = 0;
               end = i;
               break;
           }
           if(map.containsKey(currsum - sum)){
//               start = arr[cursum-sum] + 1 ;
               start = map.get(currsum -sum)+1;
               end = i ;
               break;
           }
           map.put(currsum , i);
       }
       if(end == -1){
           System.out.println("not found");
       }else{
//           if want to return index number
           System.out.println(start + " " + end);
//           if want to return with no
           System.out.println(arr[start] + " " + arr[end]);
       }


    }
}