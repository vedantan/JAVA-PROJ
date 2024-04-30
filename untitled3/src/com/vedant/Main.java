package com.vedant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = {5,6,7,9,1};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] nums){
        nums[1]=99;
    }

}
