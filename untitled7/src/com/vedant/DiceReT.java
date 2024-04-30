package com.vedant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DiceReT {
    public static void main(String[] args) {
        System.out.println(diceret("" , 4));

    }
    static ArrayList<String> diceret(String p ,int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i<=target ; i++){
            ans.addAll(diceret(p+i ,target-i));
        }
        return ans;
    }
}
