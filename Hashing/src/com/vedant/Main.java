package com.vedant;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // unordered collection
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);   // will not store duplicate
        System.out.println(set);

        set.remove(4);
        System.out.println(set);

        if(set.contains(1)){
            System.out.println("Set contains 1");
        }else{
            System.out.println("Set doesn't contain 1");
        }

        System.out.println("Size of set is " + set.size());

        Iterator it = set.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }


}
