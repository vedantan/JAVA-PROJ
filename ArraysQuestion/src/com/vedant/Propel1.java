package com.vedant;

import java.util.HashMap;

public class Propel1 {
    public static void main(String[] args) {
        String strInput = "2aabbcbbbadef";
        String result = longestSubstringWithKUniqueCharacters(strInput);
        System.out.println(result);
    }

    public static String longestSubstringWithKUniqueCharacters(String str) {
        int k = Character.getNumericValue(str.charAt(0));
        str = str.substring(1);

        if (k < 1 || k > 6) {
            return "Invalid value of k";
        }

        String longestSubstring = "";
        String currentSubstring = "";
        HashMap<Character, Integer> charCount = new HashMap<>();

        int start = 0;
        int end = 0;

        while (end < str.length()) {
            char currentChar = str.charAt(end);

            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
            currentSubstring += currentChar;

            while (charCount.size() > k) {
                char leftChar = str.charAt(start);
                charCount.put(leftChar, charCount.get(leftChar) - 1);

                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }

                currentSubstring = currentSubstring.substring(1);
                start++;
            }

            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring;
            }

            end++;
        }

        // Check if the final string is empty
        if (longestSubstring.isEmpty()) {
            return "EMPTY";
        }

        return longestSubstring;
    }

}


