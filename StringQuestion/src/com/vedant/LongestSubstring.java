package com.vedant;

public class LongestSubstring {
    public static void main(String[] args) {
        String a = "vedantnadhgi";
        System.out.println(longsub(a));
    }
    static String longsub(String a) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < a.length(); i++) {
            int odd = expand(a, i, i);
            int even = expand(a, i, i + 1);
            int len = Math.max(odd, even);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return a.substring(start, end + 1);
    }
    static int expand(String a ,int left , int right) {
          while(left >=0 && right <a.length() && a.charAt(left) == a.charAt(right)){
              left--;
              right++;
          }
          return right-left-1;
    }
}