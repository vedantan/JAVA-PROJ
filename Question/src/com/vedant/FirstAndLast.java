package com.vedant;

public class FirstAndLast {
    public static void main(String[] args) {
        int [] nums = {1,7,7,7,8,8,9,4};
        int target = 2;
        System.out.println(find(nums,target) );
//        run on leetcode

    }
    static int find(int[]nums  , int target) {
        int[] ans = {-1, -1};

        int start = search(nums , target , true);
        int end = search(nums , target , false);
         ans[0] = start;
         ans [1] = end;
        return search(nums,target ,true);

    }

    static int search(int [] nums , int target ,boolean findstartindex ){
        int ans = -1;
        int start = 0;
        int end = nums.length -1 ;
        while (start<=end){
            int mid = (start + (end-start) /2);
            if(target < nums[mid]){
                end = mid-1;
            }else if (target > nums[mid]){
                start = mid+ 1;
            }else{
               ans = mid ;
               if(findstartindex == true){
                   end = mid-1;
               }else{
                   start = mid+1 ;
               }
            }


        }
        return ans;
    }
}
