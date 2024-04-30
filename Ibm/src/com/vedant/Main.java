package com.vedant;

public class Main {

    public static void main(String[] args) {
        String s = "A1:D8";
        System.out.println(find(s));
    }

    static int find(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int pes =0,res=0;

        for (int a = 0; a < s.length(); a++) {
            if (s.charAt(a) >= 65 && s.charAt(a) <= 90) {
                int i = (int) s.charAt(a);
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }

            }
        }

        int res2 = Integer.MAX_VALUE;
        int res3 = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < res2 && s.charAt(i) != min && s.charAt(i) != max && s.charAt(i) != 58) {
                res2 = (int) s.charAt(i) - '0';
            }
            if (s.charAt(i) > res2 && s.charAt(i) != min && s.charAt(i) != max && s.charAt(i) != 58) {
                res3 = (int) s.charAt(i) - '0';
            }


        }
        System.out.println(min + " " + max);
        res = max - min + 1;
        pes = res3 - res2 +1;
        System.out.println(res);
        System.out.println(pes);
        return res * pes;
    }
}