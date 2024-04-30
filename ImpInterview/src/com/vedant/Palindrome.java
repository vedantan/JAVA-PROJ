package com.vedant;
//Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not. (gfg)
// Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.
public class Palindrome {
    public static void main(String[] args) {
        int n = 1321;
        System.out.println(pai(n));
        System.out.println(is(1321));
        print(1,100);


    }
      static String pai(int n){
        int a = n;
        if(n <= 9){
            return "given no is palindrome";
        }
        int pro = 0;
        if(n >= 10){
            while (n != 0) {
                int rem = n % 10;
                pro = pro * 10 + rem;
                n = n / 10;
            }
        }
        if(pro == a){
          return "given no is palindrome";
      }
        return "given no is not palindrome";
    }

    static boolean is(int x){
        int a = x;
        if(x < 10){
            return true;
        }
        int pro =0;
        if(x>=10){
            while (x>0){
                int rem = x%10;
                pro = pro*10 + rem;
                x=x/10;
            }
        }
        if(pro == a)return true;

        return false;
    }

    static void print(int min , int max){
        for (int i=min ; i<=max ; i++){
            if (is(i)){
                System.out.print(i + " ");
            }
        }
    }
}

