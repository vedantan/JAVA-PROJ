package com.vedant;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        // stores data in Keys and Value
        // key can't be duplicate but value can be duplicate
        // unordered
        HashMap<String , Integer> map  = new HashMap<>();
        map.put("Mumbai" , 18);
        map.put("Delhi"  , 17);
        map.put("Cheenai"  , 11);
        map.put("Kolkata"  , 13);
        map.put("Mumbai" , 20);     // update the value of first occurance

        System.out.println("Size of the map is " + map.size());
        System.out.println(map);
        System.out.println(map.get("Mumbai")); // returns the value of key
        System.out.println(map.get("Pune"));    // if not present returns null

        // searching  return true or false
        System.out.println(map.containsKey("Delhi"));  // return true or false
        System.out.println(map.containsKey("pune"));
        System.out.println(map.containsValue(11));
        System.out.println(map.containsValue(21));

        System.out.println();

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("Cheenai");
        System.out.println(map);
    }
}
