package com.vedant;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[arr.length-1]);
//        System.out.println(plusOne(arr));
    }

    static int[] plusOne(int[] digits) {
        int carry =0;
        int i = digits[digits.length -1];
            if(digits[i] == 9){
                digits[i] = 0;
                carry =1;
            }else{
                digits[i] = digits[i]+1;
            }

        return digits;
    }
}
