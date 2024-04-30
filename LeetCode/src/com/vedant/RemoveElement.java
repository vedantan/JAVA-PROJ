package com.vedant;
// leet code
// no 27
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,4,5,1,6,7,1};

        System.out.println(find(arr,1));

    }
    static int find(int[] arr ,int target){
        int count =0;
        for(int i=0 ; i< arr.length ; i++){
           if(target == arr[i]){
               continue;
           }
           arr[count] = arr[i];
           count++;
        }
        return count;
    }
}
//
//        int index = haystack.indexOf(needle);
//        if (index<0) {return 0;}
//        else {return haystack.substring(index);}



//   public int strStr(String haystack, String needle) {
//  int count=0;
//
//           if(haystack.contains(needle))
//            count=haystack.indexOf(needle);
//         else
//             count=-1;
//
//
//          return count;
//    }
//}``