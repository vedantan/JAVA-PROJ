package com.vedant;

public class RainWater {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(find(a));
    }
    static int find(int[] a){
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        left[0] = a[0];
        for(int i=1 ; i <a.length ;i++){
            left[i] = Math.max(left[i-1] ,a[i]);
        }
        right[a.length-1] = a[a.length-1];
        for(int i= a.length-2 ; i>=0 ; i--){
            right[i] = Math.max(right[i+1] , a[i]);
        }

        int count =0;
        for(int i=0 ; i<a.length ;i++){
            count = count + Math.min(left[i] , right[i]) - a[i];
        }
        return count;
    }
}
// += Math.max(0, Math.min((left[i]-height[i]), (right[i]-height[i])));