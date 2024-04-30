package com.vedant;
//can be done by linear search
//find peak index in mountain array   or find peak element
//index value is return
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,8,6,4,2,0};
        System.out.println(find(arr));
    }
    static int find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
//                you are in decreasing part of array
//                this may be ans but look at left
                end = mid;
            } else {
//                you are in increasing part of array
                start = mid + 1;
            }
        }
//       in the end ,start == end and pointing to larger no
        return start;
    }
}