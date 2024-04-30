package com.vedant;
// maximum profit by taking stock only one time
// leet code no 121
public class Stock1 {
    public static void main(String[] args) {
        int [] arr = {6,2,7,3,4,9};
        System.out.println(profit(arr));
    }

    static int profit(int[] arr){
        int maxprofit = 0;
        int currprofit = arr[0];
        for(int i =1 ; i < arr.length ; i++) {
            currprofit = Math.min(currprofit , arr[i]);
            int profit = arr[i] - currprofit;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
