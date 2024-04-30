package com.vedant;

import java.util.Arrays;
import java.util.HashMap;

public class ReplacebyRank {
    public static void main(String[] args) {
        int[] arr ={20,15,26,2,98,6};
//        System.out.println(Arrays.toString(replace(arr)));
        replace(arr);
    }
    static void replace(int[] arr){
        HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
        int temp = 1;
        int n = arr.length;
        int brr[] = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }
        Arrays.sort(brr);
        for (int i = 0; i < n; i++) {
            //if element is previously not store in the map
            if (mp.get(brr[i]) == null) {
                mp.put(brr[i], temp);
                temp++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
    }
}


//    int[] ans = new int[arr.length];
//    int[] res = arr;
//    int j=0;
//        Arrays.sort(arr);
//                HashMap<Integer ,Integer> map = new HashMap<>();
//        for (int i=0 ; i<arr.length ; i++){
//        map.put(arr[i] , i+1);
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(res));
//        System.out.println(map);
//        for (int i=0 ; i<arr.length ;i++){
//        if(arr[i] == res[i]) {
//        ans[j] = map.get(arr[i]);
//        j++;
//        }
//        }
//        return ans;