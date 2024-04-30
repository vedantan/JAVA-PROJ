package com.vedant;
// average mark of the array
public class AverageMark {
    public static void main(String[] args) {
        float [] a ={1.4f ,4.7f ,6f, 8.9f ,90f,54.6f ,35.3f ,68.7f};
        float sum = 0;
        for(float elements : a){
             sum = sum + elements;
        }
        System.out.println(" the average is  " + sum/ (a.length ) );
    }

}
