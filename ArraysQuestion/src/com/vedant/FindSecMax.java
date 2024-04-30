package com.vedant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSecMax {
    public static void main(String[] args) {
        int[] arr = {4,31,33,34,34};
        int[] Arr = {34,34,34,34,34};

        find(arr);
        find(Arr);
        System.out.println(find(arr));

    }
    static int find(int[] arr){
        int Fmax = Integer.MIN_VALUE;
        int Smax = Integer.MAX_VALUE;


        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > Fmax){
                Smax = Fmax;
                Fmax = arr[i];
            }else if (arr[i] > Smax && arr[i] != Fmax){
                Smax = arr[i];
            }
        }
        System.out.println(Smax);
        return Smax;



//     the time complexity for the set is O(log n)
//      Arrays.sort(arr);
//      Set<Integer> set = new HashSet<>();
//      for (int i=0 ; i< arr.length ; i++){
//          set.add(arr[i]);
//
//      }
//
//      System.out.println("The size of set is " + set.size());
//      if(set.size() == 1){
//          System.out.println(arr[set.size()]);
//      }else {
//          System.out.println(arr[set.size() - 2]);
//      }


    }
}
