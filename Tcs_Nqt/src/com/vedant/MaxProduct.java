package com.vedant;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(find(arr));
        System.out.println(maxsubarray(arr));
    }

    // maximum sub array product
    static int find(int [] arr){
        int pro1 = arr[0];
        int pro2 = arr[0];
        int ans = arr[0];

        for (int i=1 ; i<arr.length ; i++){
            int temp = Math.max(arr[i] , Math.max(pro1*arr[i] , pro2*arr[i]));
            pro2 = Math.min(arr[i] , Math.min(pro1*arr[i] , pro2*arr[i]));
            pro1 = temp;
            ans = Math.max(ans,pro1);
        }
        return ans;
    }

    // maximum sub array sum
    static int maxsubarray(int[] arr){
        int maxsum=0;
        int currsum=0;
        for (int i=0 ; i<arr.length ;i++){
            currsum = currsum + arr[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
}
