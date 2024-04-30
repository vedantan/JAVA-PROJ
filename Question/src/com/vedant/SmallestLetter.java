package com.vedant;
import java.util.Scanner;
public class SmallestLetter {
    public static void main(String[] args) {
//        Scanner in  = new Scanner(System.in);
        char [] letters ={'d','e','f','h','l'};
        char target = 'e';
        System.out.println(find(letters , target));
//        run on leetcode
    }
    static char find(char[] letters , char target){
        int start = 0;
        int end = letters.length - 1 ;
        int  mid = start + ((end - start)/ 2);
        while(start <= end){
            if(target < letters[mid]){
                end = mid -1 ;
            }else {
                start = mid +1 ;
            }
        }
        return letters[start % letters.length];
    }
}
