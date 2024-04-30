package com.vedant;
import java.util.HashMap;

public class FindAllRepeating {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        findrepeating(arr);
    }

    static void findrepeating(int[] arr){
        HashMap<Integer ,Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        System.out.println(map);

        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>1)
                System.out.print(entry.getKey()+" ");
        }
    }
}
