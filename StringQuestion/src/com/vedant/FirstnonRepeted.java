package com.vedant;
// returns the first non repeated char
public class FirstnonRepeted {
    public static void main(String[] args) {
        String str = "prepinsta";

        System.out.println(find(str));
        non(str);
        System.out.println(nona(str));

    }
    static char find(String a){

        char[] c = a.toCharArray();
        for(char b : c){
            if(a.indexOf(b) == a.lastIndexOf(b)){
                return b;
            }
        }
        return 'O' ;
    }

    static int nona(String a){
        char [] c = a.toCharArray();
        for(char b : c){
            if(a.indexOf(b) == a.lastIndexOf(b)){
                return a.indexOf(b);
            }
        }
        return -1;
    }

    static void non(String str){
        char[] a =  str.toCharArray();
        boolean flag = true;
        for(char b : a ){
            if(str.indexOf(b) == str.lastIndexOf(b) ){
//                System.out.println(str.indexOf(b));
//                System.out.println(str.lastIndexOf(b));
                System.out.println("First non-repeating character is: "+ b);
                flag = false;
                return;
            }
        }
        if(flag)
            System.out.println("There is no non repeating character in input string");
    }
}


//   lastIndexOf() method returns the index (position) of the last occurrence of a specified value in a string.
//
//    The lastIndexOf() method searches the string from the end to the beginning.
//
//    The lastIndexOf() method returns the index from the beginning (position 0).
//
//    The lastIndexOf() method returns -1 if the value is not found.
//
//    The lastIndexOf() method is case sensitive.