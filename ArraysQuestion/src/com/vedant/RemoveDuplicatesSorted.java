package com.vedant;

// porblem no 26

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr  = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(find(arr));
    }

    static int find(int[] nums){

//        Set<Integer> set = new HashSet<>();
//        for(int i=0 ; i<nums.length ; i++){
//            set.add(nums[i]);
//        }
//
//        return set.size();

        int count =0;
        for(int i =0 ; i<nums.length ; i++){
            if(i<nums.length -1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
