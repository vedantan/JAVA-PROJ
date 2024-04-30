package com.vedant;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
      String s = "{([])()}";
        System.out.println(valid(s));
    }
    static boolean valid(String  s){
        Stack<Character> st = new Stack();
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c == '(' || c == '[' || c == '{'  ){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                if(c == ')' && st.peek() != '(') return false;
                if(c == ']' && st.peek() != '[') return false;
                if(c == '}' && st.peek() != '{') return false;


                st.pop();
            }
        }
        return st.isEmpty();

    }
}


// Asci value of 0 = 47
// Asci value of 9 = 57
// Asci value of a = 96
// Asci value of z = 122
// Asci value of A = 65
// Asci value of z = 90