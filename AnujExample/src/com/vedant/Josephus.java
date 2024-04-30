package com.vedant;
// ring of dead
public class Josephus {
    public static void main(String[] args) {
        System.out.println(jos(5,3));

        System.out.println(josheph(5,3));
    }
    // n is the total no of people in the ring
    // k is the distance , where to shot people
    static int jos(int n , int k){
        // the base condition will be , the only remaining person
        if(n == 1){
            // current index should be returned
            return 0;
        }
        return (jos(n-1 , k)+k ) % n ;
    }



    static int josheph(int n , int k){
        if(n==1){
            return 0;
        }
        return (josheph(n-1,k)+k) %n;
    }
}
