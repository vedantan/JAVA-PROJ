package com.vedant;
import java.util.ArrayList;

public class ArrayListmethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(15);
        list.add(18);
        list.add(21);
        list.add(31);
        list.add(91);


        System.out.println(list);

        list.add(2,0);
        System.out.println(list);





    }
}
