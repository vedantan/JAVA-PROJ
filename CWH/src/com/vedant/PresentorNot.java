package com.vedant;
// given no is present or not
public class PresentorNot {
    public static void main(String[] args) {
        int[] a ={1,2,3,7,5,4,9};
        int target = 17;


        boolean ispresent = false;
        for(int i=0 ; i < a.length ; i++){
           if(target == a[i]) {
                ispresent = true;
                break;
           }
       }
       if(ispresent){
           System.out.println("the value is present in array");
       }else{
           System.out.println("the value is not present in array");

       }
    }
}
