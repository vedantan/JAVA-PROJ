package com.vedant;

import java.util.HashMap;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
//        int [] arr ={0,1,2,3,4,5};
        subarray(arr,5);
    }

    static void subarray(int[] arr , int sum){
      int currsum = 0;
      int start = 0 ;
      int end = -1;
//     HashMap<currsum  , i  > map = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ; i< arr.length ;i++){
          currsum = currsum+arr[i];

          if(currsum == sum){
              start = 0;
              end = i;
              break;
          }
          if(map.containsKey(currsum - sum)){
              start = map.get(currsum-sum) + 1;
              end = i;
              break;
          }
          map.put(currsum,i);
      }
      if(end == -1){
          System.out.println("Not found");
      }else{
          System.out.println(start + " " + end);
      }



    }
}
