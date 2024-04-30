import java.util.HashMap;
import java.util.Map;

public class no15 {
    public static void main(String[] args) {
        System.out.println(countOccurances("vedantanilnaillawar"));

    }

//    static void countOccurances(String s){
//        HashMap<Character , Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length()-1; i++) {
//
//            if(map.containsKey(s.charAt(i))){
//                map.
//            }
//            map.put(s.charAt(i) , 1);
//
//        }
//    }

    static Map<Character, Integer> countOccurances(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int c = 0; c < s.length(); c++) {
            int count = 0;
            if (charMap.containsKey(s.charAt(c))) {
                count = charMap.get(s.charAt(c));
            }
            charMap.put(s.charAt(c), count + 1);
        }
        return charMap;
    }

}
