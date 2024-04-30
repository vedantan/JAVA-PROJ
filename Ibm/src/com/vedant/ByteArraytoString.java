package com.vedant;

public class ByteArraytoString {
    public static void main(String[] args) {
        int[] arr = {71, 101, 101, 107, 115, 102, 111, 114, 103, 101, 101, 107, 115};
        convert(arr);
    }

    static void convert(int [] arr){
        int q = arr.length;
        String s = "";
        for (int i=0 ; i<arr.length ;i++){
            s=s+(char)arr[i];
        }
        System.out.println(s);
    }
}
