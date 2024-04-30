package com.vedant;
import java.math.BigInteger ;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
//
       int x = 15;
//       findoccurances(x);
//       find(15);
       find1(15);
    }

//    static void findoccurances(int x){
//        int count = 0;
//        int temp = x;
//        int digit = 0;
//        while (x>0){
//            digit = x%10;
//            count++;
//            x=x/10;
//        }
//
//        int ans = 0;
//        for (int i=1 ; i<=temp ; i++){
//            if(count%2 != 0){
//                ans++;
//            }
//        }
//        System.out.println(ans);
//    }
//
//     static void find(int x){
//        int count = 0;
//        for (int i=1 ; i<=x ; i++){
//            if(x%2 != 0 ){
//                count++;
//            }
//        }
//         System.out.println(count);
//     }

     static void find1(int x){
         int count = 0;
         int temp = x;
         int digit = 0;
         while (x>0){
             digit = x%10;
             count++;
             x=x/10;
         }
        int ans =0;
        for (int i=1 ; i<=x ; i++){
            while (count%2 != 0){
                ans++;
            }
        }
         System.out.println(ans);
     }


}












// Asci value of 0 = 47
// Asci value of 9 = 57
// Asci value of a = 96
// Asci value of z = 122
// Asci value of A = 65
// Asci value of z = 90
//Special Characters(32–47 / 58–64 / 91–96 / 123–126)







