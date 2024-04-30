package com.vedant;
// odd series
public class OddSeries {
    public static void main(String[] args) {
        System.out.println(findfibowith5(6));
    }
    static int findfibowith5(int x){
        if(x<2){
            return x;
        }
        if(x%5 == 0){
            return 11;
        }

        return findfibowith5(x-1) + findfibowith5(x-2);
    }
}
