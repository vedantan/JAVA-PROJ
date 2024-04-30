package com.vedant;

public class Container_MostWater {
    public static void main(String[] args) {
        int[] h ={1,8,6,2,5,4,8,3,7};
        System.out.println(find(h));


    }
    static int find(int[] h){
        int last = h.length-1;
        int start = 0;
        int water =0;
        int maxwater = 0;
        int minheight;

        for(int i=start ; start<last;){
            int left_height = h[start];
            int right_height = h[last];

            if(left_height > right_height){
                minheight = right_height;
            }else{
                minheight = left_height;
            }

            water = minheight*(last-start);
            if(water>maxwater){
                maxwater =water;
            }

            if(left_height > right_height){
                --last;
            }else{
                start++;
            }

        }
        return maxwater;
    }

}
