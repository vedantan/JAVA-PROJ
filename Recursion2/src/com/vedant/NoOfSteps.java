package com.vedant;
// return the no of steps to reduce the no to zero
public class NoOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(12));
    }
   static int steps(int num){
        return helper(num,0);
   }

   private static int helper(int num , int step){
        if(num == 0){
           return step;
        }
        if(num%2 == 0) {
            return helper(num/2 , step+1);
        }
        return helper(num-1 , step+1);

    }

}


//    int[] ans = {-1, -1};
//
//    int start = search(nums , target , true);
//    int end = search(nums , target , false);
//         ans[0] = start;
//                 ans [1] = end;
//                 return ans;

//                 }


//    static int search(int [] arr , int target ,boolean findstartindex ){
//        int ans = -1;
//        int start = 0;
//        int end = arr.length -1 ;
//        while (start<=end){
//            int mid = (start + (end-start) /2);
//            if(target < arr[mid]){
//                end = mid-1;
//            }else if (target > arr[mid]){
//                start = mid+ 1;
//            }else{
//                ans = mid ;
//                if(findstartindex == true){
//                    end = mid-1;
//                }else{
//                    start = mid+1 ;
//                }
//            }
//
//
//        }
//        return ans;