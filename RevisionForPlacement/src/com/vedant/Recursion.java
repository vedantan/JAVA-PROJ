package com.vedant;

import java.util.ArrayList;

public class Recursion {
    public static void main(String[] args) {
        System.out.print("output for sum of n numbers:- ");
        System.out.println(sum(5));
        System.out.print("output for a to the power b:- ");
        System.out.println(apower(3,4));
        System.out.print("output for how many ways to go to end of matrix:- ");
        System.out.println(ways(3,3));
        System.out.println(way(" " ,3,3));
        System.out.print("output for josheph problem:- ");
        System.out.println(josheph(5,3));
        String str = "vedant";
        System.out.print("output for string palindrome:- ");
        System.out.println(ispalindrome(str , 0,str.length()-1));
        String str1 = "abc";
        String curr = " ";
        printsub(str1,0,curr);
        System.out.println();
        allpermutation(str1,0,str1.length()-1);

    }
//  sum of n numbers
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

//  a power of b
    static int apower(int a ,int b){
        if(b==0){
            return 1;
        }
        return a*apower(a,b-1);
    }

//  ways to go to end of matrix
    static int ways(int r , int c ){
        if(r==1 || c==1){
            return 1;
        }
        return ways(r ,c-1) + ways(r-1,c);
    }

    static ArrayList<String> way(String a , int r ,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(way(a + 'D' , r-1 , c));
        }
        if(c>1){
            ans.addAll(way(a + 'R' , r, c-1));
        }
        return ans;
    }

    static int josheph(int n , int k){
        if(n ==1){
            return 0;
        }

        return (josheph(n-1,k)+k) % n ;
    }

//  is palindrome or not
    static boolean ispalindrome(String str , int l , int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return ispalindrome(str,l+1,r-1);
    }

//  find all subsequence
    static void printsub(String str , int i , String curr){
        if(i == str.length()){
            System.out.print(curr +" ");
            return;
        }
        printsub(str,i+1,curr+str.charAt(i));
        printsub(str,i+1,curr);
    }

//  find all permutation
    static void allpermutation(String a , int l  , int r){
        if(r==l){
            System.out.print(a + " ");
            return;
        }
        for (int i=l ; i<=r ; i++){
            a =swap(a,l,i);
            allpermutation(a,l+1,r);
            a = swap(a,l,i);
        }
    }
    static String swap(String a , int p , int q){
        char[] str = a.toCharArray();
        char temp = str[p];
        str[p] = str[q];
        str[q] = temp;
        return new String(str);
    }


}
