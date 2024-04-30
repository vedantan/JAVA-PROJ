package com.vedant;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isvalid(s));
    }

    static boolean isvalid(String s){
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c : ch){
            if(c == '(' || c == '{' || c == '[' ){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                if(c==')' && st.peek() != '(') return false;
                if(c==']' && st.peek() != '[') return false;
                if(c=='}' && st.peek() != '{') return false;

                st.pop();
            }
        }
        return st.isEmpty();
    }
}
