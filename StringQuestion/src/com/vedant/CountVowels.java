package com.vedant;

public class CountVowels {
    public static void main(String[] args) {
        String a = "vedaniut is a boog bog golddigger";
        System.out.println(find(a));
    }

    static int  find(String a){
        char[] ch = a.toCharArray();
        int count = 0;
        for(int i=0 ; i<ch.length ; i++){
            if (ch[i] == 'a') {
                count = count +  1;
            }
            if (ch[i] == 'e') {
                count = count +  1;
            }
            if (ch[i] == 'i') {
                count = count +  1;
            }
            if (ch[i] == 'o') {
                count = count +  1;
            }
            if (ch[i] == 'u') {
                count = count +  1;
            }
        }
        return count;
    }
}
