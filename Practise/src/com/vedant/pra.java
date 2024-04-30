package com.vedant;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class pra {

    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");



        map.remove(2);
        map.putIfAbsent(5,"five");

        for(Map.Entry m : map.entrySet() ){
            System.out.println(m.getKey() + " " + m.getValue());
        }


        System.out.println();
        System.out.println();
        HashMap<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(100,"This is new Hashmap");
        mp.putIfAbsent(2,"two");
        mp.putAll(map);

        for (Map.Entry x : mp.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }
}