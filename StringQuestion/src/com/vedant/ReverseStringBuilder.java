package com.vedant;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String a = "vedant";

        StringBuilder str = new StringBuilder(a);
        str.reverse();
        System.out.println(str);

    }
}
