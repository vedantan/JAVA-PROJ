package com.vedant;

public class StringLength {
    public static void main(String[] args) {
        String a = "   prepinsta   a   video    ";
        System.out.println(find(a));
    }
// find the words in string without spaces

    static int find(String a){
        int count = 0;
        String[] b = a.split(" ");
        for (int i=0 ; i<b.length ; i++){
            if(b[i].length() >= 1){
                count++;
            }
        }
        return count;
    }
}
