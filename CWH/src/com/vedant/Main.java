package com.vedant;
// create a array of 5 floats and calculate their sum
public class Main {

    public static void main(String[] args) {
        float[] a = {1.2f ,5.8f ,5.9f ,98.7f ,34.8f };
        float ans =0;

        for(float elements : a){
            ans = ans + elements;
        }
        System.out.println(ans);
    }
}
