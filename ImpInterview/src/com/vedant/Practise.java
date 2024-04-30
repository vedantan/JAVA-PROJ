package com.vedant;
// LTI question
import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,1,2,9,10};
       int y =2;
       int z = 8;
       edit(arr,y,z);
    }

    static void edit(int[] arr , int y ,int z){
        float[] arr1 = new float[arr.length];
        int j=0;

        for (int i=0 ; i<arr.length ; i++){
            if(j<y){
                arr1[j] = (float)arr[i];
                j++;
                continue;

            }
            if(j>=y){
                if(j==y){
                    arr1[j] = z;
                    j++;
                }else{
                    arr1[j] = arr[i-1];
                    j++;
                }
            }

        }
        System.out.println(Arrays.toString(arr1));

        for (int i=0 ; i<arr1.length ;i++){
            for (int k=i+1 ; k<arr1.length ;k++){
                if(arr1[i] == arr1[k]){

                    System.out.println((float) arr1[k]);
//                    continue;
                }
            }

        }


    }




}
