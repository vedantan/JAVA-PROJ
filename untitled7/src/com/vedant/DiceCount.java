package com.vedant;

public class DiceCount {
    public static void main(String[] args) {
        System.out.println(dicecount("" ,4));

    }
    static int dicecount(String  p ,int target){
        if(target == 0){

            return 1;
        }
        int count = 0;
        for(int i =1 ; i<=6 && i<=target ; i++){
            count = count + dicecount(p+i , target-i);
        }
        return count;
    }
}
